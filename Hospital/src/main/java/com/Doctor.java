package com;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "doctor_details")
public class Doctor {
    @Id
    @PrimaryKeyJoinColumn
    private int doc_id;

    private String license_id;

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    private String dname;
    private int experience;
    private String specialiation;
    private String phone;
    private String type_of_emp;

    @OneToMany
    @JoinColumn(name = "s_id")
    private List<Staff> staff;

    @ManyToMany(targetEntity = Patient.class,cascade = CascadeType.ALL)
    @JoinTable(name = "doc_pat",
    joinColumns = {@JoinColumn(name = "doc_id")},inverseJoinColumns = {@JoinColumn(name = "p_id")})
    private List<Patient> patients;


    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public String getLicense_id() {
        return license_id;
    }

    public void setLicense_id(String license_id) {
        this.license_id = license_id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSpecialiation() {
        return specialiation;
    }

    public void setSpecialiation(String specialiation) {
        this.specialiation = specialiation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType_of_emp() {
        return type_of_emp;
    }

    public void setType_of_emp(String type_of_emp) {
        this.type_of_emp = type_of_emp;
    }
}
