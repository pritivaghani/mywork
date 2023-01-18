package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.emp;

public interface emprepo extends JpaRepository<emp, Integer>
{

}
