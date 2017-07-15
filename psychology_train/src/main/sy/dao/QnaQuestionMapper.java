package sy.dao;

import sy.model.QnaQuestion;

public interface QnaQuestionMapper {
    int deleteByPrimaryKey(String qnaQid);

    int insert(QnaQuestion record);

    int insertSelective(QnaQuestion record);

    QnaQuestion selectByPrimaryKey(String qnaQid);

    int updateByPrimaryKeySelective(QnaQuestion record);

    int updateByPrimaryKey(QnaQuestion record);
}