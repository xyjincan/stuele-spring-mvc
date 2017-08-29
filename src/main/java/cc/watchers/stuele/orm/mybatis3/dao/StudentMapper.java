package cc.watchers.stuele.orm.mybatis3.dao;

import java.util.List;



import cc.watchers.stuele.orm.model.Student;

public interface StudentMapper {

	int countStudents();

	Student findStudentById(int id);

	List<Student> selectStudentList();

	int insertStudent(Student student);

	int updatestudent(Student student);

	int deletestudent(Student student);

	int deletestudent(int id);

}

/*
 * 
 * 
 * <select id="findStudentById" resultType="Student" parameterType="int"> select
 * * from student where id = #{id} </select>
 * 
 * <select id="selectStudentList" resultType="Student"> SELECT id,name,inf FROM
 * student limit 10 </select>
 * 
 * <insert id="insertStudent"> insert into student(id,name,inf) values
 * (#{id},#{name},#{inf}) </insert>
 * 
 * <insert id="insertstudentbyName"> insert into student(name) values (#{name})
 * </insert>
 * 
 * <update id="updatestudent"> update student set name = #{name} where id =
 * #{id} </update>
 * 
 * <delete id="deletestudent"> delete from student where id = #{id} </delete>
 * 
 */