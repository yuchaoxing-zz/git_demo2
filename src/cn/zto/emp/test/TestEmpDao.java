package cn.zto.emp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zto.emp.dao.EmpDao;
import cn.zto.emp.entity.EmpEntity;

public class TestEmpDao {

	//µ•∂¿≤‚ ‘mybatis
	@Test
	public void test() {
		EmpDao empDao=new EmpDao();
		empDao.addEmp(new EmpEntity(1,"–œ”Ó≥¨",3000D,"ƒ–"));
	}


	//≤‚ ‘spring’˚∫œmybatis
	@Test
	public void test2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
		EmpDao empDao = (EmpDao) ac.getBean("empDaoID");
		empDao.addEmp(new EmpEntity(3,"≥¨≥¨",3000D,"ƒ–"));
	}
}
