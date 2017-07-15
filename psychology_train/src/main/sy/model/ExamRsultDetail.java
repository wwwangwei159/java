package sy.model;

public class ExamRsultDetail {
    private String examResultId;

    private String examId;

    private String qnaId;

    private String qId;

    private Integer examScore;

    public String getExamResultId() {
        return examResultId;
    }

    public void setExamResultId(String examResultId) {
        this.examResultId = examResultId == null ? null : examResultId.trim();
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId == null ? null : examId.trim();
    }

    public String getQnaId() {
        return qnaId;
    }

    public void setQnaId(String qnaId) {
        this.qnaId = qnaId == null ? null : qnaId.trim();
    }

    public String getqId() {
        return qId;
    }

    public void setqId(String qId) {
        this.qId = qId == null ? null : qId.trim();
    }

    public Integer getExamScore() {
        return examScore;
    }

    public void setExamScore(Integer examScore) {
        this.examScore = examScore;
    }
}