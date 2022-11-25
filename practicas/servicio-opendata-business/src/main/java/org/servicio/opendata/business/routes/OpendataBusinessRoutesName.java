package org.servicio.opendata.business.routes;

public class OpendataBusinessRoutesName {
	public static final String OPENDATA_BEAN = "cxf:bean:opendata.cxf.ws";
	public static final String BUSINESS_ROUTE_ID = "opendata-business";
	public static final String BUSCAR_PROCEDIMIENTO = "bean:OpendataInterface?method=buscarProcedimientos";
	public static final String CREAR_PROCEDIMIENTO = "bean:OpendataInterface?method=crearProcedimientos";
	public static final String MODIFICAR_PROCEDIMIENTO = "bean:OpendataInterface?method=modificarProcedimientos";
	public static final String ELIMINAR_PROCEDIMIENTO = "bean:OpendataInterface?method=eliminarProcedimientos";
	public static final String OPERATION_SERVICE = "operationService";
	public static final String BUSINESS_ROUTE = "direct-vm:opendata-business";
	
	public static final String RUTA_BUSCAR_PROCEDIMIENTOS = "bean:opendataBusinessLogic?method=buscarProcedimientos";
	public static final String RUTA_CREAR_PROCEDIMIENTOS = "bean:opendataBusinessLogic?method=crearProcedimientos";
	public static final String RUTA_MODIFICAR_PROCEDIMIENTOS = "bean:opendataBusinessLogic?method=modificarProcedimientos";
	public static final String RUTA_ELIMINAR_PROCEDIMIENTOS = "bean:opendataBusinessLogic?method=eliminarProcedimientos";
}
