package com.example.aop.demoaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AopExampleController {

	@Autowired
	private CalcService calcService;
	
	@GetMapping("/add/{a}/{b}")
	public int addition(@PathVariable int a, @PathVariable int b) {
		return calcService.add(a, b);
	}
	@GetMapping("/sub/{a}/{b}")
	public int subtraction(@PathVariable int a, @PathVariable int b){
		return calcService.sub(a,b);
	}
}
