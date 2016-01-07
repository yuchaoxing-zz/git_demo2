package cn.zto.emp.entity;

public class EmpEntity {

	private Integer id;
	private String name;
	private Double sal;
	private String sex;
	
	public EmpEntity(){}

	public EmpEntity(Integer id, String name, Double sal, String sex) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.sex = sex;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
