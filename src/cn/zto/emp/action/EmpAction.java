package cn.zto.emp.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zto.emp.entity.EmpEntity;
import cn.zto.emp.service.EmpService;
/**
 * Action层
 * @author 邢宇超
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
	 * 添加员工
	 */
	@RequestMapping(value="/addEmp")
	public String addEmp(EmpEntity emp){
		System.out.println("进来了-------------EmpAction");
		//调用业务层
		empService.addEmp(emp);
		return "success";
	}
}
