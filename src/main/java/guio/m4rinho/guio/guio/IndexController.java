package guio.m4rinho.guio.guio;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String getRedirectMain(){
		return "/guio";
	}
	
	@GetMapping("/guio")
	public String getIndexPage(){
		return "redirect:guio";
	}
	
	
}
