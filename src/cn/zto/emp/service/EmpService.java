package cn.zto.emp.service;

import org.springframework.transaction.annotation.Transactional;

import cn.zto.emp.dao.EmpDao;
import cn.zto.emp.entity.EmpEntity;
/**
 * ҵ���
 * @author ���
 *
 */
public class EmpService {

	private EmpDao empDao;
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	/**
	 * ҵ������Ա��
	 * @param emp
	 */
	public void addEmp(EmpEntity emp) {
		System.out.println("������-------------EmpService");
		empDao.addEmp(emp); 
	}


}
