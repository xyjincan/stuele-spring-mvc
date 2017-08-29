package cc.watchers.stuele.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cc.watchers.stuele.orm.jpa.dao.JcStudentDao;

import org.springframework.ui.ModelMap;









@Controller
public class SumController {
	
	@Autowired
	private JcStudentDao studentDao;
	
    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    public String index(ModelMap model) {
    	
		model.addAttribute("count", studentDao.count());

        return "sum";
    }
}
