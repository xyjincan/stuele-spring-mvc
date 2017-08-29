package cc.watchers.stuele.orm.jpa.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import cc.watchers.stuele.orm.jpa.dao.JcStudentDao;
import cc.watchers.stuele.orm.model.Student;


/**
 *
 * JdbcTemplate：Spring
 * 
 */

@Repository
public class JcStudentDaoImp implements JcStudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public List<Student> findStudentByInf(String inf,int pageNumber,int pageSize) {
		long index = pageNumber*pageSize;
		String string="select * from substudent where inf=? limit ?,?";//index
		List<Student> list = jdbcTemplate.query(string, new StudentMapper(),inf,index,pageSize);
		return list;
	}

	public List<Student> findStudentByName(String name,int pageNumber,int pageSize) {
		long index = pageNumber*pageSize;
		String string="select * from substudent where name=? limit ?,?";//index
		List<Student> list = jdbcTemplate.query(string, new StudentMapper(),name,index,pageSize);
		return list;
	}


	public List<Student> selectStudentList(int pageNumber,int pageSize) {
		
		long index = pageNumber*pageSize;
		String string="select * from substudent limit ?,?";//index
		List<Student> list = jdbcTemplate.query(string, new StudentMapper(),index,pageSize);
		return list;
	}
	
	public Student findStudentById(String id) {
		String string = "select * from substudent where id=?";
		Student student = jdbcTemplate.queryForObject(string,new StudentMapper(), id);
		return student;
	}

	public int insertStudent(Student student) {
		
		String string ="insert into substudent(name,inf)"+
						"values(:name,:inf)";
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("name",student.getName());
		paramMap.put("inf",student.getInf());
		return namedParameterJdbcTemplate.update(string, paramMap);
	}

	public int updatestudent(Student student) {
		
		String string = "update substudent set name=:name,inf=:inf where id=:id";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", student.getId());
		paramMap.put("name", student.getName());
		paramMap.put("inf", student.getInf());
		return namedParameterJdbcTemplate.update(string, paramMap);
	}

	public int deletestudent(String id) {
		
		String string = "delete from substudent where id=:id";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", id);
		return namedParameterJdbcTemplate.update(string, paramMap);
	}

	public long count() {
		return jdbcTemplate.queryForObject("select count(*) from substudent", Long.class);
	}

	//mapRow
	class StudentMapper implements RowMapper<Student>{

		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student = new Student();
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			student.setInf(rs.getString("inf"));
			return student;
		}
		
	}	
	
}
