package org.servicio.opendata.items;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmbitoItem", propOrder = {
    "atributo",
})

public class AmbitoItem {
	private String atributo;
	
	public String getAmbitoItem() {
		return atributo;
	}
	
	public void setAmbitoItem(String value) {
		this.atributo = value;
	}
}
