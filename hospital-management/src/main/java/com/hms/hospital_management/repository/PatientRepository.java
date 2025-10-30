package com.hms.hospital_management.repository;

import com.hms.hospital_management.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, String> {
    Patient findByEmail(String email);
}