package cc.watchers.stuele.orm.jpa.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cc.watchers.stuele.orm.jpa.dao.JcSubStudentDao;
import cc.watchers.stuele.orm.model.Student;


@Repository
public class JcSubStudentDaoImp implements JcSubStudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public List<Student> findStudentByInf(){
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> findStudentByName(){
		// TODO Auto-generated method stub
		return null;
	}

	public Student findStudentById(String id){
		String string = "select * from substudent where id=?";
		Student student = jdbcTemplate.queryForObject(string, new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setInf(rs.getString("inf"));
				return student;
			}
		}, id);
		return student;
	}

	public List<Student> selectStudentList(){
		// TODO Auto-generated method stub
		return null;
	}

	public int insertStudent(Student student){
		// TODO Auto-generated method stub
		return 0;
	}

	public int updatestudent(Student student){
		// TODO Auto-generated method stub
		return 0;
	}

	public int deletestudent(String id){
		// TODO Auto-generated method stub
		return 0;
	}


	public long count() {
		return jdbcTemplate.queryForObject("select count(*) from substudent", Long.class);
	}

}
