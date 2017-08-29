package cc.watchers.stuele.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.Page;

import cc.watchers.stuele.orm.model.Student;
import cc.watchers.stuele.orm.mybatis3.service.StudentService;

import org.springframework.ui.ModelMap;

@Controller
public class MybatController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/mybat", method = RequestMethod.GET)
	public String index(ModelMap model) {

		//model.addAttribute("countStudents", studentService.countStudents());
		//List<Student> studentlist = studentService.selectStudentList(2,20);
		Page<Student> pstudentlist = studentService.selectStudentList3(2,100);
		StringBuilder buff = new StringBuilder("[");
		for(Student stu:pstudentlist) {
			buff.append(stu.toString());
			buff.append(",");
		}
		buff.deleteCharAt(buff.length()-1);
		buff.append("]");
		
		model.addAttribute("studentsinfo", pstudentlist.toString());
		model.addAttribute("list", buff.toString());
		//model.addAttribute("student6", studentService.findStudentById(6));

		return "mybat";
	}
}

/*
 * 
 * Student student = null;
 * 
 * model.addAttribute("countStudents", studentService.countStudents());
 * 
 * List<Student> list = studentService.selectStudentList();
 * model.addAttribute("list", list);
 * 
 * 
 * student = studentService.findStudentById(6); int count =
 * studentService.update(student); System.out.println("updatestudent"+count);
 * student = new Student(); student.setId(4); count =
 * studentService.delete(student); System.out.println("deletestudent"+count);
 * count = studentService.delete(4); System.out.println("deletestudent"+count);
 * student = new Student(); student.setName("data"); student.setInf("data inf");
 * count = studentService.insert(student);
 * System.out.println("insertStudent"+count); model.addAttribute("student6",
 * studentService.findStudentById(6));
 * 
 */
