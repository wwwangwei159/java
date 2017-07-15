package sy.model;

public class QuestionOption {
    private String qOpId;

    private Integer qOpSeq;

    private String qOpName;

    private Integer qOpScore;

    private String qId;

    public String getqOpId() {
        return qOpId;
    }

    public void setqOpId(String qOpId) {
        this.qOpId = qOpId == null ? null : qOpId.trim();
    }

    public Integer getqOpSeq() {
        return qOpSeq;
    }

    public void setqOpSeq(Integer qOpSeq) {
        this.qOpSeq = qOpSeq;
    }

    public String getqOpName() {
        return qOpName;
    }

    public void setqOpName(String qOpName) {
        this.qOpName = qOpName == null ? null : qOpName.trim();
    }

    public Integer getqOpScore() {
        return qOpScore;
    }

    public void setqOpScore(Integer qOpScore) {
        this.qOpScore = qOpScore;
    }

    public String getqId() {
        return qId;
    }

    public void setqId(String qId) {
        this.qId = qId == null ? null : qId.trim();
    }
}