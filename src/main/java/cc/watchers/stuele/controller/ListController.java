package cc.watchers.stuele.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;






@Controller
public class ListController {

/*	@Autowired
	private StudentDao studentDao;*/
	
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String index() {
    	
    	try {
			//System.out.println(studentDao.selectStudentList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return "list";
    }



}
