package com.attraya.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attraya.model.Tourist;

public interface ITouristRepo extends JpaRepository<Tourist, Integer> {

}