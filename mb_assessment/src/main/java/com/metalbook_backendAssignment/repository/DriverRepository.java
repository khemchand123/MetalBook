package com.metalbook_backendAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metalbook_backendAssignment.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, String>{
}
