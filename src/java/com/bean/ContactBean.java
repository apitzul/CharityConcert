/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

/**
 *
 * @author azimd
 */
public class ContactBean implements java.io.Serializable {
    private String contactName;
    private String contactEmail;
    private String contactSubject;
    private String contactMessage;

    public ContactBean(String contactName, String contactEmail, String contactSubject, String contactMessage) {
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contactSubject = contactSubject;
        this.contactMessage = contactMessage;
    }
    
    public ContactBean() {
        
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactSubject() {
        return contactSubject;
    }

    public String getContactMessage() {
        return contactMessage;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setContactSubject(String contactSubject) {
        this.contactSubject = contactSubject;
    }

    public void setContactMessage(String contactMessage) {
        this.contactMessage = contactMessage;
    }
}
