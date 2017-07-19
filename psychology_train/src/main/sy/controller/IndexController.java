package sy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


@Controller
@RequestMapping("/index")
public class IndexController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request) {
		Map<String,Object> model = new HashMap<String,Object>();  
        model.put("webRoot", request.getContextPath());
        return new ModelAndView("index",model);
	}
	
	
	
	
	
}
