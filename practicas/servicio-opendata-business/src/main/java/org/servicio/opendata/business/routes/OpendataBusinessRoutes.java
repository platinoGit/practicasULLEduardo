package org.servicio.opendata.business.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;

public class OpendataBusinessRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from(OpendataBusinessRoutesName.BUSINESS_ROUTE).routeId(OpendataBusinessRoutesName.BUSINESS_ROUTE_ID)
		.doTry()
		.choice()
		
		//Buscar procedimiento
		.when(header(CxfConstants.OPERATION_NAME).isEqualTo(OpendataBusinessRoutesName.BUSCAR_PROCEDIMIENTO))
		.setHeader(OpendataBusinessRoutesName.OPERATION_SERVICE).constant(OpendataBusinessRoutesName.BUSCAR_PROCEDIMIENTO)
		.to(OpendataBusinessRoutesName.RUTA_BUSCAR_PROCEDIMIENTOS)
		
		//Crear procedimiento
		.when(header(CxfConstants.OPERATION_NAME).isEqualTo(OpendataBusinessRoutesName.CREAR_PROCEDIMIENTO))
		.setHeader(OpendataBusinessRoutesName.OPERATION_SERVICE).constant(OpendataBusinessRoutesName.CREAR_PROCEDIMIENTO)
		.to(OpendataBusinessRoutesName.RUTA_CREAR_PROCEDIMIENTOS)
				
		//Modificar procedimiento
		.when(header(CxfConstants.OPERATION_NAME).isEqualTo(OpendataBusinessRoutesName.MODIFICAR_PROCEDIMIENTO))
		.setHeader(OpendataBusinessRoutesName.OPERATION_SERVICE).constant(OpendataBusinessRoutesName.MODIFICAR_PROCEDIMIENTO)
		.to(OpendataBusinessRoutesName.RUTA_MODIFICAR_PROCEDIMIENTOS)
		
		//Eliminar procedimiento
		.when(header(CxfConstants.OPERATION_NAME).isEqualTo(OpendataBusinessRoutesName.ELIMINAR_PROCEDIMIENTO))
		.setHeader(OpendataBusinessRoutesName.OPERATION_SERVICE).constant(OpendataBusinessRoutesName.ELIMINAR_PROCEDIMIENTO)
		.to(OpendataBusinessRoutesName.RUTA_ELIMINAR_PROCEDIMIENTOS)
		
		.otherwise()
		.log(LoggingLevel.ERROR, "La operación :${header.operationName}, no se puede realizar")
		.endDoTry()
		.removeHeader("*")
		.doCatch(Exception.class);
		
	}

}
