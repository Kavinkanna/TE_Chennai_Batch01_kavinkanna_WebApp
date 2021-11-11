package com.te.webproject.servletcon;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.webproject.beans.EmpInfo;

@WebServlet("/del")
public class DeleteDetails extends HttpServlet {

	static EmpInfo delInfo = ShowDetails.getEmp();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String pass = req.getParameter("pwd");
		if (pass.equalsIgnoreCase(delInfo.getPassword())) {
			delData(req, resp);
		} else {
			resp.sendRedirect("http://localhost:8080/webproject/DeleteDetails");
		}

	}

	public static void delData(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EntityManagerFactory fact = null;
		EntityManager mgr = null;
		EntityTransaction trn = null;

		try {

			fact = Persistence.createEntityManagerFactory("emp");
			mgr = fact.createEntityManager();
			trn = mgr.getTransaction();
			trn.begin();
			EmpInfo info = mgr.find(EmpInfo.class, Login.getId());
			mgr.remove(info);
			trn.commit();
			resp.sendRedirect("http://localhost:8080/webproject/Welcome");
		} catch (Exception e) {
			if (trn != null) {
				trn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (fact != null) {
				fact.close();
			}
			if (mgr != null) {
				mgr.close();
			}
		}

	}

}
