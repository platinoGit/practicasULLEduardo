package org.servicio.opendata.entrypoint.routes;

public class OpendataEntrypointRoutesName {
	public static final String OPENDATA_BEAN = "cxf:bean:Opendata.cxf";
	public static final String ENTRYPOINT_ROUTE_ID = "Opendata_Entrypoint";
	public static final String RUTA_LOGIC_GET_VERSION = "bean:OpendataEntrypointLogic?method=obtenerVersion";
	public static final String BUSCAR_PROCEDIMIENTO = "bean:OpendataInterface?method=buscarProcedimientos";
	public static final String CREAR_PROCEDIMIENTO = "bean:OpendataInterface?method=crearProcedimientos";
	public static final String MODIFICAR_PROCEDIMIENTO = "bean:OpendataInterface?method=modificarProcedimientos";
	public static final String ELIMINAR_PROCEDIMIENTO = "bean:OpendataInterface?method=eliminarProcedimientos";
	public static final String BUSINESS_ROUTE = "direct-vm:Opendata-business";
	public static final String OPERATION_SERVICE = "operationService";
	public static final String GET_VERSION = "getVersion";
}
