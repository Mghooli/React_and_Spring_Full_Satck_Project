package com.tap.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.fullstack.model.NameEntry;

public interface NameRepository extends JpaRepository<NameEntry, Long> {

}
