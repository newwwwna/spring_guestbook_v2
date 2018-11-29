package com.javalec.guestbook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;

public class UpdateController implements Controller{
@Override
public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) {

	GuestBookDAO dao = new GuestBookDAO();
	GuestBookVO vo = new GuestBookVO();
	ModelAndView mav = new ModelAndView();
	
	String name = req.getParameter("name");
	String pw = req.getParameter("pw");
	String content = req.getParameter("content");
	String num = req.getParameter("no");
	int no = Integer.parseInt(num);
	
	vo.setName(name);
	vo.setPassword(pw);
	vo.setContent(content);
	vo.setNo(no);
	
	int result = dao.update(vo);
	mav.setViewName("getguestbooklist.do");
	System.out.println(result);
	
	return mav;
}
}
