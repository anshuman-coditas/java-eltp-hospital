package com;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "monthly_details")
public class MonthlyDetails {
    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public LabourDetails getLabourDetails() {
        return labourDetails;
    }

    public void setLabourDetails(LabourDetails labourDetails) {
        this.labourDetails = labourDetails;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getFollow_up() {
        return follow_up;
    }

    public void setFollow_up(Date follow_up) {
        this.follow_up = follow_up;
    }

    @Id
    private int p_id;

    @OneToOne(targetEntity = LabourDetails.class,cascade = CascadeType.ALL)
    private LabourDetails labourDetails;

    private String month;
    private String details;
    private Date follow_up;


}

