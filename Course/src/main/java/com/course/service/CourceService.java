package com.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.course.dto.CourceDTO;
import com.course.model.Cource;
import com.course.model.CourceMode;
import com.course.model.Role;

@Service
public interface CourceService {

	List<Cource> getAll();

	Cource getById(Long id);

	List<Cource> getByRole(Role role);

	List<Cource> getByMode(CourceMode courceMode);

	Cource saveCource(CourceDTO courceDTO);

	Cource updateCource(CourceDTO courceDTO, Long id);

	void deleteCource(Long id);
}
