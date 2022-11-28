package org.servicio.opendata;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.servicio.opendata.items.ProcedimientoWsItem;

@WebService(
		targetNamespace = "http://opendata.canarias.es/servicios/opendata",
		name = "OpendataServiceBean",
		portName = "OpendataService",
		serviceName = "OpendataService"
		)
public interface OpendataService {
	
	@WebMethod
	@WebResult(name = "Procedimientos")
	public ProcedimientoWsItem[] buscarProcedimientos(String codigoBusqueda);
	
	@WebMethod
	@WebResult(name = "Crear")
	public void crearProcedimiento();
	
	@WebMethod
	@WebResult(name = "Modificar")
	public void modificarProcedimiento(String codigoBusqueda);
	
	@WebMethod
	@WebResult(name = "Eliminar")
	public void eliminarProcedimiento(String codigoBusqueda);
	
	@WebMethod
	@WebResult(name = "Version")
	public String getVersion();
}
