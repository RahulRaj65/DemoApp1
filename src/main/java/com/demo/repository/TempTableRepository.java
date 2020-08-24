package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.TempTableBean;

public interface TempTableRepository extends JpaRepository <TempTableBean,String>{

}
