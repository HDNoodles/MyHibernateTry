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
<<<<<<< HEAD
    public void setCityHibernateDao(CityDao cityHibernateDao) {
        this.cityHibernateDao = cityHibernateDao;
=======
    public void setCityHibernateDao(CityDao cityDao) {
        this.cityDao = cityDao;
>>>>>>> 3414b9357de98e07e9f7a38ddcc06631525562ac
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
