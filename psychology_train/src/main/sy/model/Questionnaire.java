package sy.model;

import java.util.Date;

public class Questionnaire {
    private String qnaId;

    private String qnaName;

    private String userId;

    private Date createDatetime;

    private Date publishDatetime;

    private String qnaType;

    private String qnaStatus;

    public String getQnaId() {
        return qnaId;
    }

    public void setQnaId(String qnaId) {
        this.qnaId = qnaId == null ? null : qnaId.trim();
    }

    public String getQnaName() {
        return qnaName;
    }

    public void setQnaName(String qnaName) {
        this.qnaName = qnaName == null ? null : qnaName.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getPublishDatetime() {
        return publishDatetime;
    }

    public void setPublishDatetime(Date publishDatetime) {
        this.publishDatetime = publishDatetime;
    }

    public String getQnaType() {
        return qnaType;
    }

    public void setQnaType(String qnaType) {
        this.qnaType = qnaType == null ? null : qnaType.trim();
    }

    public String getQnaStatus() {
        return qnaStatus;
    }

    public void setQnaStatus(String qnaStatus) {
        this.qnaStatus = qnaStatus == null ? null : qnaStatus.trim();
    }
}