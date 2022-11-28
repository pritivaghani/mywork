package com;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.jasper.runtime.PageContextImpl;

public class Cube extends TagSupport
{

	int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int doStartTag() throws JspException{
		 
		   JspWriter out=pageContext.getOut();
		    try{  
		     out.print(number*number*number);
		    }catch(Exception e){System.out.println(e);}  
		    return SKIP_BODY;
	}
	
	
	
}
