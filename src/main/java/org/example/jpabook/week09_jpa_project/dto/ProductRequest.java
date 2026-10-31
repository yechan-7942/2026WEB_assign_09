package org.example.jpabook.week09_jpa_project.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record ProductRequest(
        @NotBlank @Size(max = 100) String name,
        @NotNull @PositiveOrZero Integer price,
        @Size(max = 50) String category,
        @NotNull @PositiveOrZero Integer stock,
        @Size(max = 1000) String description
) { }
