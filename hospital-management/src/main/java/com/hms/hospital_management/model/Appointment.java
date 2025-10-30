package com.hms.hospital_management.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Document(collection = "appointments")
public class Appointment {
    @Id
    private String id;
    private String patientId;
    private String doctorId;
    private LocalDateTime appointmentDateTime;
    private String status; // SCHEDULED, COMPLETED, CANCELLED
    private String reason;
    private String notes;
}