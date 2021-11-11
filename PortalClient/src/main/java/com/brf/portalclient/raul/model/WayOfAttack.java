package com.brf.portalclient.raul.model;

import java.time.LocalDate;

/**
 * POJO class for {@link DosarCaleAtac}.
 * 
 * @author Raul Bob
 *
 */
public class WayOfAttack {

	private LocalDate declarationDate;
	private String declaringSide;
	private String type;

	public LocalDate getDeclarationDate() {
		return declarationDate;
	}

	public void setDeclarationDate(LocalDate declarationDate) {
		this.declarationDate = declarationDate;
	}

	public String getDeclaringSide() {
		return declaringSide;
	}

	public void setDeclaringSide(String declaringSide) {
		this.declaringSide = declaringSide;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
