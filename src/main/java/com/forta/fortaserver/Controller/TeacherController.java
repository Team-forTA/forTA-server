package com.forta.fortaserver.Controller;

import com.forta.fortaserver.model.DB.StudentDTO;
import com.forta.fortaserver.model.DB.TeacherDTO;
import com.forta.fortaserver.service.StudentService;
import com.forta.fortaserver.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TeacherController {
    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teacher/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public TeacherDTO getTeacherInfo(@PathVariable("id") Integer id) {
        System.out.println(teacherService.getUserById(id));
        return teacherService.getUserById(id);
    }

    @PostMapping("/teacher/signup")
    public Integer teacherJoinActivity() {
        System.out.println("teacherJoinActivity");
        return 0;
    }
}
