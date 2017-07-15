package sy.dao;

import sy.model.ExamRsultHead;

public interface ExamRsultHeadMapper {
    int deleteByPrimaryKey(String examId);

    int insert(ExamRsultHead record);

    int insertSelective(ExamRsultHead record);

    ExamRsultHead selectByPrimaryKey(String examId);

    int updateByPrimaryKeySelective(ExamRsultHead record);

    int updateByPrimaryKey(ExamRsultHead record);
}