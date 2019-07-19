package com.topone.emptest.controller;

import com.topone.emptest.domain.Emp;
import com.topone.emptest.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("select")
    @ResponseBody
    public List<Emp> select(@RequestParam("ename") String ename){
        List<Emp> list = empService.select(ename);
         return list;
    }
}
