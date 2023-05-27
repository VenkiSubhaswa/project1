package Viratcontroler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Viratdao.Viratdao;
import Viratdto.Viratdto;
@WebServlet("/login")
public class Logincontroler extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String email=req.getParameter("email");
		String pswd=req.getParameter("password");
		int pswd1=Integer.parseInt(pswd);
		
		Viratdao dao=new Viratdao();
				Viratdto msg=dao.login(email);
			if(msg!=null)
			{
				if(pswd1==msg.getPassword())
				{
					resp.getWriter().print("<h1> WELCOME TO HOME PAGE </h1>");
                    resp.sendRedirect("https://www.facebook.com");
					}
				else {
					resp.getWriter().print("<h1> Enter proper password </h1>");
				RequestDispatcher r=req.getRequestDispatcher("login.html");
				r.include(req, resp);	
				}
			}
			else {
				resp.getWriter().print("<h1>account not found,plz signup</h1> <a href='signup.html'><button>signup</button></a>");
			}
			}
			
	}


