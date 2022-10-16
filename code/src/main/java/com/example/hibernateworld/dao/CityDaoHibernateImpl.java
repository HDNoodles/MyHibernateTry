package com.example.hibernateworld.dao;

import com.example.hibernateworld.domain.City;
import com.example.hibernateworld.domain.CityHibernate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.stream.Collectors;

@Repository("cityDao")
public class CityDaoHibernateImpl extends AbstractHibernateDao<CityHibernate> implements CityDao {

    public CityDaoHibernateImpl() {
        setClazz(CityHibernate.class);
    }

    public City getCityById(Integer id) {
        return findById(id);
    }

    @Override
    public List<City> getAllCities() {
        List<CityHibernate> list = this.getAll();
        return list.stream().map(c -> (City) c).collect(Collectors.toList());
    }
}