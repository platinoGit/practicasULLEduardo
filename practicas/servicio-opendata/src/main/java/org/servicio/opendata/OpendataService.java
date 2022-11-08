package org.servicio.opendata;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.servicio.opendata.items.ProcedimientoWsItem;

public interface OpendataService {
	@WebMethod
	@WebResult(name = "procedimientos")
	public ProcedimientoWsItem[] buscarProcedimientos();
}
