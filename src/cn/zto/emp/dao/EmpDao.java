package cn.zto.emp.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.zto.emp.entity.EmpEntity;
import cn.zto.emp.util.MybatisUtil;
/**
 * Dao��
 * @author ���
 *
 */
public class EmpDao {

	private SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	/**
	 * ���Ա��
	 * @param emp
	 */
	public void addEmp(EmpEntity emp){
		System.out.println("������-------------EmpDao");
		SqlSession sqlSession=MybatisUtil.getSqlSession();
		sqlSession.insert("EmpEntityNameSpace.addEmp",emp);
		sqlSession.commit();
		sqlSession.close();
	}
	
	
}
