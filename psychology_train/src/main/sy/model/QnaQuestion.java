package sy.model;

public class QnaQuestion {
    private String qnaQid;

    private String qnaId;

    private String qId;

    private Integer qSeq;

    public String getQnaQid() {
        return qnaQid;
    }

    public void setQnaQid(String qnaQid) {
        this.qnaQid = qnaQid == null ? null : qnaQid.trim();
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

    public Integer getqSeq() {
        return qSeq;
    }

    public void setqSeq(Integer qSeq) {
        this.qSeq = qSeq;
    }
}