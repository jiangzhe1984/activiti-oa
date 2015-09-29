package org.crazyit.activiti.oa.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * 薪资对象
 * @author yangenxiong
 *
 */
@Entity
@Table(name = "OA_SALARY")
public class Salary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true)
	private Integer id;

	// 每月基本工资
	@Column(name = "BASE_MONEY", scale= 2)
	private BigDecimal baseMoney;
	
	// 用户ID，保存在流程引擎中
	@Column(name = "USER_ID")
	private String userId;

	public BigDecimal getBaseMoney() {
		return baseMoney;
	}

	public void setBaseMoney(BigDecimal baseMoney) {
		this.baseMoney = baseMoney;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
