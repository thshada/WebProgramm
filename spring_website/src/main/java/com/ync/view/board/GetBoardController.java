package com.ync.view.board;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ync.biz.board.BoardVO;
import com.ync.biz.board.impl.BoardDAO;

@Controller
public class GetBoardController {
	
	
	
	
	/*@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("GetBoardController 글 상세 보기 처리");
		
		//1. 강력한 게시글 번호 추출
		String seq = request.getParameter("seq");

		//DB 연동처리
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(seq));
		BoardDAO boardDAO = new BoardDAO();
		BoardVO board = boardDAO.getBoard(vo);		
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("board",board);
		mav.setViewName("getBoard");
		return mav;
		//HttpSession session = request.getSession();
		//session.setAttribute("board", board);
		
		//return "getBoard";
			
	}
*/
}
