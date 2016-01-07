package cn.zto.emp.service;

import org.springframework.transaction.annotation.Transactional;

import cn.zto.emp.dao.EmpDao;
import cn.zto.emp.entity.EmpEntity;
/**
 * 业务层
 * @author 邢宇超
 *
 */
public class EmpService {

	private EmpDao empDao;
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	/**
	 * 业务层添加员工
	 * @param emp
	 */
	public void addEmp(EmpEntity emp) {
		System.out.println("进来了-------------EmpService");
		empDao.addEmp(emp); 
	}


}
