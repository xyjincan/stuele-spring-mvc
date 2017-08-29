package cc.watchers.stuele.orm.mybatis3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cc.watchers.stuele.orm.model.Student;
import cc.watchers.stuele.orm.mybatis3.dao.StudentMapper;

@Repository
public class StudentService {

	@Autowired
	StudentMapper mapper;
	
	public int countStudents() {
		return mapper.countStudents();
	}

	public Student findStudentById(int id) {
		return mapper.findStudentById(id);
	}
	
	public List<Student> selectStudentList1(int pageNumber,int pageSize){
		PageHelper.startPage(pageNumber, pageSize);
		List<Student> list = mapper.selectStudentList();
		return list;
	}
	public List<Student> selectStudentList2(int pageNumber,int pageSize){
		PageHelper.startPage(pageNumber, pageSize);
		List<Student> list = mapper.selectStudentList();
		@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
		PageInfo<Student> page = new PageInfo(list);
		return list;
	}
	public Page<Student> selectStudentList3(int pageNumber,int pageSize){
		
		Page<Student> page8 = PageHelper.startPage(pageNumber, pageSize).doSelectPage(
				()-> mapper.selectStudentList()
		);
		
		//对应的lambda用法
		//pageInfo = PageHelper.startPage(1, 10).doSelectPageInfo(() -> countryMapper.selectGroupBy());
		
		return page8;
	}
	public Page<Student> selectStudentList4(int pageNumber,int pageSize){
		Page<Student> page7 = PageHelper.startPage(pageNumber, pageSize).doSelectPage(
				new ISelect() {
					public void doSelect() {
						mapper.selectStudentList();
					}
				});
		
		//也可以直接返回PageInfo，注意doSelectPageInfo方法和doSelectPage
		/*pageInfo = PageHelper.startPage(1, 10).doSelectPageInfo(new ISelect() {
		    @Override
		    public void doSelect() {
		        countryMapper.selectGroupBy();
		    }
		});
		*/
		return page7;
	}

	public List<Student> selectStudentList(int pageNumber,int pageSize){
		
		PageHelper.startPage(pageNumber, pageSize);
		List<Student> list = mapper.selectStudentList();
		//@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
		//PageInfo<Student> page = new PageInfo(list);
		//PageHelper.orderBy("create_time desc");
		return list;
	}

	public int insert(Student student) {
		return mapper.insertStudent(student);
	}

	public int update(Student student) {
		return mapper.updatestudent(student);
	}

	public int delete(Student student) {
		return mapper.deletestudent(student);
	}
	public int delete(int id) {
		return mapper.deletestudent(id);
	}

}

/**
 * 标准流程 SqlSession session = sqlSessionFactory.openSession(); try { BlogMapper
 * mapper = session.getMapper(BlogMapper.class); Blog blog =
 * mapper.selectBlog(101); } finally { session.close(); }
 * 
 * 
 * 
 * 
 */

// studentDao.updatestudent(stu);
// TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
// org.springframework.transaction.NoTransactionException: No transaction
// aspect-managed TransactionStatus in scope
// throw new RuntimeException("fail update");
// throw new Exception("fail update");
