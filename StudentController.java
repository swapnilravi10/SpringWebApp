package com.swapnil.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController 
{
	@Autowired
	StudentDao student;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student stu)
	{
		student.save(stu);
		return "home.jsp";
	}
	
	@RequestMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("showstudent.jsp");
		Student stu = student.findById(id).orElse(new Student());
		mv.addObject(stu);
		return mv;
	}
	
	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int id)
	{
		student.deleteById(id);
		return "home.jsp";
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(Student stu)
	{
		student.save(stu);
		return "showstudent.jsp";
	}
	
	
}
