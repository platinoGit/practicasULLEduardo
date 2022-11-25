package org.servicio.opendata.business.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "PROCEDIMIENTO")

public class ProcedimientoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -355006280177091250L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/*
	 * *************************************************************************
	 * *******************************************************
	 */
	/* Propiedades(Columnas) de la entidad (base de datos). */
	/*
	 * *************************************************************************
	 * *******************************************************
	 */

	@Column(nullable = false)
	private String ambito;
	@Column(nullable = false)
	private Integer codigo;
	@Column(nullable = false)
	private Integer codigoSia;
	@Column(nullable = false)
	private String departamento;
	@Column(nullable = false)
	private String familia;
	@Column(nullable = false)
	private Date fecha_actualizacionSia;
	@Column(nullable = true)
	private Date fecha_fin;
	@Column(nullable = true)
	private Date fecha_inicio;
	@Column(nullable = false)
	private Date fecha_publicacion;
	@Column(nullable = false)
	private Date fecha_ultima_modificacion;
	@Column(nullable = false)
	private String inicio_tramite;
	@Column(nullable = false)
	private String nivel_administrativo;
	@Column(nullable = true)
	private String nombre_especifico;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = true)
	private String observaciones_plazo;
	@Column(nullable = false)
	private String ruta;
	@Column(nullable = false)
	private String tipo_actuacion;
	@Column(nullable = false)
	private String tipo_procedimiento;
	@Column(nullable = false)
	private String unidad_responsable;
	
	/*
	 * *************************************************************************
	 * *******************************************************
	 */
	/* Relaciones. */
	/*
	 * *************************************************************************
	 * *******************************************************
	 */
	
	
	/*
	 * *************************************************************************
	 * *******************************************************
	 */
	/* Metodos getter y setter de las propiedades. */
	/*
	 * *************************************************************************
	 * *******************************************************
	 */
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAmbito() {
		return ambito;
		
	}
	public void setAmbito(String ambito) {
		this.ambito = ambito;
		
	}
	public Integer getCodigo() {
		return codigo;
		
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
		
	}
	public Integer getCodigoSia() {
		return codigoSia;
		
	}
	public void setCodigoSia(Integer codigoSia) {
		this.codigoSia = codigoSia;
		
	}
	public String getDepartamento() {
		return departamento;
		
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
		
	}
	public String getFamilia() {
		return familia;
		
	}
	public void setFamilia(String familia) {
		this.familia = familia;
		
	}
	public Date gFecha_actualizacionSia() {
		return fecha_actualizacionSia;
		
	}
	public void setFecha_actualizacionSia(Date fecha_actualizacionSia) {
		this.fecha_actualizacionSia = fecha_actualizacionSia;
		
	}
	public Date getFecha_fin() {
		return fecha_fin;
		
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
		
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
		
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
		
	}
	public Date getFecha_publicacion() {
		return fecha_publicacion;
		
	}
	public void setFecha_publicacion(Date fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
		
	}
	public Date getFecha_ultima_modificacion() {
		return fecha_ultima_modificacion;
		
	}
	public void setFecha_ultima_modificacion(Date fecha_ultima_modificacion) {
		this.fecha_ultima_modificacion = fecha_ultima_modificacion;
		
	}
	public String getInicio_tramite() {
		return inicio_tramite;
		
	}
	public void setInicio_tramite(String inicio_tramite) {
		this.inicio_tramite = inicio_tramite;
		
	}
	public String getNivel_administrativo() {
		return nivel_administrativo;
		
	}
	public void setNivel_administrativo(String nivel_administrativo) {
		this.nivel_administrativo = nivel_administrativo;
		
	}
	public String getNombre_especifico() {
		return nombre_especifico;
		
	}
	public void setNombre_especifico(String nombre_especifico) {
		this.nombre_especifico = nombre_especifico;
		
	}
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	public String getObservaciones_plazo() {
		return observaciones_plazo;
		
	}
	public void setObservaciones_plazo(String observaciones_plazo) {
		this.observaciones_plazo = observaciones_plazo;
		
	}
	public String getRuta() {
		return ruta;
		
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
		
	}
	public String getTipo_actuacion() {
		return tipo_actuacion;
		
	}
	public void setTipo_actuacion(String tipo_actuacion) {
		this.tipo_actuacion = tipo_actuacion;
		
	}
	public String getTipo_procedimiento() {
		return tipo_procedimiento;
		
	}
	public void setTipo_procedimiento(String tipo_procedimiento) {
		this.tipo_procedimiento = tipo_procedimiento;
		
	}
	public String getUnidad_responsable() {
		return unidad_responsable;
		
	}
	public void setUnidad_responsable(String unidad_responsable) {
		this.unidad_responsable = unidad_responsable;
		
	}
	
	/* **************************************************** */
	/* Otros métodos. */
	/* **************************************************** */
	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode() + getId().hashCode();
	}
}
