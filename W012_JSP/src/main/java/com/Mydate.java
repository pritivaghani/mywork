package com;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Mydate extends TagSupport
{
          @Override
        public int doStartTag() throws JspException {
        	  JspWriter out=pageContext.getOut(); 
        	    try{  
        	     out.print("This is copyright tag!!!"); 
        	    }catch(Exception e){System.out.println(e);}  
        	    return SKIP_BODY;
        }
}
