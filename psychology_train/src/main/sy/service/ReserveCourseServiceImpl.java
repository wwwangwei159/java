package sy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.CourseMapper;
import sy.dao.ReserveCourseMapper;
import sy.model.Course;
import sy.model.ReserveCourse;


@Service("reserveCourse")
public class ReserveCourseServiceImpl implements ReserveCourseService {

	private ReserveCourseMapper reserveCourseMapper;
	public ReserveCourseMapper getReserveCourseMapper() {
		return reserveCourseMapper;
	}
	
	@Autowired
	public void setReserveCourseMapper(ReserveCourseMapper reserveCourseMapper) {
		this.reserveCourseMapper = reserveCourseMapper;
	}
	
	private CourseMapper courseMapper;
	public CourseMapper getCourseMapper() {
		return courseMapper;
	}
	
	@Autowired
	public void setCourseMapper(CourseMapper courseMapper) {
		this.courseMapper = courseMapper;
	}
	
	public ReserveCourse getReserveCourseId(String reserveCourseId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(ReserveCourse reserveCourse) {
		// TODO Auto-generated method stub
		 int i = reserveCourseMapper.insert(reserveCourse);
		 return reserveCourseMapper.updateCourseByPrimaryKey(reserveCourse.getCourseId());
	}

	public List<ReserveCourse> getReserveCourse(ReserveCourse reserveCourse) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Course> getCourse(Course course) {
		// TODO Auto-generated method stub
		return courseMapper.selectCourse(course);
	}

}	
	