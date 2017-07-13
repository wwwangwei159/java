package sy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sy.model.Queue;
import sy.model.User;
import sy.service.QueueService;
import sy.service.UserServiceI;

@Controller
@RequestMapping("/queueController")
public class QueueController {

	private QueueService queueService;

	public QueueService getQueueService() {
		return queueService;
	}

	@Autowired
	public void setQueueService(QueueService queueService) {
		this.queueService = queueService;
	}

	@RequestMapping(value="/{id}/showQueue")
	public String showUserByJason(@PathVariable Integer id, HttpServletRequest request) {
		Queue q = queueService.getQueueById(id);
		request.setAttribute("queue",q);
		return "showUser";
	}
	
	@RequestMapping(value="/queueIndex")
	public String QueueIndex(HttpServletRequest request) {
		return "queue/queueIndex";
	}
	
	

}
