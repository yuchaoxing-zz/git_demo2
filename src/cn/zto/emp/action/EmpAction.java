package cn.zto.emp.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zto.emp.entity.EmpEntity;
import cn.zto.emp.service.EmpService;
/**
 * Action��
 * @author ���
 *
 */
@Controller
@RequestMapping(value="/emp")
public class EmpAction {
	private EmpService empService;
	@Resource(name="empServiceID")
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}
	/**
	 * ���Ա��
	 */
	@RequestMapping(value="/addEmp")
	public String addEmp(EmpEntity emp){
		System.out.println("������-------------EmpAction");
		//����ҵ���
		empService.addEmp(emp);
		return "success";
	}
}
