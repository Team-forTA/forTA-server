package com.forta.fortaserver.repository;

import com.forta.fortaserver.model.DB.StudentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentRepo {
    public StudentDTO findById(@Param("id") Integer id);
}
