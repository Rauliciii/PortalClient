package com.brf.portalclient.raul.model;

/**
 * Local enum for {@link StadiuProcesual}.
 * 
 * @author Raul Bob
 *
 */
public enum ProcessStage {

    FOND("Fond"),
    APEL("Apel"),
    RECURS("Recurs"),
    RECURSINANULARE("Recursinanulare"),
    RECURSININTERESULLEGII("Recursininteresullegii"),
    SESIZAREPREALABILA("Sesizareprealabila"),
    CONTESTAŢIE_NCPP("Contesta\u0163ieNCPP"),
    RECURSINCASATIE("Recursincasatie"),
    CONTESTATIE_ICCJ("ContestatieICCJ"),
    CONTESTATIE_IN_ANULARE_NCPP("ContestatieInAnulareNCPP"),
    REVIZUIRE_CONTESTATIE_NCPP("RevizuireContestatieNCPP"),
    CONTESTATIE("Contestatie"),
    REVIZUIRE("Revizuire"),
    CONTESTATIEINANULARE("Contestatieinanulare"),
    STABILIREACOMPETENTEI("Stabilireacompetentei"),
    RECURSIMPOTRIVAINCHEIERII("Recursimpotrivaincheierii"),
    RECUZARE("Recuzare"),
    STRAMUTARE("Stramutare"),
    INDREPTAREEROAREMATERIALA("Indreptareeroaremateriala"),
    CONTESTATIEINANULARE_FOND("ContestatieinanulareFond"),
    CONTESTATIEINANULARE_APEL("ContestatieinanulareApel"),
    CONTESTATIEINANULARE_RECURS("ContestatieinanulareRecurs"),
    REVIZUIRE_FOND("RevizuireFond"),
    REVIZUIRE_APEL("RevizuireApel"),
    REVIZUIRE_RECURS("RevizuireRecurs");

	private final String value;

	ProcessStage(String v) {
		value = v;
	}

	public String getValue() {
		return value;
	}

	public static ProcessStage fromValue(String v) {
		for (ProcessStage c : ProcessStage.values()) {
			if (c.getValue().equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
