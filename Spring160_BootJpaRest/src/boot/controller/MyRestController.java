package boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.web.boot.service.EmpService;
import com.cg.web.dto.Employee;



@RestController
public class MyRestController {
	@Autowired
	private EmpService empService;
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello";
	}
	
	
	@RequestMapping(value="/emplist" ,produces="application/json")
	public @ResponseBody List<Employee> getEmpList(){
		System.out.println(empService.getEmpList());
		return empService.getEmpList();
	}
}
