package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// default url --->http://localhost:8080/projectname
// if you need to change url
//@RequestMapping("/process")
//   newurl --->http://localhost:8080/projectname/process


@Controller
public class MainController {
	
	@RequestMapping("/")  // to return this method if write nothing
	public String main() {
		return "Mainpage";
	}
	
	
	@RequestMapping("/profile")  
	public String prof() {
		return "myprofile";
	}
	
	@RequestMapping("/signin")  
	public String login() {
		return "login";
	}
	
	@RequestMapping("/loginprocess") 
	public String mainpage(HttpServletRequest request ,@RequestParam("pass")String passo, Model model) {  // to make any changes
		//operation before go Main
		String username=request.getParameter("user");  //user (name) in login.jsp

				
		model.addAttribute("myuser",username);  // my user ---> the return vlaue in login which i can apear by ${myuser}
		model.addAttribute("mypass",passo);
		
	

		return "Main";
	}
	
	
	
	
	

}
