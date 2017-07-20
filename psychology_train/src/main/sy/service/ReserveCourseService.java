package sy.service;

import java.util.List;

import sy.model.Course;
import sy.model.ReserveCourse;


public interface ReserveCourseService {

	public ReserveCourse getReserveCourseId(String reserveCourseId);
	
	int insert(ReserveCourse reserveCourse);
	
	public List<ReserveCourse> getReserveCourse(ReserveCourse reserveCourse);
	
	public List<Course> getCourse(Course course);

}
