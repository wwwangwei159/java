package sy.dao;

import sy.model.EvaluationResult;

public interface EvaluationResultMapper {
    int deleteByPrimaryKey(String resultId);

    int insert(EvaluationResult record);

    int insertSelective(EvaluationResult record);

    EvaluationResult selectByPrimaryKey(String resultId);

    int updateByPrimaryKeySelective(EvaluationResult record);

    int updateByPrimaryKey(EvaluationResult record);
}