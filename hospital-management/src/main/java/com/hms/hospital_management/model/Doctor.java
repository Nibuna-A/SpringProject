package com.hms.hospital_management.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "doctors")
public class Doctor {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String specialization;
    private String email;
    private String phone;
    private String department;
    private String qualification;
    private String experience;
    private boolean isAvailable;
}