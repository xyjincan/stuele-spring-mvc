package cc.watchers.stuele.orm.jpa.dao;

import java.util.List;

import cc.watchers.stuele.orm.model.Student;

public interface JcSubStudentDao {

	public List<Student> findStudentByInf();

	public List<Student> findStudentByName();

	public Student findStudentById(String id);

	public List<Student> selectStudentList();

	public int insertStudent(Student student);

	public int updatestudent(Student student);

	public int deletestudent(String id);

	public long count();

}

/*

 */