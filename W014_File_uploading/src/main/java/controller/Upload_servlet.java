package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.File_dao;
import model.file_model;


@WebServlet("/upload")
@MultipartConfig
public class Upload_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//for uploading file
		
		String path = "C:\\Users\\Himlay\\eclipse-workspace\\W014_File_uploading\\src\\main\\webapp\\Img";
		
	String name = request.getParameter("name");
	Part file = request.getPart("file");
	
	String filename = Paths.get(file.getSubmittedFileName()).getFileName().toString();
	
	file.write(path+File.separator+filename);
	
	//for database connection
	
	file_model f = new file_model();
	f.setFilename(filename);
	
	File_dao d = new File_dao();
	int i = d.addfilename(f);
	
	if(i>0)
	{
		request.setAttribute("msg", "inserted successfully....");
		request.getRequestDispatcher("Index.jsp").forward(request, response);
	}
	
	}


}
