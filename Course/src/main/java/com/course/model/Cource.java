package com.course.model;

import com.course.dto.CourceDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cource {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String subject;

	private int chapters;

	private int totalClasses;

	@Enumerated(EnumType.STRING)
	private CourceType type;

	@Enumerated(EnumType.STRING)
	private CourceMode mode;

	@Enumerated(EnumType.STRING)
	private Role role;

	public Cource() {
	}

	public Cource(CourceDTO courceDTO) {

		this.name = courceDTO.getName();
		this.subject = courceDTO.getSubject();
		this.chapters = courceDTO.getChapters();
		this.totalClasses = courceDTO.getTotalClasses();
		this.type = courceDTO.getType();
		this.mode = courceDTO.getMode();
		this.role = courceDTO.getRole();
	}
}
