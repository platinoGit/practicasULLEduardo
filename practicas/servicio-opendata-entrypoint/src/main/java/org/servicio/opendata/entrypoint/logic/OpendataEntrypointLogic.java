package org.servicio.opendata.entrypoint.logic;

import java.util.logging.Logger;

import org.osgi.framework.FrameworkUtil;
import org.servicio.opendata.entrypoint.activation.Activator;

public class OpendataEntrypointLogic {
	private static final Logger log = Logger.getLogger(Activator.class.getCanonicalName());

	public OpendataEntrypointLogic() {
		log.info("Iniciando el OpendataEntrypointLogic...");
	}
	
	public String obtenerVersion() {
		return FrameworkUtil.getBundle(this.getClass()).getBundleContext().getBundle().getVersion().toString();	
		}
}
