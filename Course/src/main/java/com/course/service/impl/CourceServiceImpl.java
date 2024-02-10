package com.course.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.course.dto.CourceDTO;
import com.course.model.Cource;
import com.course.model.CourceMode;
import com.course.model.Role;
import com.course.repository.CourceRepository;
import com.course.service.CourceService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CourceServiceImpl implements CourceService {

	private final CourceRepository courceRepository;

	@Override
	public Cource saveCource(CourceDTO courceDTO) {
		Cource cource = new Cource(courceDTO);
		return courceRepository.save(cource);
	}

	@Override
	public Cource updateCource(CourceDTO courceDTO, Long id) {

		Cource byId = getById(id);
		if (byId == null)
			throw new RuntimeException("Cource not found with id : " + id);
		Cource cource = new Cource(courceDTO);
		cource.setId(id);
		return courceRepository.save(cource);
	}

	@Override
	public void deleteCource(Long id) {
		courceRepository.deleteById(id);
	}

	@Override
	public List<Cource> getAll() {
		return courceRepository.findAll();
	}

	@Override
	public Cource getById(Long id) {
		Optional<Cource> byId = courceRepository.findById(id);
		return byId.isPresent() ? byId.get() : null;
	}

	@Override
	public List<Cource> getByRole(Role role) {
		return courceRepository.findByRole(role);
	}

	@Override
	public List<Cource> getByMode(CourceMode courceMode) {
		return courceRepository.findByMode(courceMode);
	}
}
