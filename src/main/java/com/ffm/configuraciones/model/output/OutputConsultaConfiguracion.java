package com.ffm.configuraciones.model.output;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutputConsultaConfiguracion extends OutputGeneral{
	private List<ConsultaConfiguracion> consultaConfiguracion;
}
