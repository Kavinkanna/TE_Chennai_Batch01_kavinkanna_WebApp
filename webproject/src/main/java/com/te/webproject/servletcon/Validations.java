package com.te.webproject.servletcon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.webproject.beans.EmpInfo;
import com.te.webproject.exception.InvalidInformation;

public class Validations {

	static EmpInfo info = new EmpInfo();

	public static int genarateId() {

		Integer id = null;
		try {
			EntityManagerFactory em = Persistence.createEntityManagerFactory("emp");
			EntityManager mgr = em.createEntityManager();

			Query query = mgr.createQuery("select max(empid) from EmpInfo");

			Object obj = query.getSingleResult();
			if (obj == null) {
				obj = 0;
			}
			id = Integer.parseInt(obj.toString()) + 1;
			em.close();
			mgr.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return id;
	}

	public static String checkString(String str) throws InvalidInformation {

		if (str.matches("^[a-zA-Z\\s]*$")) {
			return str;
		} else {
			throw new InvalidInformation("Please Enter Valid Input");
		}
	}

	public static String user(String username) throws InvalidInformation {

		Integer id = null;

		try {
			EntityManagerFactory em = Persistence.createEntityManagerFactory("emp");
			EntityManager mgr = em.createEntityManager();

			Query query = mgr.createQuery("select count(*) from EmpInfo where username=:un");

			query.setParameter("un", username);

			Object obj = query.getSingleResult();
			id = Integer.parseInt(obj.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (id == 0) {
			return username;
		} else {
			throw new InvalidInformation("Username is already exist");
		}
	}

	public static String pass(String pwd1, String pwd2) throws InvalidInformation {
		if (pwd1.equalsIgnoreCase(pwd2)) {
			return pwd1;
		} else {
			throw new InvalidInformation(" Password Mismatch ");
		}
	}

	public static String email(String mail) throws InvalidInformation {
		Integer id = null;

		try {
			EntityManagerFactory em = Persistence.createEntityManagerFactory("emp");
			EntityManager mgr = em.createEntityManager();

			Query query = mgr.createQuery("select count(*) from EmpInfo where email=:em");

			query.setParameter("em", mail);

			Object obj = query.getSingleResult();
			id = Integer.parseInt(obj.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (id == 0) {
			return mail;
		} else {
			throw new InvalidInformation("Email address is already exist");
		}
	}

	public static Long mobile(Long mno) throws InvalidInformation {
		if (mno > 0 && String.valueOf(mno).length() == 10) {
			return mno;
		} else {
			throw new InvalidInformation(" Mobile is invalid");
		}
	}
}
