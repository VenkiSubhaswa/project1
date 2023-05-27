package Viratcontroler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Viratdao.Viratdao;
import Viratdto.Viratdto;
@WebServlet("/signup")
public class Signupcontroler extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		String email=req.getParameter("email");
		String pswd=req.getParameter("password");
		  int pswd1 =Integer.parseInt(pswd);
		 String us=req.getParameter("username");
		 
		 Viratdto dto=new Viratdto();
		 dto.setEmail(email);
		 dto.setPassword(pswd1);
		 dto.setUsername(us);
		 
		 Viratdao dao=new Viratdao();
		 dao.create(dto);
		 
		 
		 
		 
		 
		   
	}

}
