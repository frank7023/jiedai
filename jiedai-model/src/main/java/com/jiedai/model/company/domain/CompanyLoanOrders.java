package com.jiedai.model.company.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 【实体】企业借贷:借款订单
 * @author chenghailong
 *
 */
public class CompanyLoanOrders implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 申请表id */
	private Long applyId;
	/** 用户id */
	private Long memberId;
	/** 会员名称 */
	private String memberName;
	/** 注册手机号 */
	private String mobile;
	/** 企业id */
	private Long companyId;
	/** 公司名称 */
	private String companyName;
	/** 总还款金额 */
	private BigDecimal loanTotal;
	/** 实际放款金额 */
	private BigDecimal actuallyMoney;
	/** 借款期限 */
	private Integer applyTerm;
	/** 平台服务费 */
	private BigDecimal serviceCharge;
	/** 每期共需还款金额 */
	private BigDecimal repaymentMonth;
	/** 每月还款日 */
	private String repaymentTime;
	/** 已还期数 */
	private Integer alreadyRepayCount;
	/** 已还金额 */
	private BigDecimal alreadyRepayMoney;
	/** 未还金额 */
	private BigDecimal remainMoney;
	/** 状态(删除此状态) */
	private Integer status;
	
	@Override
	public String toString() {
		return "CompanyLoanOrders [id=" + id + ", applyId=" + applyId
				+ ", memberId=" + memberId + ", memberName=" + memberName
				+ ", mobile=" + mobile + ", companyId=" + companyId
				+ ", companyName=" + companyName + ", loanTotal=" + loanTotal
				+ ", actuallyMoney=" + actuallyMoney + ", applyTerm="
				+ applyTerm + ", serviceCharge=" + serviceCharge
				+ ", repaymentMonth=" + repaymentMonth + ", repaymentTime="
				+ repaymentTime + ", alreadyRepayCount=" + alreadyRepayCount
				+ ", alreadyRepayMoney=" + alreadyRepayMoney + ", remainMoney="
				+ remainMoney + ", status=" + status + "]";
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
	public Long getApplyId() {
		return applyId;
	}
	public void setApplyId(Long applyId) {
		this.applyId = applyId;
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
	public BigDecimal getLoanTotal() {
		return loanTotal;
	}
	public void setLoanTotal(BigDecimal loanTotal) {
		this.loanTotal = loanTotal;
	}
	public BigDecimal getActuallyMoney() {
		return actuallyMoney;
	}
	public void setActuallyMoney(BigDecimal actuallyMoney) {
		this.actuallyMoney = actuallyMoney;
	}
	public Integer getApplyTerm() {
		return applyTerm;
	}
	public void setApplyTerm(Integer applyTerm) {
		this.applyTerm = applyTerm;
	}
	public BigDecimal getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(BigDecimal serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public BigDecimal getRepaymentMonth() {
		return repaymentMonth;
	}
	public void setRepaymentMonth(BigDecimal repaymentMonth) {
		this.repaymentMonth = repaymentMonth;
	}
	public String getRepaymentTime() {
		return repaymentTime;
	}
	public void setRepaymentTime(String repaymentTime) {
		this.repaymentTime = repaymentTime;
	}
	public Integer getAlreadyRepayCount() {
		return alreadyRepayCount;
	}
	public void setAlreadyRepayCount(Integer alreadyRepayCount) {
		this.alreadyRepayCount = alreadyRepayCount;
	}
	public BigDecimal getAlreadyRepayMoney() {
		return alreadyRepayMoney;
	}
	public void setAlreadyRepayMoney(BigDecimal alreadyRepayMoney) {
		this.alreadyRepayMoney = alreadyRepayMoney;
	}
	public BigDecimal getRemainMoney() {
		return remainMoney;
	}
	public void setRemainMoney(BigDecimal remainMoney) {
		this.remainMoney = remainMoney;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
