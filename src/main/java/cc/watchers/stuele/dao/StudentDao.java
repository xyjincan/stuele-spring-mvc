package cc.watchers.stuele.dao;

import java.util.Vector;

import cc.watchers.stuele.model.Student;



public interface StudentDao {
	
	public Student findStudentById(String id) throws Exception;
	public Vector<Student> selectStudentList() throws Exception;
	public int insertStudent(Student student) throws Exception;
	public int insertstudentbyName(String name) throws Exception;
	public int updatestudent(Student student) throws Exception;
	public int deletestudent(String id) throws Exception;

}


/*

 */