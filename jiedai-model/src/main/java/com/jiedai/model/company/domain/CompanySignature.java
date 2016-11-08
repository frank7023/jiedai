package com.jiedai.model.company.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 【实体】企业借贷:合同签章
 * @author chenghailong
 *
 */
public class CompanySignature implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 会员id */
	private Long memberId;
	/** 企业id */
	private Long companyId;
	/** 借款订单id */
	private Long loanOrdersId;
	/** 创建时间 */
	private Date createTime;
	/** 会员名称 */
	private String memberName;
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
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public Long getLoanOrdersId() {
		return loanOrdersId;
	}
	public void setLoanOrdersId(Long loanOrdersId) {
		this.loanOrdersId = loanOrdersId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}
