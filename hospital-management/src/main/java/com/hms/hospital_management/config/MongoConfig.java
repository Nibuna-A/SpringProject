package com.hms.hospital_management.config;

import com.hms.hospital_management.model.Doctor;
import com.hms.hospital_management.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.Index;
import org.springframework.data.mongodb.core.index.IndexOperations;
import jakarta.annotation.PostConstruct;

@Configuration
public class MongoConfig {

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostConstruct
    public void initIndexes() {
        // Patient indexes
        IndexOperations patientIndexOps = mongoTemplate.indexOps(Patient.class);
        patientIndexOps.createIndex(new Index().on("email", Sort.Direction.ASC).unique());
        patientIndexOps.createIndex(new Index().on("phone", Sort.Direction.ASC));

        // Doctor indexes
        IndexOperations doctorIndexOps = mongoTemplate.indexOps(Doctor.class);
        doctorIndexOps.createIndex(new Index().on("email", Sort.Direction.ASC).unique());
        doctorIndexOps.createIndex(new Index().on("specialization", Sort.Direction.ASC));
        doctorIndexOps.createIndex(new Index().on("department", Sort.Direction.ASC));
    }
}