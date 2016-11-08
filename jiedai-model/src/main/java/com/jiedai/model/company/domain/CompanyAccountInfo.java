package com.jiedai.model.company.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 【实体】企业借贷:账户-基本信息
 * @author chenghailong
 *
 */
public class CompanyAccountInfo implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 企业id */
	private Long companyId;
	/** 会员表id */
	private Long memberId;
	/** 手机号 */
	private String mobile;
	/** 授信额度 */
	private BigDecimal creditLine;
	/** 剩余额度 */
	private BigDecimal remainMoney;
	/** 账户金额 */
	private BigDecimal accountMoney;
	/** 借款金额 */
	private BigDecimal loanMoney;
	/** 还款金额 */
	private BigDecimal repayMoney;
	/** 还款总金额 */
	private BigDecimal repayTotalMoney;
	/** 创建时间 */
	private Date createTime;
	
	@Override
	public String toString() {
		return "CompanyAccountInfo [id=" + id + ", companyId=" + companyId
				+ ", memberId=" + memberId + ", mobile=" + mobile
				+ ", creditLine=" + creditLine + ", remainMoney=" + remainMoney
				+ ", accountMoney=" + accountMoney + ", loanMoney=" + loanMoney
				+ ", repayMoney=" + repayMoney + ", repayTotalMoney="
				+ repayTotalMoney + ", createTime=" + createTime + "]";
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
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public BigDecimal getCreditLine() {
		return creditLine;
	}
	public void setCreditLine(BigDecimal creditLine) {
		this.creditLine = creditLine;
	}
	public BigDecimal getRemainMoney() {
		return remainMoney;
	}
	public void setRemainMoney(BigDecimal remainMoney) {
		this.remainMoney = remainMoney;
	}
	public BigDecimal getAccountMoney() {
		return accountMoney;
	}
	public void setAccountMoney(BigDecimal accountMoney) {
		this.accountMoney = accountMoney;
	}
	public BigDecimal getLoanMoney() {
		return loanMoney;
	}
	public void setLoanMoney(BigDecimal loanMoney) {
		this.loanMoney = loanMoney;
	}
	public BigDecimal getRepayMoney() {
		return repayMoney;
	}
	public void setRepayMoney(BigDecimal repayMoney) {
		this.repayMoney = repayMoney;
	}
	public BigDecimal getRepayTotalMoney() {
		return repayTotalMoney;
	}
	public void setRepayTotalMoney(BigDecimal repayTotalMoney) {
		this.repayTotalMoney = repayTotalMoney;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
