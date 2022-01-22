package com.ffm.configuraciones.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ffm.configuraciones.model.output.ConsultaConfiguracion;

@Mapper
public interface ConfiguracionMapper {
	
	@MapKey("llave")
	public List<Map<String, ConsultaConfiguracion>> consultaConfiguracion(@Param(value = "idPropietario") int idPropietario,@Param(value = "idUnidadNegocio") int idUnidadNegocio);
	
}