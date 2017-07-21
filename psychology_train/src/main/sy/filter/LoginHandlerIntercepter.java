package sy.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import sy.model.User;

public class LoginHandlerIntercepter implements HandlerInterceptor   {

	 public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
        System.out.println("-------在action之前执行,如果返回true,则继续向后执行--------");
//	        System.out.println(request.getParameter("name"));
        // 此处实现登陆的拦截判断
        if(request.getSession().getAttribute("user")==null){
            response.sendRedirect(request.getContextPath() + "/user/tologin.do");
            return false;
        }else{
            return true;
        }
    }
 
    public void postHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        System.out.println("----在Action 方法执行完毕之后,执行(没有抛异常的话)----------");
    }
 
    public void afterCompletion(HttpServletRequest request,
            HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("----在Action 方法执行完毕之后,无论是否抛出异常,通常用来进行异常处理----------");
    }


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
