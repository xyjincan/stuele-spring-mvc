package cc.watchers.stuele.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

import cc.watchers.stuele.orm.jpa.dao.JcStudentDao;
import cc.watchers.stuele.orm.model.Student;


@Controller
public class ListController {
	
	@Autowired
	private JcStudentDao studentDao;
	
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String index(ModelMap model) {
    	
		model.addAttribute("count", studentDao.count());
		
		Student stu = studentDao.findStudentById("6");
		
		model.addAttribute("findone6", stu.toString());
		
		//studentDao.insertStudent(stu);
		
		//stu.setInf(stu.getInf()+stu.getInf());
		//studentDao.updatestudent(stu);
		studentDao.deletestudent("739480");
		List<Student> list1 = studentDao.selectStudentList(0,35);
		List<Student> list2 = studentDao.selectStudentList(1,35);
		
		model.addAttribute("findAllstudent1", list1.toString());
		model.addAttribute("findAllstudent2", list2.toString());
		
		List<Student> list3 = studentDao.findStudentByName("6",0,35);
		List<Student> list4 = studentDao.findStudentByInf("13c5c5", 0, 35);
		
		
		model.addAttribute("findByName", list3.toString());
		model.addAttribute("findByInf", list4.toString());
		
        return "list";
    }
}
