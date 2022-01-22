package com.ffm.configuraciones.controller;

import org.springframework.http.ResponseEntity;

import com.ffm.configuraciones.utility.OpenApiConfig;
import com.totalplay.utils.arquetipo.output.Output;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@OpenApiConfig
public interface Documentacion {

	/****
	 * Ejemplo de la capa dedicada a documentación del API
	 ***/
	@Operation(summary = "Nombre del metodo",
	description = "Descripción general de lo que realiza el metodo",
	security = @SecurityRequirement(name = "Authorization"))
	@ApiResponse(responseCode = "200", description = "Información encontrada", content = @Content(schema = @Schema(implementation = Output.class)))
	public ResponseEntity<Object> geografiaGeneral();
}
