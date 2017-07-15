package sy.dao;

import sy.model.MessageLeave;

public interface MessageLeaveMapper {
    int deleteByPrimaryKey(String messId);

    int insert(MessageLeave record);

    int insertSelective(MessageLeave record);

    MessageLeave selectByPrimaryKey(String messId);

    int updateByPrimaryKeySelective(MessageLeave record);

    int updateByPrimaryKey(MessageLeave record);
}