package Controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class My_Listener implements HttpSessionListener

{
	int currentuser = 0;
	int totaluser = 0;
	

	@Override
	public void sessionCreated(HttpSessionEvent se) {
	//System.out.println("session created");
	     currentuser++;
	     totaluser++;
	     ServletContext sc = se.getSession().getServletContext();
	     sc.setAttribute("cu", currentuser);
	     sc.setAttribute("tu", totaluser);
	}
	
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		//System.out.println("session destroyed");
	currentuser--;
	  ServletContext sc = se.getSession().getServletContext();
	     sc.setAttribute("cu", currentuser);
	
	
	}
	
}
