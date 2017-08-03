package cc.watchers.stuele.service;

//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cc.watchers.stuele.dao.StudentDao;
import cc.watchers.stuele.model.Student;



@Service
public class StudentService {

	//@Autowired
	private StudentDao studentDao;

	@Transactional
	public void updateStudent(Student stu) throws Exception {

		System.out.println("update service:");
		//studentDao.updatestudent(stu);
		//TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		// org.springframework.transaction.NoTransactionException: No transaction aspect-managed TransactionStatus in scope
		//throw new RuntimeException("fail update");
		//throw new Exception("fail update");

	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
