package sy.dao;

import sy.model.ExamRsultDetail;

public interface ExamRsultDetailMapper {
    int deleteByPrimaryKey(String examResultId);

    int insert(ExamRsultDetail record);

    int insertSelective(ExamRsultDetail record);

    ExamRsultDetail selectByPrimaryKey(String examResultId);

    int updateByPrimaryKeySelective(ExamRsultDetail record);

    int updateByPrimaryKey(ExamRsultDetail record);
}