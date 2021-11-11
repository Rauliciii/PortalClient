package com.brf.portalclient.raul.model;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Raul Bob
 */
public class Dossier extends AbstractEntity {

    private List<Side> sides;
    private List<Meeting> meetings;
    private List<WayOfAttack> waysOfAttack;
    private String number;
    private String oldNumber;
    private LocalDate date;
    private Court court;
    private String department;
    private CaseCategory caseCategory;
    private ProcessStage processStage;
    private String object;
    private LocalDate modificationDate;
    private String caseCategoryName;
    private String processStageName;

    public List<Side> getSides() {
        return sides;
    }

    public void setSides(List<Side> sides) {
        this.sides = sides;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }

    public List<WayOfAttack> getWaysOfAttack() {
        return waysOfAttack;
    }

    public void setWaysOfAttack(List<WayOfAttack> waysOfAttack) {
        this.waysOfAttack = waysOfAttack;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(String oldNumber) {
        this.oldNumber = oldNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public CaseCategory getCaseCategory() {
        return caseCategory;
    }

    public void setCaseCategory(CaseCategory caseCategory) {
        this.caseCategory = caseCategory;
    }

    public ProcessStage getProcessStage() {
        return processStage;
    }

    public void setProcessStage(ProcessStage processStage) {
        this.processStage = processStage;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public LocalDate getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getCaseCategoryName() {
        return caseCategoryName;
    }

    public void setCaseCategoryName(String caseCategoryName) {
        this.caseCategoryName = caseCategoryName;
    }

    public String getProcessStageName() {
        return processStageName;
    }

    public void setProcessStageName(String processStudyName) {
        this.processStageName = processStudyName;
    }

    @Override
    public String toString() {
        return "PortalDossier{" +
                "sides=" + sides +
                ", meetings=" + meetings +
                ", waysOfAttack=" + waysOfAttack +
                ", number='" + number + '\'' +
                ", oldNumber='" + oldNumber + '\'' +
                ", date=" + date +
                ", court=" + court +
                ", department='" + department + '\'' +
                ", caseCategory=" + caseCategory +
                ", processStage=" + processStage +
                ", object='" + object + '\'' +
                ", modificationDate=" + modificationDate +
                ", caseCategoryName='" + caseCategoryName + '\'' +
                ", processStageName='" + processStageName + '\'' +
                '}';
    }

}
