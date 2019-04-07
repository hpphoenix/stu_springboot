package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import com.qf.service.IClassService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/class")
public class ClassController {

    @Reference
    private IClassService iClassService;

    @RequestMapping("/list")
    public String ClassList(Model model){
        List<Classes> classList = iClassService.queryAll();
        model.addAttribute("classList",classList);
        return "classList";
    }

    @RequestMapping("/add")
    public String addClass(Classes classes){
        //
        return "classlist";
    }
}
