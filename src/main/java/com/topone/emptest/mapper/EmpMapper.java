package com.topone.emptest.mapper;

import com.topone.emptest.domain.Emp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMapper {

    public List<Emp> select(@Param("name")String name);
}
