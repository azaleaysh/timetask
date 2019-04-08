package uk.ac.shef.timetask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TimeTaskController {
    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("timetable")
    public String timetable(){
        return "timetable";
    }

    @GetMapping("manage")
    public String manage(){
        return "TimetableManage";
    }
}
