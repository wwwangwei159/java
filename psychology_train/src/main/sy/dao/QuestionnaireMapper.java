package sy.dao;

import sy.model.Questionnaire;

public interface QuestionnaireMapper {
    int deleteByPrimaryKey(String qnaId);

    int insert(Questionnaire record);

    int insertSelective(Questionnaire record);

    Questionnaire selectByPrimaryKey(String qnaId);

    int updateByPrimaryKeySelective(Questionnaire record);

    int updateByPrimaryKey(Questionnaire record);
}