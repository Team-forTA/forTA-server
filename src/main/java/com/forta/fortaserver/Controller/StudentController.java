package com.forta.fortaserver.Controller;

import com.forta.fortaserver.model.DB.StudentDTO;
import com.forta.fortaserver.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StudentDTO getStudentInfo(@PathVariable("id") Integer id) {
        System.out.println(studentService.getUserById(id));
        return studentService.getUserById(id);
    }

    @PostMapping("/signup")
    public Integer studentJoinActivity() {
        System.out.println("studentJoinActivity");
        return 0;
    }
}
