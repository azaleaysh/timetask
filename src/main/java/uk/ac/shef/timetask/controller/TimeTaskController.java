package uk.ac.shef.timetask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    @GetMapping("logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie: cookies) {
            if ("tokenId".equals(cookie.getName())) {
                cookie.setValue(null);
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
        response.sendRedirect("/");
    }
}
