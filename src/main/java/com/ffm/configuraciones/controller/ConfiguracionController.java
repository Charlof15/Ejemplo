package com.ffm.configuraciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ffm.configuraciones.service.ConfiguracionService;

@RestController
public class ConfiguracionController  {

	@Autowired
	private ConfiguracionService configuracionService;

	@GetMapping(path = "/busqueda")
	public Object ConsultaConfiguraciones() {
		return configuracionService.ConsultaConfiguracion();
	}

	
}
