package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.CritCIBean;


public interface CritCIRepository extends JpaRepository <CritCIBean,String>{

}
