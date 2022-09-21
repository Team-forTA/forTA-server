package com.forta.fortaserver.model.DB;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TeacherDTO {
    private Integer id;
    private String name;
    private String email;
    private String password;
}
