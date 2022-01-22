package com.ffm.configuraciones.model.output;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsultaConfiguracion {

	private int idTipoConfiguracion;
	private String tipoConfiguracion;
	private int idConfigGeneral;
	private String llave;
	private String valor;
	private String fechaCreacion;
}
