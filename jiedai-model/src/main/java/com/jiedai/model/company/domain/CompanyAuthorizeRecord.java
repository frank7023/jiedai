package com.jiedai.model.company.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 【实体】企业借贷:授信记录
 * @author chenghailong
 *
 */
public class CompanyAuthorizeRecord implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 关联-企业ID */
	private Long companyId;
	/** 信用等级 */
	private String level;
	/** 风险系数 */
	private String riskCoefficient;
	/** 征信评价 */
	private String creditEvaluation;
	/** 来源 */
	private String sources;
	/** 状态: 1 已授权; 2 未授权 */
	private Integer status;
	/** 审核人 */
	private String auditor;
	/** 创建时间 */
	private Date createTime;
	/** 当前额度 */
	private BigDecimal presentMoney;
	/** 本次额度 */
	private BigDecimal thisMoney;
	
	@Override
	public String toString() {
		return "CompanyAuthorizeRecord [id=" + id + ", companyId=" + companyId
				+ ", level=" + level + ", riskCoefficient=" + riskCoefficient
				+ ", creditEvaluation=" + creditEvaluation + ", sources="
				+ sources + ", status=" + status + ", auditor=" + auditor
				+ ", createTime=" + createTime + ", presentMoney="
				+ presentMoney + ", thisMoney=" + thisMoney + "]";
	}
	
	/** get()/set() */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getRiskCoefficient() {
		return riskCoefficient;
	}
	public void setRiskCoefficient(String riskCoefficient) {
		this.riskCoefficient = riskCoefficient;
	}
	public String getCreditEvaluation() {
		return creditEvaluation;
	}
	public void setCreditEvaluation(String creditEvaluation) {
		this.creditEvaluation = creditEvaluation;
	}
	public String getSources() {
		return sources;
	}
	public void setSources(String sources) {
		this.sources = sources;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public BigDecimal getPresentMoney() {
		return presentMoney;
	}
	public void setPresentMoney(BigDecimal presentMoney) {
		this.presentMoney = presentMoney;
	}
	public BigDecimal getThisMoney() {
		return thisMoney;
	}
	public void setThisMoney(BigDecimal thisMoney) {
		this.thisMoney = thisMoney;
	}
	
}
