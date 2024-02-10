package com.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.model.Cource;
import com.course.model.CourceMode;
import com.course.model.Role;

@Repository
public interface CourceRepository extends JpaRepository<Cource, Long> {

	List<Cource> findByRole(Role role);

	List<Cource> findByMode(CourceMode mode);
}
