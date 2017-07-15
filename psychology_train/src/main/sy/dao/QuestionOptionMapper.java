package sy.dao;

import sy.model.QuestionOption;

public interface QuestionOptionMapper {
    int deleteByPrimaryKey(String qOpId);

    int insert(QuestionOption record);

    int insertSelective(QuestionOption record);

    QuestionOption selectByPrimaryKey(String qOpId);

    int updateByPrimaryKeySelective(QuestionOption record);

    int updateByPrimaryKey(QuestionOption record);
}