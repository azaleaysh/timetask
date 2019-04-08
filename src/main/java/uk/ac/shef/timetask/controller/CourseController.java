package uk.ac.shef.timetask.controller;

import org.springframework.stereotype.Controller;
import uk.ac.shef.timetask.entity.JsonResult;
import uk.ac.shef.timetask.entity.TimeTaskCourse;
import uk.ac.shef.timetask.service.TimeTaskCourseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("course")
public class CourseController {
    @Resource
    private TimeTaskCourseService timeTaskCourseService;

    @GetMapping("selectOne")
    @ResponseBody
    public TimeTaskCourse selectOne(Integer id) {
        return this.timeTaskCourseService.queryById(id);
    }

    @GetMapping("add")
    public String add(){
        return "AddCourse";
    }

    @PostMapping("add")
    @ResponseBody
    public JsonResult addSave(TimeTaskCourse course){
        JsonResult result = new JsonResult();
        int res = timeTaskCourseService.insert(course);
        if (res > 0){
            result.setCode(200);
            result.setMsg("Add course success!");
        } else {
            result.setCode(-1);
            result.setMsg("Add course failed!");
        }
        return result;
    }

}