package sy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import sy.model.MessageLeave;
import sy.model.User;
import sy.service.MessageLeaveService;
import sy.service.UserServiceI;

@Controller
@RequestMapping("/mess")
public class MessController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	private MessageLeaveService messService;

	public MessageLeaveService getMessService() {
		return messService;
	}

	@Autowired
	public void setMessService(MessageLeaveService messService) {
		this.messService = messService;
	}


	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request) {
		Map<String,Object> model = new HashMap<String,Object>();  
        model.put("webRoot", request.getContextPath());
        return new ModelAndView("message/messIndex",model);
	}
	
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("form") MessageLeave messageLeave,HttpServletRequest request) {
		Map<String,Object> model = new HashMap<String,Object>();  
        model.put("webRoot", request.getContextPath());
        messageLeave.setMessId(Hander.getUuid());
        messService.insert(messageLeave);
        return new ModelAndView("index",model);
	}
	
	
	
	
}
