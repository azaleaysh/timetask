package uk.ac.shef.timetask.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TimeTaskCourse{
    private Integer courseId;
    
    private String courseName;
    
    private String location;
    
    private Integer dayOfWeek;

    @DateTimeFormat(pattern = "hh:mm")
    private Date startTime;

    @DateTimeFormat(pattern = "hh:mm")
    private Date endTime;

    // 0 - Every week  1 - only once
    private String times;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "TimeTaskCourse{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", location='" + location + '\'' +
                ", dayOfWeek=" + dayOfWeek +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", times='" + times + '\'' +
                '}';
    }
}