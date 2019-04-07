package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import com.qf.entity.Stues;
import com.qf.service.IClassService;
import com.qf.service.IStuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {

    @Reference
    private IStuService iStuService;

    @Reference
    private IClassService iClassService;

    @RequestMapping("/list")
    public String stuList(Model model){
        List<Stues> stuesList = iStuService.queryAll();
        model.addAttribute("stuesList",stuesList);

        List<Classes> classesList = new ArrayList<>();
        for (Stues stu:stuesList){
            classesList.add(iClassService.queryById(stu.getClassid()));
        }
        model.addAttribute("classesList",classesList);
        return "stulist";
    }

}
