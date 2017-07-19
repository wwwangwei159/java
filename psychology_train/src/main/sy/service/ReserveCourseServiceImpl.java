package sy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sy.dao.ReserveCourseMapper;
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
	public ReserveCourse getReserveCourseId(String reserveCourseId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(ReserveCourse reserveCourse) {
		// TODO Auto-generated method stub
		return reserveCourseMapper.insert(reserveCourse);
	}

	public List<ReserveCourse> getReserveCourse(ReserveCourse reserveCourse) {
		// TODO Auto-generated method stub
		return null;
	}

}	
	