package org.servicio.opendata.business.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private String codigo;
	@Column(nullable = false)
	private String codigoSia;
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
	
	/*
	 * *************************************************************************
	 * *******************************************************
	 */
	/* Relaciones. */
	/*
	 * *************************************************************************
	 * *******************************************************
	 */
	
	@OneToMany(mappedBy = "procedimiento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DepartamentoEntity> departamento;
	
	
	
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
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getAmbito() {
		return ambito;
		
	}
	public void setAmbito(String value) {
		this.ambito = value;
		
	}
	public String getCodigo() {
		return codigo;
		
	}
	public void setCodigo(String value) {
		this.codigo = value;
		
	}
	public String getCodigoSia() {
		return codigoSia;
		
	}
	public void setCodigoSia(String value) {
		this.codigoSia = value;
		
	}
	public String getFamilia() {
		return familia;
		
	}
	public void setFamilia(String value) {
		this.familia = value;
		
	}
	public Date gFecha_actualizacionSia() {
		return fecha_actualizacionSia;
		
	}
	public void setFecha_actualizacionSia(Date value) {
		this.fecha_actualizacionSia = value;
		
	}
	public Date getFecha_fin() {
		return fecha_fin;
		
	}
	public void setFecha_fin(Date value) {
		this.fecha_fin = value;
		
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
		
	}
	public void setFecha_inicio(Date value) {
		this.fecha_inicio = value;
		
	}
	public Date getFecha_publicacion() {
		return fecha_publicacion;
		
	}
	public void setFecha_publicacion(Date value) {
		this.fecha_publicacion = value;
		
	}
	public Date getFecha_ultima_modificacion() {
		return fecha_ultima_modificacion;
		
	}
	public void setFecha_ultima_modificacion(Date value) {
		this.fecha_ultima_modificacion = value;
		
	}
	public String getInicio_tramite() {
		return inicio_tramite;
		
	}
	public void setInicio_tramite(String value) {
		this.inicio_tramite = value;
		
	}
	public String getNivel_administrativo() {
		return nivel_administrativo;
		
	}
	public void setNivel_administrativo(String value) {
		this.nivel_administrativo = value;
		
	}
	public String getNombre_especifico() {
		return nombre_especifico;
		
	}
	public void setNombre_especifico(String value) {
		this.nombre_especifico = value;
		
	}
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String value) {
		this.nombre = value;
		
	}
	public String getObservaciones_plazo() {
		return observaciones_plazo;
		
	}
	public void setObservaciones_plazo(String value) {
		this.observaciones_plazo = value;
		
	}
	public String getRuta() {
		return ruta;
		
	}
	public void setRuta(String value) {
		this.ruta = value;
		
	}
	public String getTipo_actuacion() {
		return tipo_actuacion;
		
	}
	public void setTipo_actuacion(String value) {
		this.tipo_actuacion = value;
		
	}
	public String getTipo_procedimiento() {
		return tipo_procedimiento;
		
	}
	public void setTipo_procedimiento(String value) {
		this.tipo_procedimiento = value;
		
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
