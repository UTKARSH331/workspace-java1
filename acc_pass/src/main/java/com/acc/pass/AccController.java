package com.acc.pass;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccController {
	@GetMapping("/accPassController")
	@ResponseBody
	public String accPassController() {
		System.out.println("it is in the acc_pass_Controller");
		return "return - acc_pass_Controller";
	}

}
