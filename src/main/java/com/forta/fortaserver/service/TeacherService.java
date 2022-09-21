package com.forta.fortaserver.service;

import com.forta.fortaserver.model.DB.StudentDTO;
import com.forta.fortaserver.model.DB.TeacherDTO;
import com.forta.fortaserver.repository.StudentRepo;
import com.forta.fortaserver.repository.TeacherRepo;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private final TeacherRepo teacherRepo;

    public TeacherService(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    public TeacherDTO getUserById(Integer id) {
        return this.teacherRepo.findById(id);
    }
}
