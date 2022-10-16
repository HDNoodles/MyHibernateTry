package com.example.hibernateworld.service;

import com.example.hibernateworld.dao.CityDao;
import com.example.hibernateworld.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CityService {

    private CityDao cityDao;

    @Autowired
    @Qualifier("cityDao")
    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Transactional
    public City getCityById(Integer id) {
        return cityDao.getCityById(id);
    }

    @Transactional
    public List<City> getAllCities() {
        return cityDao.getAllCities();
    }
}
