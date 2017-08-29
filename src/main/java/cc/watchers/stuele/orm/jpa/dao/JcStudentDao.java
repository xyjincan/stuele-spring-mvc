package cc.watchers.stuele.orm.jpa.dao;

import java.util.List;

import cc.watchers.stuele.orm.model.Student;



public interface JcStudentDao {

	public List<Student> findStudentByInf(String inf,int pageNumber,int pageSize);

	public List<Student> findStudentByName(String name,int pageNumber,int pageSize);

	public Student findStudentById(String id);

	public List<Student> selectStudentList(int pageNumber,int pageSize);

	public int insertStudent(Student student);

	public int updatestudent(Student student);

	public int deletestudent(String id);

	public long count();

}

/*

 */