package sy.dao;

import sy.model.Queue;

public interface QueueMapper {
    int insert(Queue record);

    int insertSelective(Queue record);
}