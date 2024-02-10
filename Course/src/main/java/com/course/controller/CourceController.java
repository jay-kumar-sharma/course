package com.course.controller;

import java.util.List;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.dto.CourceDTO;
import com.course.model.Cource;
import com.course.model.Role;
import com.course.service.CourceService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("cource")
@RequiredArgsConstructor
public class CourceController {

	private final CourceService courceService;

	@GetMapping
	public List<Cource> getAllCource() {
		return courceService.getAll();
	}

	@GetMapping("get/{role}")
	public List<Cource> getById(@PathVariable Role role) {
		return courceService.getByRole(role);
	}

	@PostMapping("create")
	public Cource addCource(@Valid @RequestBody CourceDTO dto) throws MethodArgumentNotValidException {
		return courceService.saveCource(dto);
	}

	@PostMapping("update/{id}")
	public Cource updateCource(@Valid @RequestBody CourceDTO courceDTO, @PathVariable Long id)
			throws MethodArgumentNotValidException {
		return courceService.updateCource(courceDTO, id);
	}

}
