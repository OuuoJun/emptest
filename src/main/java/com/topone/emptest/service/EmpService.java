package com.topone.emptest.service;

import com.topone.emptest.domain.Emp;
import com.topone.emptest.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpMapper empMapper;

    public List<Emp> select(String ename){
        return empMapper.select(ename);
    }
}
