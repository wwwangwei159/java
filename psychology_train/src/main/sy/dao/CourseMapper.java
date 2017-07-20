package sy.dao;

import java.util.List;

import sy.model.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(String courseId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String courseId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
    
    List<Course> selectCourse(Course course);
}