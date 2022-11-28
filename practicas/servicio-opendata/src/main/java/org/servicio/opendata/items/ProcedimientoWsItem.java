package org.servicio.opendata.items;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedimientoWsItem", propOrder = {
		"ambito",
		"codigo",
		"codigoSia",
		"departamento",
		"familia",
		"fechaActualizacionSia",
		"fechaFin",
		"fechaInicio",
		"fechaPublicacion",
		"fechaUltimaModificacion",
		"inicioTramite",
		"nivelAdministrativo",
		"nombreEspecifico",
		"nombre",
		"observacionesPlazo",
		"ruta",
		"tipoActuacion",
		"tipoProcedimiento",
		"unidadResponsable"
})

public class ProcedimientoWsItem {
	private String ambito;
	private String codigo;
	private String codigoSia;
	private String familia;
	@XmlElement(name = "fecha_actualizacionSia")
	private Date fechaActualizacionSia;
	@XmlElement(name = "fechaFin")
	private Date fechaFin;
	@XmlElement(name = "fecha_inicio")
	private Date fechaInicio;
	@XmlElement(name = "fecha_publicacion")
	private Date fechaPublicacion;
	@XmlElement(name = "fecha_ultima_modificacion")
	private Date fechaUltimaModificacion;
	@XmlElement(name = "inicio_tramite")
	private String inicioTramite;
	@XmlElement(name = "nivel_administrativo")
	private String nivelAdministrativo;
	@XmlElement(name = "nombre_especifico")
	private String nombreEspecifico;
	private String nombre;
	@XmlElement(name = "observaciones_plazo")
	private String observacionesPlazo;
	private String ruta;
	@XmlElement(name = "tipo_actuacion")
	private String tipoActuacion;
	@XmlElement(name = "tipo_procedimiento")
	private String tipoProcedimiento;
	private List<DepartamentoWsItem> departamento; 
	@XmlElement(name = "unidad_responsable")
	private List<UnidadResponsableWsItem> unidadResponsable;
	
	public Date getFechaActualizacionSia() {
		return fechaActualizacionSia;
	}
	public void setFechaActualizacionSia(Date fechaActualizacionSia) {
		this.fechaActualizacionSia = fechaActualizacionSia;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public Date getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}
	public String getInicioTramite() {
		return inicioTramite;
	}
	public void setInicioTramite(String inicioTramite) {
		this.inicioTramite = inicioTramite;
	}
	public String getNivelAdministrativo() {
		return nivelAdministrativo;
	}
	public void setNivelAdministrativo(String nivelAdministrativo) {
		this.nivelAdministrativo = nivelAdministrativo;
	}
	public String getNombreEspecifico() {
		return nombreEspecifico;
	}
	public void setNombreEspecifico(String nombreEspecifico) {
		this.nombreEspecifico = nombreEspecifico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacionesPlazo() {
		return observacionesPlazo;
	}
	public void setObservacionesPlazo(String observacionesPlazo) {
		this.observacionesPlazo = observacionesPlazo;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getTipoActuacion() {
		return tipoActuacion;
	}
	public void setTipoActuacion(String tipoActuacion) {
		this.tipoActuacion = tipoActuacion;
	}
	public String getTipoProcedimiento() {
		return tipoProcedimiento;
	}
	public void setTipoProcedimiento(String tipoProcedimiento) {
		this.tipoProcedimiento = tipoProcedimiento;
	}
	public String getAmbito() {
		return ambito;
	}
	public void setAmbito(String ambito) {
		this.ambito = ambito;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodigoSia() {
		return codigoSia;
	}
	public void setCodigoSia(String codigoSia) {
		this.codigoSia = codigoSia;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	public List<DepartamentoWsItem> getDepartamento() {
		return departamento;
	}
	public void setDepartamento(List<DepartamentoWsItem> departamento) {
		this.departamento = departamento;
	}
	public List<UnidadResponsableWsItem> getUnidadResponsable() {
		return unidadResponsable;
	}
	public void setUnidadResponsable(List<UnidadResponsableWsItem> unidadResponsable) {
		this.unidadResponsable = unidadResponsable;
	}
}
                                   