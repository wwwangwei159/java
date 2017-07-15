package sy.dao;

import sy.model.Question;

public interface QuestionMapper {
    int deleteByPrimaryKey(String qId);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(String qId);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}