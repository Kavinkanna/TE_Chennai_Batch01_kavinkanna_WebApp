package com.te.webproject.servletcon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class Login extends HttpServlet {

	private static int id;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Login.id = id;
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String user = req.getParameter("user");
		String pwd = req.getParameter("pwd");

		getLogin(user, pwd);
		if (id > 0) {
			req.getRequestDispatcher("./Menu").forward(req, resp);
		} else {
			resp.sendRedirect("http://localhost:8080/webproject/Welcome");
		}
	}

	public static void getLogin(String user, String pass) {

		EntityManagerFactory em = Persistence.createEntityManagerFactory("emp");
		EntityManager mgr = em.createEntityManager();

		id = 0;
		int ids;

		Query query = mgr.createQuery("select empid from EmpInfo where username=:un and password=:ps");

		query.setParameter("un", user);
		query.setParameter("ps", pass);
		try {
			Object obj = query.getSingleResult();
			ids = Integer.parseInt(obj.toString());
			setId(ids);
		} catch (Exception e) {
			System.out.println("Invalid Credential");
		}
		mgr.close();
		em.close();
	}

}
