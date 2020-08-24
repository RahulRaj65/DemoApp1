package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.FinalCertBean;


public interface FinalCertRepository extends JpaRepository <FinalCertBean,List>{

}