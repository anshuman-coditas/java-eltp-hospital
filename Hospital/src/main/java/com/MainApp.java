package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();;
        Transaction transaction= session.beginTransaction();

Doctor doctor=new Doctor();
doctor.setDoc_id(101);
doctor.setDname("ak");
doctor.setExperience(12);
doctor.setType_of_emp("temporary");
doctor.setPhone("999999999");
doctor.setLicense_id("ABC123");
doctor.setSpecialiation("Oncology");
        Doctor doctor1=new Doctor();
        doctor.setDoc_id(102);
        doctor.setDname("ak");
        doctor.setExperience(12);
        doctor.setType_of_emp("temporary");
        doctor.setPhone("999999999");
        doctor.setLicense_id("ABC123");
        doctor.setSpecialiation("Oncology");
        Patient patient=new Patient();
        patient.setP_id(1011);
        patient.setPname("DK");
        patient.setProblems("cccc");
        patient.setBgrp("O+");
        patient.setPhone("9999999999999");
        Patient patient1=new Patient();
        patient.setP_id(1012);
        patient.setPname("DK");
        patient.setProblems("cccc");
        patient.setBgrp("O+");
        patient.setPhone("9999999999999");
        Staff staff=new Staff();
        staff.setStaff_id(302);
        staff.setSname("SK");
        staff.setPhone("9999999999999");
        staff.setExperience(2);
        staff.setQualification("Bsc");
        Staff staff1=new Staff();
        staff.setStaff_id(301);
        staff.setSname("SK");
        staff.setPhone("9999999999999");
        staff.setExperience(2);
        staff.setQualification("Bsc");
        List<Patient> patientList=new ArrayList<>();
        patientList.add(patient);
        patientList.add(patient1);
        List<Doctor> doctors=new ArrayList<>();
        doctors.add(doctor);
        doctors.add(doctor1);
        List<Staff> staffList=new ArrayList<>();
        staffList.add(staff);
        staffList.add(staff1);
        doctor.setStaff(staffList);
        doctor.setPatients(patientList);
        LabourDetails labourDetails=new LabourDetails();
        labourDetails.setDoctors(doctors);
        labourDetails.setPatient(patient);
        labourDetails.setP_id(10121);
        labourDetails.setTreatment_details("cc");
        labourDetails.setStaff(staffList);
        MonthlyDetails monthlyDetails=new MonthlyDetails();
        monthlyDetails.setLabourDetails(labourDetails);
        monthlyDetails.setMonth("January");
        ShiftDetails shiftDetails=new ShiftDetails();
        shiftDetails.setShift_id(2022);
        shiftDetails.setStaff(staffList);
        shiftDetails.setDoctors(doctors);
        session.save(doctor);
        session.save(doctor1);
        session.save(staff);
        session.save(staff1);
        session.save(patient);
        session.save(patient1);
        session.save(monthlyDetails);
        session.save(shiftDetails);
        session.save(labourDetails);
        transaction.commit();





    }
}
