package com;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="labour_details")
public class LabourDetails {
    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    @Id
    @PrimaryKeyJoinColumn
    private int p_id;

    @OneToOne(targetEntity = Patient.class,cascade = CascadeType.ALL)
    private Patient patient;

    @OneToMany
    @JoinColumn(name = "d_id")
    private List<Doctor> doctors;

    @OneToMany
    @JoinColumn(name = "s_id")
    private List<Staff> staff;

    private Date due_date;
    private String treatment_details;
    private String requirements;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public String getTreatment_details() {
        return treatment_details;
    }

    public void setTreatment_details(String treatment_details) {
        this.treatment_details = treatment_details;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }
}
