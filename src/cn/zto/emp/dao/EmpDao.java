package cn.zto.emp.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.zto.emp.entity.EmpEntity;
import cn.zto.emp.util.MybatisUtil;
/**
 * Dao层
 * @author 邢宇超
 *
 */
public class EmpDao {

	private SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	/**
	 * 添加员工
	 * @param emp
	 */
	public void addEmp(EmpEntity emp){
		System.out.println("进来了-------------EmpDao");
		SqlSession sqlSession=MybatisUtil.getSqlSession();
		sqlSession.insert("EmpEntityNameSpace.addEmp",emp);
		sqlSession.commit();
		sqlSession.close();
	}
	
	
}
