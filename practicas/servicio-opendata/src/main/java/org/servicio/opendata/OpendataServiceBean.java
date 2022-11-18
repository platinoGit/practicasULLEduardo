package org.servicio.opendata;

import javax.jws.WebMethod;

import org.servicio.opendata.items.ProcedimientoWsItem;


public class OpendataServiceBean implements OpendataService {
	@WebMethod
    @Override
	public ProcedimientoWsItem[] buscarProcedimientos(String codigoBusqueda) {
		return new ProcedimientoWsItem[0];
	}
	
	@WebMethod
    @Override
	public void crearProcedimiento() {
	}
	
	@WebMethod
    @Override
	public void modificarProcedimiento(String codigoBusqueda) {
	}
	
	@WebMethod
    @Override
	public void eliminarProcedimiento(String codigoBusqueda) {
	}
	
	@WebMethod
    @Override
	public String getVersion() {
        return null;
    }
}
