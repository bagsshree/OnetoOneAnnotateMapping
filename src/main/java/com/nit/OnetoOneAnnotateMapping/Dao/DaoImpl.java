package com.nit.OnetoOneAnnotateMapping.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.OnetoOneAnnotateMapping.Domain.Account;
import com.nit.OnetoOneAnnotateMapping.Domain.Emp;
import com.nit.OnetoOneAnnotateMapping.Utils.HibernateUtils;


public class DaoImpl {
	private Session sess=null;
	private Transaction tx=null;
	

	public void saveObject()

	{
		System.out.println("hi bhagyashree");
		System.out.println("git changes");
		Emp e=new Emp();
		e.setEmpid(100);
		e.setAufname("bhagya");
		e.setAulname("shree");
		Account ac=new Account();
		ac.setAc_no(10001);
		ac.setActype("savings");
		e.setAccount(ac);
		System.out.println(e);
		try {
			sess=HibernateUtils.getSession();
			tx=sess.beginTransaction();
			sess.save(e);
		System.out.println("Record Saved");
			tx.commit();
			
		}
		catch(Exception ex)
		{
			tx.rollback();
			System.out.println("sorry,Not done"+ex);
		}
		
		HibernateUtils.closeSession();
		HibernateUtils.closeSessionFactory();
	}

	}

