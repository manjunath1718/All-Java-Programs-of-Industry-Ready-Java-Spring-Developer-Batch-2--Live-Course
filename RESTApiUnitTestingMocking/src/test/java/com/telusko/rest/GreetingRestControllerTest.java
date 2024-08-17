package com.telusko.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.telusko.service.IGreetingService;

@WebMvcTest(GreetingRestController.class)
public class GreetingRestControllerTest {

	@MockBean
	IGreetingService service;

	@Autowired
	MockMvc mockMvc;

	@Test
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
		assertEquals(200,status);
	}
}