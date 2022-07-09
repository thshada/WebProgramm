package com.ync.view.user;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ync.biz.user.UserVO;
import com.ync.biz.user.impl.UserDAO;

@Controller
public class RegisterController  {

	@RequestMapping("/register.do")
	public String register(UserVO vo,UserDAO userDAO) {
		
		userDAO.insertUser(vo);
		return "login.jsp";
	}
	
	
	
	/*@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("RegisterController 회원 가입 처리");
		
		//1. 사용자 입력정보 추출
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String password = request.getParameter("passwd");
		
		
		//2. DB  연동처리
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setRole("User");
		
		UserDAO userDAO = new UserDAO();
		userDAO.insertUser(vo);
		
		System.out.println("member register complete");
		
		
		
		//3. 화면 네비게이션
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:login.jsp");
							
		
		
		return mav;
}
*/
	}
	
	
	

