package com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
  private static SessionFactory factory;
  public static SessionFactory getFactory() {
	  if(factory==null) {
		
		  return  new Configuration().configure("hibernate.cnfg.xml").buildSessionFactory();
	 
	  }
	  return  factory;
	
  }
}
