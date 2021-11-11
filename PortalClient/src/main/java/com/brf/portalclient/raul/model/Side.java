package com.brf.portalclient.raul.model;

/**
 * POJO class for {@link DosarParte}.
 * 
 * @author Raul Bob
 *
 */
public class Side {

	private String name;
	private String attribute;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	@Override
	public String toString() {
		return "Side [name=" + name + ", attribute=" + attribute + "]";
	}

}
