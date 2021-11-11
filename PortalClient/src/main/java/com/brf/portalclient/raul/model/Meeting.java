package com.brf.portalclient.raul.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Raul Bob
 */
public class Meeting {

    private String complete;
    private LocalDateTime date;
    private String solution;
    private String solutionSummary;
    private LocalDate pronouncementDate;
    private MeetingDocument document;
    private String documentNo;
    private LocalDate documentDate;

    private String warnings;
    private String observations;

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getSolutionSummary() {
        return solutionSummary;
    }

    public void setSolutionSummary(String solutionSummary) {
        this.solutionSummary = solutionSummary;
    }

    public LocalDate getPronouncementDate() {
        return pronouncementDate;
    }

    public void setPronouncementDate(LocalDate pronouncementDate) {
        this.pronouncementDate = pronouncementDate;
    }

    public MeetingDocument getMeetingDocument() {
        return document;
    }

    public void setMeetingDocument(MeetingDocument meetingDocument) {
        this.document = meetingDocument;
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Meeting [complete=" + complete + ", date=" + date + ", solution=" + solution
                + ", solutionSummary=" + solutionSummary + ", pronouncementDate=" + pronouncementDate + ", document="
                + document + ", documentNo=" + documentNo + ", documentDate=" + documentDate + ", warnings=" + warnings
                + ", observations=" + observations + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meeting meeting = (Meeting) o;
        return Objects.equals(complete, meeting.complete) && Objects.equals(date, meeting.date) && Objects.equals(solution, meeting.solution) && Objects.equals(solutionSummary, meeting.solutionSummary) && Objects.equals(pronouncementDate, meeting.pronouncementDate) && document == meeting.document && Objects.equals(documentNo, meeting.documentNo) && Objects.equals(documentDate, meeting.documentDate) && Objects.equals(warnings, meeting.warnings) && Objects.equals(observations, meeting.observations);
    }

}
