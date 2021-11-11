package com.brf.portalclient.raul.model;

/**
 * Local enum for {@link CategorieCaz}.
 * 
 * @author Raul Bob
 *
 */
public enum CaseCategory {

    PENAL("Penal"),
    CIVIL("Civil"),
    LITIGIICUPROFESIONISTII("Litigiicuprofesionistii"),
    CONTENCIOSADMINISTRATIVSIFISCAL("Contenciosadministrativsifiscal"),
    MINORISIFAMILIE("Minorisifamilie"),
    LITIGIIDEMUNCA("Litigiidemunca"),
    ALTEMATERII("Altematerii"),
    ASIGURARISOCIALE("Asigurarisociale"),
    FALIMENT("Faliment"),
    PROPRIETATE_INTELECTUALA("ProprietateIntelectuala"),
    DREPTMARITIMSIFLUVIAL("Dreptmaritimsifluvial");

	private final String value;

	CaseCategory(String v) {
		value = v;
	}

	public String getValue() {
		return value;
	}

	public static CaseCategory fromValue(String v) {
		for (CaseCategory value : CaseCategory.values()) {
			if (value.getValue().equals(v)) {
				return value;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
