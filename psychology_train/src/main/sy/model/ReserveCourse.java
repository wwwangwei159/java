package sy.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ReserveCourse {
    private String reserveId;

    private String reserveName;

    private String courseId;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")    
    private Date pointDatetime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")    
    private Date agreeDatetime;

    private String mobile;

    private String email;

    private String phone;

    private String status;

    public String getReserveId() {
        return reserveId;
    }

    public void setReserveId(String reserveId) {
        this.reserveId = reserveId == null ? null : reserveId.trim();
    }

    public String getReserveName() {
        return reserveName;
    }

    public void setReserveName(String reserveName) {
        this.reserveName = reserveName == null ? null : reserveName.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public Date getPointDatetime() {
        return pointDatetime;
    }

    public void setPointDatetime(Date pointDatetime) {
        this.pointDatetime = pointDatetime;
    }

    public Date getAgreeDatetime() {
        return agreeDatetime;
    }

    public void setAgreeDatetime(Date agreeDatetime) {
        this.agreeDatetime = agreeDatetime;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}