package sy.model;

public class Question {
    private String qId;

    private String qName;

    private String qType;

    private String qFactor;

    private String qStatus;

    public String getqId() {
        return qId;
    }

    public void setqId(String qId) {
        this.qId = qId == null ? null : qId.trim();
    }

    public String getqName() {
        return qName;
    }

    public void setqName(String qName) {
        this.qName = qName == null ? null : qName.trim();
    }

    public String getqType() {
        return qType;
    }

    public void setqType(String qType) {
        this.qType = qType == null ? null : qType.trim();
    }

    public String getqFactor() {
        return qFactor;
    }

    public void setqFactor(String qFactor) {
        this.qFactor = qFactor == null ? null : qFactor.trim();
    }

    public String getqStatus() {
        return qStatus;
    }

    public void setqStatus(String qStatus) {
        this.qStatus = qStatus == null ? null : qStatus.trim();
    }
}