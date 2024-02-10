package com.course.dto;

import com.course.model.CourceMode;
import com.course.model.CourceType;
import com.course.model.Role;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CourceDTO {

	@NotBlank(message = "Cource name can not be empty")
	private String name;

	@NotBlank(message = "Cource subject can not be empty")
	private String subject;

	@Min(value = 1, message = "Chapter must be atleast one")
	private int chapters;

	@Min(value = 1, message = " Classes must be atleast one")
	private int totalClasses;

	@NotNull(message = "Cource type not be null")
	private CourceType type;

	@NotNull(message = "cousce mode not be null")
	private CourceMode mode;
	@NotNull(message = "cource role not be null")
	private Role role;

}
