package uk.ac.shef.timetask.service.impl;

import uk.ac.shef.timetask.entity.TimeTaskCourse;
import uk.ac.shef.timetask.mapper.TimeTaskCourseMapper;
import uk.ac.shef.timetask.service.TimeTaskCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("timeTaskCourseService")
public class TimeTaskCourseServiceImpl implements TimeTaskCourseService {
    @Resource
    private TimeTaskCourseMapper timeTaskCourseMapper;

    @Override
    public TimeTaskCourse queryById(Integer courseId) {
        return this.timeTaskCourseMapper.queryById(courseId);
    }

    @Override
    public List<TimeTaskCourse> queryAllByLimit(int offset, int limit) {
        return this.timeTaskCourseMapper.queryAllByLimit(offset, limit);
    }

    @Override
    public int insert(TimeTaskCourse timeTaskCourse) {
        return this.timeTaskCourseMapper.insert(timeTaskCourse);
    }

    @Override
    public int update(TimeTaskCourse timeTaskCourse) {
        return this.timeTaskCourseMapper.update(timeTaskCourse);
    }

    @Override
    public boolean deleteById(Integer courseId) {
        return this.timeTaskCourseMapper.deleteById(courseId) > 0;
    }
}