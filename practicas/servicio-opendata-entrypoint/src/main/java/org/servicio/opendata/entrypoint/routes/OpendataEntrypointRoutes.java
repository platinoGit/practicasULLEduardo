package org.servicio.opendata.entrypoint.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;

public class OpendataEntrypointRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from(OpendataEntrypointRoutesName.OPENDATA_BEAN).routeId(OpendataEntrypointRoutesName.ENTRYPOINT_ROUTE_ID)
			.doTry()
			.choice()
			
			//Get version
			.when(header(CxfConstants.OPERATION_NAME).isEqualTo(OpendataEntrypointRoutesName.GET_VERSION))
			.to(OpendataEntrypointRoutesName.RUTA_LOGIC_GET_VERSION)
		
			//Buscar procedimiento
			.when(header(CxfConstants.OPERATION_NAME).isEqualTo(OpendataEntrypointRoutesName.BUSCAR_PROCEDIMIENTO))
			.setHeader(OpendataEntrypointRoutesName.OPERATION_SERVICE).constant(OpendataEntrypointRoutesName.BUSCAR_PROCEDIMIENTO)
			.to(OpendataEntrypointRoutesName.BUSINESS_ROUTE)
			
			//Crear procedimiento
			.when(header(CxfConstants.OPERATION_NAME).isEqualTo(OpendataEntrypointRoutesName.CREAR_PROCEDIMIENTO))
			.setHeader(OpendataEntrypointRoutesName.OPERATION_SERVICE).constant(OpendataEntrypointRoutesName.CREAR_PROCEDIMIENTO)
			.to(OpendataEntrypointRoutesName.BUSINESS_ROUTE)
			
			//Modificar procedimiento
			.when(header(CxfConstants.OPERATION_NAME).isEqualTo(OpendataEntrypointRoutesName.MODIFICAR_PROCEDIMIENTO))
			.setHeader(OpendataEntrypointRoutesName.OPERATION_SERVICE).constant(OpendataEntrypointRoutesName.MODIFICAR_PROCEDIMIENTO)
			.to(OpendataEntrypointRoutesName.BUSINESS_ROUTE)
			
			//Eliminar procedimiento
			.when(header(CxfConstants.OPERATION_NAME).isEqualTo(OpendataEntrypointRoutesName.ELIMINAR_PROCEDIMIENTO))
			.setHeader(OpendataEntrypointRoutesName.OPERATION_SERVICE).constant(OpendataEntrypointRoutesName.ELIMINAR_PROCEDIMIENTO)
			.to(OpendataEntrypointRoutesName.BUSINESS_ROUTE)
		
			.otherwise()
			.log(LoggingLevel.ERROR, "La operación :${header.operationName}, no se puede realizar")
			.endDoTry()
			.removeHeader("*")
			.doCatch(Exception.class);
		}
	
}
