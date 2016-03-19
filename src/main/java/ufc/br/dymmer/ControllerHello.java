package ufc.br.dymmer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerHello {
	
	@RequestMapping("/index")
	String hello(){
		return "index";
	}
	
}
