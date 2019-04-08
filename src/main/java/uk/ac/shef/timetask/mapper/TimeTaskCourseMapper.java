package uk.ac.shef.timetask.mapper;

import uk.ac.shef.timetask.entity.TimeTaskCourse;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface TimeTaskCourseMapper {

    TimeTaskCourse queryById(Integer courseId);

    List<TimeTaskCourse> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<TimeTaskCourse> queryAll(TimeTaskCourse timeTaskCourse);

    int insert(TimeTaskCourse timeTaskCourse);

    int update(TimeTaskCourse timeTaskCourse);

    int deleteById(Integer courseId);

}