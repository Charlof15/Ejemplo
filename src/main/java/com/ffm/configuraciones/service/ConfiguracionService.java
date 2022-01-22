package com.ffm.configuraciones.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ffm.configuraciones.component.Variables;
import com.ffm.configuraciones.mapper.ConfiguracionMapper;
import com.ffm.configuraciones.model.output.ConsultaConfiguracion;

@Service
public class ConfiguracionService {
	
	@Autowired
	public Variables var;
	
	@Autowired
	public ConfiguracionMapper configuracionMapper;
	
	public Object ConsultaConfiguracion() {
		List<Map<String, ConsultaConfiguracion>> config = configuracionMapper.consultaConfiguracion(var.getDetalleJWT().getIdPropietario(),var.getDetalleJWT().getIdUnidadNegocio());	
		return config;
	}
	
}
