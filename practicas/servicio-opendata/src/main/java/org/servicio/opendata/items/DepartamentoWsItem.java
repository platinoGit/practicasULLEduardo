package org.servicio.opendata.items;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartamentoWsItem", propOrder = {
    "id",
    "nombre",
    "codigo",
    "descripcion"
})
public class DepartamentoWsItem {
	
	private Integer id;
	private String nombre;
	private String codigo;
	private String descripcion;

	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer value) {
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
}
