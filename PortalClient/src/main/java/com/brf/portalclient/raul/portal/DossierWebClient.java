package com.brf.portalclient.raul.portal;



import com.brf.portalclient.raul.exception.JustPortalException;
import com.brf.portalclient.raul.model.Dossier;

import java.util.List;


/**
 * Client that calls Court Cases Web Service Portal: http://portal.just.ro.
 *
 * @author Raul Bob
 *
 */
public interface DossierWebClient {

    /**
     * This method calls #portalquery.just.ro/CautareDosare web service method.
     */
    List<Dossier> getDossiers(String dossierNo) throws JustPortalException;

}
