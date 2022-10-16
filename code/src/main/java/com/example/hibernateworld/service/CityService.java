package com.example.hibernateworld.service;

import com.example.hibernateworld.dao.CityDao;
import com.example.hibernateworld.domain.City;
import com.example.hibernateworld.domain.CityHibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CityService {

    private CityDao cityHibernateDao;

    @Autowired
    @Qualifier("cityDao")
    public void setCityHibernateDao(CityDao cityHibernateDao) {
        this.cityHibernateDao = cityHibernateDao;
    }

    @Transactional
    public City getCityById(Integer id) {
        return cityHibernateDao.getCityById(id);
    }

    @Transactional
    public List<City> getAllCities() {
        return cityHibernateDao.getAllCities();
    }
}
