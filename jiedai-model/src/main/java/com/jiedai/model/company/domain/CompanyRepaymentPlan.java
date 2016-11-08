package com.jiedai.model.company.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.jiedai.model.company.eunms.CompanyRepaymentPlan_;

/**
 * 【实体】企业借贷:还款计划
 * @author chenghailong
 *
 */
public class CompanyRepaymentPlan implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 借款计划id */
	private Long loanOrdersId;
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
	/** 每月需还总额 */
	private BigDecimal repaymentTotal;
	/** 借款周期 */
	private Integer loanPeriods;
	/** 每月需还总额 */
	private BigDecimal repaymentMonth;
	/** 每月需还本金 */
	private BigDecimal repaymentCorpus;
	/** 每月需还服务费 */
	private BigDecimal repaymentService;
	/** 目前已还 */
	private BigDecimal alreadyRepaymentMoney;
	/** 借款日期 */
	private Date loanTime;
	/** 当前期数 */
	private Integer currentPeriods;
	/** 开始还款时间 */
	private Date startTime;
	/** 结束还款时间 */
	private Date endTime;
	/** 还款日期 */
	private Date repaymentTime;
	/** 还款金额 */
	private BigDecimal repaymentMoney;
	/** 状态(1：未还 2：已还 3：延期 ) */
	private Integer status;
	/** 是否全额还款(1：否 2：是) */
	private Integer isFullRepayment;
	/**  */
	public CompanyRepaymentPlan_.IsFullRepaymentEnum getIsFullRepaymentStr(){
		return CompanyRepaymentPlan_.IsFullRepaymentEnum.getInstance(this.getIsFullRepayment());
	}
	/**  */
	public CompanyRepaymentPlan_.StatusEnum getStatusStr(){
		return CompanyRepaymentPlan_.StatusEnum.getInstance(this.getStatus());
	}
	
	@Override
	public String toString() {
		return "CompanyRepaymentPlan [id=" + id + ", loanOrdersId="
				+ loanOrdersId + ", memberId=" + memberId + ", memberName="
				+ memberName + ", mobile=" + mobile + ", companyId="
				+ companyId + ", companyName=" + companyName
				+ ", repaymentTotal=" + repaymentTotal + ", loanPeriods="
				+ loanPeriods + ", repaymentMonth=" + repaymentMonth
				+ ", repaymentCorpus=" + repaymentCorpus
				+ ", repaymentService=" + repaymentService
				+ ", alreadyRepaymentMoney=" + alreadyRepaymentMoney
				+ ", loanTime=" + loanTime + ", currentPeriods="
				+ currentPeriods + ", startTime=" + startTime + ", endTime="
				+ endTime + ", repaymentTime=" + repaymentTime
				+ ", repaymentMoney=" + repaymentMoney + ", status=" + status
				+ ", isFullRepayment=" + isFullRepayment + "]";
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
	public Long getLoanOrdersId() {
		return loanOrdersId;
	}
	public void setLoanOrdersId(Long loanOrdersId) {
		this.loanOrdersId = loanOrdersId;
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
	public BigDecimal getRepaymentTotal() {
		return repaymentTotal;
	}
	public void setRepaymentTotal(BigDecimal repaymentTotal) {
		this.repaymentTotal = repaymentTotal;
	}
	public Integer getLoanPeriods() {
		return loanPeriods;
	}
	public void setLoanPeriods(Integer loanPeriods) {
		this.loanPeriods = loanPeriods;
	}
	public BigDecimal getRepaymentMonth() {
		return repaymentMonth;
	}
	public void setRepaymentMonth(BigDecimal repaymentMonth) {
		this.repaymentMonth = repaymentMonth;
	}
	public BigDecimal getRepaymentCorpus() {
		return repaymentCorpus;
	}
	public void setRepaymentCorpus(BigDecimal repaymentCorpus) {
		this.repaymentCorpus = repaymentCorpus;
	}
	public BigDecimal getRepaymentService() {
		return repaymentService;
	}
	public void setRepaymentService(BigDecimal repaymentService) {
		this.repaymentService = repaymentService;
	}
	public BigDecimal getAlreadyRepaymentMoney() {
		return alreadyRepaymentMoney;
	}
	public void setAlreadyRepaymentMoney(BigDecimal alreadyRepaymentMoney) {
		this.alreadyRepaymentMoney = alreadyRepaymentMoney;
	}
	public Date getLoanTime() {
		return loanTime;
	}
	public void setLoanTime(Date loanTime) {
		this.loanTime = loanTime;
	}
	public Integer getCurrentPeriods() {
		return currentPeriods;
	}
	public void setCurrentPeriods(Integer currentPeriods) {
		this.currentPeriods = currentPeriods;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getRepaymentTime() {
		return repaymentTime;
	}
	public void setRepaymentTime(Date repaymentTime) {
		this.repaymentTime = repaymentTime;
	}
	public BigDecimal getRepaymentMoney() {
		return repaymentMoney;
	}
	public void setRepaymentMoney(BigDecimal repaymentMoney) {
		this.repaymentMoney = repaymentMoney;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getIsFullRepayment() {
		return isFullRepayment;
	}
	public void setIsFullRepayment(Integer isFullRepayment) {
		this.isFullRepayment = isFullRepayment;
	}
}
