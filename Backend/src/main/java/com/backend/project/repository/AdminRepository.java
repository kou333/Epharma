package com.backend.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.project.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

	Admin findByEmail(String email);

}
