package sy.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MessageLeave {
    private String messId;

    private String reserveName;

    private String userId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") 
    private Date leaveDatetime;

    private String message;

    private String mobile;

    private String email;

    private String phone;

    private String status;

    public String getMessId() {
        return messId;
    }

    public void setMessId(String messId) {
        this.messId = messId == null ? null : messId.trim();
    }

    public String getReserveName() {
        return reserveName;
    }

    public void setReserveName(String reserveName) {
        this.reserveName = reserveName == null ? null : reserveName.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getLeaveDatetime() {
        return leaveDatetime;
    }

    public void setLeaveDatetime(Date leaveDatetime) {
        this.leaveDatetime = leaveDatetime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
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