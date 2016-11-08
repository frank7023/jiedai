package com.jiedai.model.company.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 【实体】企业借贷:审核记录
 * @author chenghailong
 *
 */
public class CompanyAuditRecord implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 借款人 */
	private Long memberId;
	/** 会员名称 */
	private String memberName;
	/** 注册手机号 */
	private String mobile;
	/** 借款单位 */
	private Long companyId;
	/** 公司名称 */
	private String companyName;
	/** 借款id */
	private Long relateId;
	/** 申请时间 */
	private Date applyTime;
	/** 是否同意(3：否 2：是 ) */
	private Integer isAgree;
	/** 审核时间 */
	private Date auditTime;
	/** 状态 */
	private Integer status;
	/** 审核人姓名 */
	private String auditName;
	/** 审核人id */
	private Long auditId;
	/** 审核类型 (1:借款申请 2：借款订单)(删除) */
	private Integer type;//
	
	@Override
	public String toString() {
		return "CompanyAuditRecord [id=" + id + ", memberId=" + memberId
				+ ", mobile=" + mobile + ", relateId=" + relateId
				+ ", applyTime=" + applyTime + ", isAgree=" + isAgree
				+ ", auditTime=" + auditTime + ", status=" + status
				+ ", auditName=" + auditName + ", auditId=" + auditId
				+ ", type=" + type + "]";
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
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long getRelateId() {
		return relateId;
	}
	public void setRelateId(Long relateId) {
		this.relateId = relateId;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Integer getIsAgree() {
		return isAgree;
	}
	public void setIsAgree(Integer isAgree) {
		this.isAgree = isAgree;
	}
	public Date getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getAuditName() {
		return auditName;
	}
	public void setAuditName(String auditName) {
		this.auditName = auditName;
	}
	public Long getAuditId() {
		return auditId;
	}
	public void setAuditId(Long auditId) {
		this.auditId = auditId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
}
