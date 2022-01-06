package br.com.userbank.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.userbank.model.User;

@WebServlet("/newUser")
public class NewUserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	System.out.println("Cadastrando novo usuario");
    	PrintWriter out = response.getWriter();
    	out.println("<html><body>Cadastrado</body></html>");
//
//    	String userName = request.getParameter("nome");
//    	String userEmail = request.getParameter("email");
//    	String userPassword = request.getParameter("senha");
//    	
//    	User user = new User();
//    	user.setName(userName);
//    	user.setEmail(userEmail);
//    	user.setPassword(userPassword);
	}

}
