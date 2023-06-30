package com.example.taskview.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DtoUser(@NotBlank String use_name,@NotNull int use_student,@NotNull int use_matric,@NotNull String use_email,@NotNull String use_password) {

}
