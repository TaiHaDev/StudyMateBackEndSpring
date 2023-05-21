package com.StudyMate.StudyMate;

public class Payment {
    private Integer id;
    private Integer userID;
    private String payment_type;
    private String payment_detail;

    public Payment() {
    }

    public Payment(Integer id, Integer userID, String payment_type, String payment_detail) {
        this.id = id;
        this.userID = userID;
        this.payment_type = payment_type;
        this.payment_detail = payment_detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getPayment_detail() {
        return payment_detail;
    }

    public void setPayment_detail(String payment_detail) {
        this.payment_detail = payment_detail;
    }
}
