package com.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.domain.Config;

public interface ConfigRepository extends JpaRepository<Config, Integer> {

}
