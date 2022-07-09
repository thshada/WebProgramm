package com.ync.view.user;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class LogoutController  {
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login.jsp";
	}
	
	/*@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("LogoutController 로그아웃 처리");
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:login.jsp");
		return mav;
		//return "login";
	}
*/
}
