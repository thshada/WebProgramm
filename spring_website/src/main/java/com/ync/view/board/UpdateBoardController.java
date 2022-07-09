package com.ync.view.board;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ync.biz.board.BoardVO;
import com.ync.biz.board.impl.BoardDAO;

@Controller
public class UpdateBoardController  {

	
	/*
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("서블릿 글 수정 처리");
		
		//1. 사용자 입력 정보 추출
		//request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String seq = request.getParameter("seq");
		
		//DB 연동 처리
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.updateBoard(vo);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:getBoardList.do");
		return mav;
		//3. ȭ�� ������̼�
		//return "getBoardList.do";
	}
*/
}
