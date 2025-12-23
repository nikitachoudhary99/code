package com.ak.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/")
	public String uploadPage()
	{
		return "fileupload";
	}
	
	@PostMapping("/uploadfile")
	public String uploadFile(@RequestParam("username")String user,
							@RequestParam("password")String pass,
						@RequestParam("pic")MultipartFile file,
						Model m)
	{
			try {
				String destpath = "/home/administrator/My_Drive/25june25jee/Spring MVC/Spring-MVC-FileUpload/src/main/webapp/resources/images/";
				
				File serverfile = 
						new File(destpath,file.getOriginalFilename());
				System.out.println(serverfile);
				file.transferTo(serverfile);
				m.addAttribute("user",user);
				m.addAttribute("filename",file.getOriginalFilename());
				return "success";

		} 
		catch (Exception e) 
		{
			return "error";
		}
	
		
	}
}
