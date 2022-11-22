package org.servicio.opendata.business.activation;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Activator implements BundleActivator, ServiceListener{
	private static final Logger log = Logger.getLogger(Activator.class.getCanonicalName());
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		context.addServiceListener(this);
		log.log(Level.INFO, "Starting servicio {0} en el contexto");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		context.removeServiceListener(this);
		log.log(Level.INFO, "Stop servicio {0} del contexto");
	}

	@Override
	public void serviceChanged(ServiceEvent event) {
		// TODO Auto-generated method stub
		String[] objectClass = (String[]) event.getServiceReference().getProperty("objectClass");
		
		if (event.getType() == ServiceEvent.REGISTERED) {
			log.log(Level.INFO, "Servicio del tipo: {0} registrado", objectClass[0]);
		} else if (event.getType() == ServiceEvent.UNREGISTERING) {
			log.log(Level.INFO, "Servicio del tipo: {0} no registrado", objectClass[0]);

		} else if (event.getType() == ServiceEvent.MODIFIED) {
			log.log(Level.INFO, "Servicio del tipo: {0} modificado", objectClass[0]);
		}
	}
}
