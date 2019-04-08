package uk.ac.shef.timetask.service;

import uk.ac.shef.timetask.entity.TimeTaskCourse;
import java.util.List;

public interface TimeTaskCourseService {

    TimeTaskCourse queryById(Integer courseId);

    List<TimeTaskCourse> queryAllByLimit(int offset, int limit);

    int insert(TimeTaskCourse timeTaskCourse);

    int update(TimeTaskCourse timeTaskCourse);

    boolean deleteById(Integer courseId);

}