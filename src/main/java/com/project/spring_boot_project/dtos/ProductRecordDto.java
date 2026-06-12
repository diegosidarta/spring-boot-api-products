package com.project.spring_boot_project.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

// Não precisa por no parametro o Id do produto, pq na vida real o cliente só irá pedir nome e preço do produto.
//NotBlank Ele vai garantir que ninguém cadastre um produto sem nome, com o nome vazio ("") ou apenas cheio de espaços ("    ").
//@NotNull para um número (BigDecimal, Integer, Long), o único estado "vazio" possível na internet é o null. Por isso, o @NotNull

public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {
}
