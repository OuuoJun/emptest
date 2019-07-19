package com.topone.emptest.mapper;

import com.topone.emptest.domain.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMapper {

    public List<Emp> select(@Param("name")String name);
    //删除
    @Delete("DELETE FROM newemp WHERE empno=#{id}")
    public int  deletid(@Param("id") int id);
}
