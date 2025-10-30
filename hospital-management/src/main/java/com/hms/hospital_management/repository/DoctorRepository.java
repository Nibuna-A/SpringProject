package com.hms.hospital_management.repository;

import com.hms.hospital_management.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface DoctorRepository extends MongoRepository<Doctor, String> {
    List<Doctor> findBySpecialization(String specialization);
    Doctor findByEmail(String email);
}