package sy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.QueueMapper;
import sy.dao.UserMapper;
import sy.model.Queue;
import sy.model.User;


@Service("queueService")
public class QueueServiceImpl implements QueueService {

	private QueueMapper queueMapper;

	public QueueMapper getQueueMapper() {
		return queueMapper;
	}

	@Autowired
	public void setQueueMapper(QueueMapper queueMapper) {
		this.queueMapper = queueMapper;
	}

	public Queue getQueueById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
