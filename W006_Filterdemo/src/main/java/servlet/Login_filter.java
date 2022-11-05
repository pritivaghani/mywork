package servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/login")
public class Login_filter extends HttpFilter implements Filter {
       
   
    public Login_filter() {
        super();
        
    }


	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		String uname = request.getParameter("uname");
		if(uname.equals("priti"))
		{
			chain.doFilter(request, response);

		}
		else
		{
			request.getRequestDispatcher("Index.jsp").forward(request, response);
		}
		//System.out.println("request");
		//System.out.println("response");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
