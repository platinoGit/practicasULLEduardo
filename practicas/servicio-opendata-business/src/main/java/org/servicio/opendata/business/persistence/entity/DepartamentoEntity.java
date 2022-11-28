package org.servicio.opendata.business.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "DEPARTAMENTO")

public class DepartamentoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 75379208746845813L;

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
	private String nombre;
	@Column(nullable = false)
	private String codigo;
	@Column(nullable = true)
	private String descripcion;

	/*
	 * *************************************************************************
	 * *******************************************************
	 */
	/* Relaciones. */
	/*
	 * *************************************************************************
	 * *******************************************************
	 */
	
	@ManyToOne()
	@JoinColumn(name = "procedimiento", nullable = false, foreignKey  = @ForeignKey(name = "DEPARTAMENTO_2_PROC_FK")) 
	private ProcedimientoEntity procedimiento;
	
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
	
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String value) {
		this.nombre = value;
		
	}
	public String getCodigo() {
		return codigo;
		
	}
	public void setCodigo(String value) {
		this.codigo = value;
		
	}
	public String getDescripcion() {
		return descripcion;
		
	}
	public void setDescripcion(String value) {
		this.descripcion = value;
		
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
