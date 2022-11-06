package gorl.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController 
{
	static String name;
	static String pwd;
	
	@RequestMapping("/login")
	public ModelAndView checkLogin(HttpServletRequest req)
	{
		name = req.getParameter("uname");
		pwd = req.getParameter("upwd");
		
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		session.setAttribute("pwd", pwd);
		
		String newPwd = (String) session.getAttribute("newPwd");
		
		if(newPwd == null && pwd.equals("kavuthami"))
		{
			ModelAndView mav = new ModelAndView("home");
			mav.addObject("name", name);
			return mav;
		}
		else if(newPwd.equals(pwd))
		{
			ModelAndView mav = new ModelAndView("home");
			mav.addObject("name", name);
			return mav;
		}
		else
		{
			ModelAndView mav = new ModelAndView("index");
			return mav;
		}
	}
	
	@RequestMapping("/chngePwd")
	public ModelAndView changePassword(HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		ModelAndView mav = new ModelAndView("chngePwd");
		String cpwd = req.getParameter("cpwd");
		String npwd = req.getParameter("npwd");
		String npwd1 = req.getParameter("npwd1");
		
		if(cpwd.equals((String)session.getAttribute("pwd")))
		{
		
			if( npwd.equals(npwd1))
			{
				pwd = npwd;
				System.out.println(pwd);
				
				session.setAttribute("newPwd", npwd);
				
				ModelAndView mav1 = new ModelAndView("index");
				return mav1;
			}
			return mav;
		}
		else
		{
			return mav;
		}
	}
	
	@RequestMapping("/logout")
	public ModelAndView logoutUser(HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		session.removeAttribute("name");
		session.removeAttribute("pwd");
		session.removeAttribute("npwd");
		session.invalidate();
		
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
}
