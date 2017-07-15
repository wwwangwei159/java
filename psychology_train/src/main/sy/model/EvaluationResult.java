package sy.model;

public class EvaluationResult {
    private String resultId;

    private String qnaId;

    private Integer minScoreInterval;

    private Integer maxScoreInterval;

    private String resultMessage;

    private Integer ressultSeq;

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId == null ? null : resultId.trim();
    }

    public String getQnaId() {
        return qnaId;
    }

    public void setQnaId(String qnaId) {
        this.qnaId = qnaId == null ? null : qnaId.trim();
    }

    public Integer getMinScoreInterval() {
        return minScoreInterval;
    }

    public void setMinScoreInterval(Integer minScoreInterval) {
        this.minScoreInterval = minScoreInterval;
    }

    public Integer getMaxScoreInterval() {
        return maxScoreInterval;
    }

    public void setMaxScoreInterval(Integer maxScoreInterval) {
        this.maxScoreInterval = maxScoreInterval;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage == null ? null : resultMessage.trim();
    }

    public Integer getRessultSeq() {
        return ressultSeq;
    }

    public void setRessultSeq(Integer ressultSeq) {
        this.ressultSeq = ressultSeq;
    }
}