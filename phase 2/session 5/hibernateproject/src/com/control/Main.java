package com.control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hibernate.Player;



public class Main {
	public static void main(String[] args) {
		try {
			Configuration con=new Configuration().configure();
		con.addAnnotatedClass(com.hibernate.Player.class);
		StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		SessionFactory fact=con.buildSessionFactory(builder.build());
				Session s=fact.openSession();
		Transaction t=s.beginTransaction();
		Player p1=new Player("Raja","IND",20);
		Player p2=new Player("Gopal","INDIA",22);
		s.save(p1);
		s.save(p2);
		/**Player p=s.get(Player.class, 2);
		System.out.println("the details : "+p);
		p.setAge(40);
		p.setPlayerName("Dhoni");**/
		t.commit();
		s.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
