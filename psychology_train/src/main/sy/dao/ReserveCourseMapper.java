package sy.dao;

import sy.model.ReserveCourse;

public interface ReserveCourseMapper {
    int deleteByPrimaryKey(String reserveId);

    int insert(ReserveCourse record);

    int insertSelective(ReserveCourse record);

    ReserveCourse selectByPrimaryKey(String reserveId);

    int updateByPrimaryKeySelective(ReserveCourse reserveCourse);

    int updateByPrimaryKey(ReserveCourse reserveCourse);
    
    int updateCourseByPrimaryKey(String courseId);
}