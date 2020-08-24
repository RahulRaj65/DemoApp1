package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.MigrateBean;


public interface MigrateRepository extends JpaRepository <MigrateBean,String>{

}