package servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/reg")
public class Registration_filter extends HttpFilter implements Filter {
   
  
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		RequestDispatcher r = request.getRequestDispatcher("Registration.jsp");
		
		if(uname==null || uname=="")
		{
			request.setAttribute("err", "uname can not be blank" );
			r.forward(request, response);
		}
		
		if(email==null || email=="")
		{
			request.setAttribute("msg", "email can notbe blank");
			r.forward(request, response);
		}
		
		else if(!Email_validation.emailcheck(email))
		{
			request.setAttribute("msg", "Invalid format");
			r.forward(request, response);
		}
		if(pass==null || pass=="")
		{
			request.setAttribute("wrong", "pass can notbe blank");
			r.forward(request, response);
		}
		
		else if(!Password_validation.passvalidation(pass))
		{
			request.setAttribute("wrong", "Invalid format for password");
			r.forward(request, response);
		}
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
