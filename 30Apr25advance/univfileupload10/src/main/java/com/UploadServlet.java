package com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		String user = (String)request.getParameter("t1");
		String pass = (String)request.getParameter("t2");
        
    Part filePart = request.getPart("fpic");
    if (filePart != null)
     {
    	
    	
        String imageFileName = filePart.getSubmittedFileName(); // get selected image file name
        System.out.println("Selected Images File Name: " + imageFileName);
        request.setAttribute("filename",imageFileName);
        
       
        
        String uploadPath = "/home/administrator/My_Drive/30apr25advance/web/univfileupload10/src/main/webapp/images/" + imageFileName;
        System.out.println("Upload Path: " + uploadPath);

        try (FileOutputStream fos = new FileOutputStream(uploadPath);
             InputStream is = filePart.getInputStream()) {

            // Read and write the file data
            byte[] data = new byte[is.available()];
            is.read(data);
            fos.write(data);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            // Handle the exception, log it, or send an error response
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error during file upload");
            return; // Stop further processing
        }
    } else {
        System.out.println("No file part in the request.");
    }
    

    RequestDispatcher rd = getServletContext().getRequestDispatcher("/upload.jsp");
    rd.forward(request, response);

		
	}

}
