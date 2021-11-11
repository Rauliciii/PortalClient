package com.brf.portalclient.raul.portal;

import android.annotation.SuppressLint;

import com.brf.portalclient.raul.exception.JustPortalException;
import com.brf.portalclient.raul.model.Court;
import com.brf.portalclient.raul.model.Dossier;
import com.brf.portalclient.raul.model.Meeting;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DossierWebClientImpl implements DossierWebClient {

    public static final String URL = "http://portalquery.just.ro/query.asmx?WSDL";
    public static final String NAMESPACE = "portalquery.just.ro";
    public static final String METHOD = "CautareDosare";
    public static final String SOAP_ACTION = "portalquery.just.ro/CautareDosare";

    @Override
    public List<Dossier> getDossiers(String dossierNo) throws JustPortalException {
        return getDossiers(dossierNo, null, null, null, null, null);
    }

    private List<Dossier> getDossiers(String dossierNo, String dossierObject, String sideName, Court court,
                                      LocalDate startDate, LocalDate stopDate) throws JustPortalException {
        SoapObject request = new SoapObject(NAMESPACE, METHOD);
        request.addProperty("numarDosar", dossierNo);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(request);
        envelope.dotNet = true;

        try {
            HttpTransportSE transport = new HttpTransportSE(URL);
            transport.call(SOAP_ACTION, envelope);
            return soapResult((SoapObject) envelope.bodyIn);
        } catch (IOException | XmlPullParserException e) {
            e.printStackTrace();
            throw new JustPortalException(e.getMessage());
        }
    }

    public List<Dossier> soapResult(SoapObject response) {
        SoapObject dossierListObject = (SoapObject) response.getProperty(0);
        List<Dossier> list = new ArrayList<>();
        for (int i = 0; i < dossierListObject.getPropertyCount(); i++) {
            SoapObject dossierObject = (SoapObject) dossierListObject.getProperty(i);
            Dossier portalDossier = new Dossier();
            portalDossier.setCourt(Court.fromValue(dossierObject.getProperty("institutie").toString()));
            portalDossier.setNumber(dossierObject.getProperty("numar").toString());
            portalDossier.setMeetings(getMeetings((SoapObject) dossierObject.getProperty("sedinte")));
            list.add(portalDossier);
        }
        return list;
    }

    private List<Meeting> getMeetings(SoapObject meetingsObject) {
        List<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < meetingsObject.getPropertyCount(); i++) {
            SoapObject meetingObject = (SoapObject) meetingsObject.getProperty(i);

            Meeting meeting = new Meeting();
            meeting.setComplete(meetingObject.getProperty("complet").toString());
            meeting.setDate(getDate(meetingObject.getProperty("data").toString(), meetingObject.getProperty("ora").toString()));
            meetings.add(meeting);
        }
        return meetings;
    }

    @SuppressLint("NewApi")
    private LocalDateTime getDate(String date, String hour) {
        return LocalDateTime.parse(date).toLocalDate().atTime(LocalTime.parse(hour));
    }

}
