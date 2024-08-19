package com.telusko.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.model.Tourist;
import com.telusko.service.IGreetingService;

@WebMvcTest(GreetingRestController.class)
public class GreetingRestControllerTest {

	@MockBean
	IGreetingService service;

	@Autowired
	MockMvc mockMvc;

	@Test
	@Disabled
	public void testgenerateGreetingUnit() throws Exception{

		//Mocking
		Mockito.when(service.generateGreeting()).thenReturn("Good Evening");

		//RequstObject
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/greet");
		ResultActions result = mockMvc.perform(requestBuilder);
		MvcResult mvcResult = result.andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		int status = response.getStatus();


		//Unit Testing Assertion
		assertEquals(201,status);
	}

	@Test
	public void testAddTourist() throws Exception {
		//Mocking
		Mockito.when(service.acceptTourist(ArgumentMatchers.any())).thenReturn(true);

		Tourist t=new Tourist(101,"ram","Bengaluru");
		ObjectMapper mapper=new ObjectMapper();
		String json = mapper.writeValueAsString(t);

		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/addTourist")
				                                    .contentType(MediaType.APPLICATION_JSON)
			                                    	.contentType(json);

		ResultActions result = mockMvc.perform(requestBuilder);
		MvcResult mvcResult = result.andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		int status = response.getStatus();

		//Unit Testing //assertions
		assertEquals(200, status);
	}


}
