package com.telusko.SpringDataJpaProject01.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

//	@Query("FROM Vaccine WHERE vaccineCompany=:company")
//	public List<Vaccine> searchByVaccineCompany(String company);	
	
	@Query("FROM Vaccine WHERE vaccineCompany=:com")
	public List<Vaccine> searchByVaccineCompany(@Param("com") String company);
	
	@Query("FROM Vaccine WHERE vaccineCompany IN (:company1,:company2)")
	public List<Vaccine> searchByTwoVaccineCompany(String company1,String company2);
	
//	@Query("FROM Vaccine WHERE vaccineCompany IN (:c1,:c2)")
//	public List<Vaccine> searchByTwoVaccineCompany(@Param("c1") String company1,@Param("c2")String company2);
		
	@Query("FROM Vaccine WHERE vaccineCompany IN (:companies)")
	public List<Vaccine> searchByVaccineCompanies(String... companies);
	
//	@Query("SELECT vaccineName,vaccineCompany FROM Vaccine WHERE vaccineCost BETWEEN :minCost AND :maxCost")
//	public List<Object[]> searchByVaccinecostBetween(Double minCost,Double maxCost);
//	@Query("SELECT vaccineName,vaccineCompany FROM Vaccine WHERE vaccineCost BETWEEN :minCost AND :maxCost")
//	public List<String> searchByVaccinecostBetween(Double minCost,Double maxCost);
	@Query("SELECT vaccineName,vaccineCompany FROM Vaccine WHERE vaccineCost BETWEEN :minCost AND :maxCost")
	public List<List<String>> searchByVaccinecostBetween(Double minCost,Double maxCost);	
	
	@Transactional
	@Modifying
	@Query("UPDATE Vaccine SET vaccineCost=:newPrice Where vaccineName=:vaccName")
	public int updateVaccinePriceByVaccineName(String vaccName,Double newPrice);
	
	@Transactional
	@Modifying
	@Query("DELETE Vaccine Where vaccineCost BETWEEN :minCost AND :maxCost")
	public int deleteVaccineByVaccineCostRange(Double minCost,Double maxCost);
	
//	@Transactional
//	@Modifying
//	@Query(value="INSERT INTO vaccine_info() values(?,?,?,?)",nativeQuery = true)
//	public int insertVaccineDetailsBySql(Integer id, String vaccineName, Double vaccineCost, String vaccineCompany);
//	
	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO vaccine_info(vaccine_cost,vaccine_company,vaccine_name,id) values(?,?,?,?)",nativeQuery = true)
	public int insertVaccineDetailsBySql( Double vaccineCost, String vaccineCompany, String vaccineName,Integer id);
	
}
