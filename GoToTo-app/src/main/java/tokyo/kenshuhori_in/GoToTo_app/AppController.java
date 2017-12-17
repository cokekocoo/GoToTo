package tokyo.kenshuhori_in.GoToTo_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {
	
	@RequestMapping("/")
	@ResponseBody
	private String hello() {
		return "Hello KenshuHori!";
	}
}
