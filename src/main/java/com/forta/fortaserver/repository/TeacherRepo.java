package com.forta.fortaserver.repository;

import com.forta.fortaserver.model.DB.StudentDTO;
import com.forta.fortaserver.model.DB.TeacherDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TeacherRepo {
    public TeacherDTO findById(@Param("id") Integer id);
}
