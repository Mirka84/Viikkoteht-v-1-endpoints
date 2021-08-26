package fi.ekaharjoitus.Endpoints.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EkaController {
	
	@RequestMapping("index")
	@ResponseBody
	
	public String returnGreeting() {
		return "This is the main page!"; 
	}
	
	@RequestMapping("contact")
	@ResponseBody
	
	public String returnMessage() {
		return "This is the contact page!"; 
	}

}
