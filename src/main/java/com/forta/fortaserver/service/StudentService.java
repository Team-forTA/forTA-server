package com.forta.fortaserver.service;

import com.forta.fortaserver.model.DB.StudentDTO;
import com.forta.fortaserver.repository.StudentRepo;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public StudentDTO getUserById(Integer id) {
        return this.studentRepo.findById(id);
    }
}
