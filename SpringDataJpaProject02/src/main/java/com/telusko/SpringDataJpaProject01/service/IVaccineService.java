package com.telusko.SpringDataJpaProject01.service;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;

public interface IVaccineService {


    public String registerVaccineInfo(Vaccine vaccine);
    public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
    public Long getCount();
    public Boolean checkAvailability(Integer id);
    public Iterable<Vaccine> getAllVaccineInfo();
    public Iterable<Vaccine> getAllVaccineInfo(Iterable<Integer> vaccineIds);
    public Vaccine fetchVaccineByid(Integer id);
    public String deleteVaccineByid(Integer id);

}
