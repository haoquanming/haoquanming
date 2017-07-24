package com.test.daoImpl;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.beans.Student;
import com.test.dao.IStudentDao;
import com.test.utils.MyBatisUtils;

public class StudentDaoImpl implements IStudentDao {

	private SqlSession sqlSession;

	@Override
	public void insertStudent(Student student) {

		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//4.相关操作
			sqlSession.insert("insertStudent", student);
			sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession != null){
					sqlSession.close();
				}
			}
		}

	@Override
	public void insertStudentCacheId(Student student) {
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//4.相关操作
			sqlSession.insert("insertStudentCacheId", student);
			sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession != null){
					sqlSession.close();
				}
			}
	}

	@Override
	public void deleteStudentById(int id) {
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//4.相关操作
			sqlSession.delete("deleteStudentById", id);
			sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession != null){
					sqlSession.close();
				}
			}
		
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Map<String, Object> selectAllStudentsMap() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Student selectStudentById(int id) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public List<Student> selectStudentsByName(String name) {
		// TODO 自动生成的方法存根
		return null;
	}

}
