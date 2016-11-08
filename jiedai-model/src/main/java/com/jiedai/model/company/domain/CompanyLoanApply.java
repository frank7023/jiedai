package com.jiedai.model.company.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.jiedai.model.company.eunms.CompanyLoanApply_;

/**
 * 【实体】企业借贷:借款申请
 * @author chenghailong
 *
 */
public class CompanyLoanApply implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 企业id */
	private Long companyId;
	/** 企业名称 */
	private String companyName;
	/** 会员id */
	private Long memberId;
	/** 注册手机号 */
	private String mobile;
	/** 会员名称 */
	private String memberName;
	/** 申请时间 */
	private Date applyTime;
	/** 申请金额 */
	private BigDecimal applyMoney;
	/** 申请期限 */
	@NotNull(message = "{companyLoanApply_applyTerm_notNull}")
	private Integer applyTerm;
	/** 申请原因 */
	private String applyReason;
	/** 申请进度（状态）(1, "申请中" 2,"账户已校验" 3,"账户校验失败" 4,"已授信" 5,"用户接受" 6,"用户拒绝" 7, "终审成功" 8, "终审拒绝") */
	private Integer applyStatus;
	/** 借款人是否同意(1：不同意 2：同意) */
	private Integer isagree;
	/** 实际放款金额 */
	@NotNull(message = "{companyLoanApply_actuallyMoney_notNull}")
	private BigDecimal actuallyMoney;
	/** 总利息 */
	private BigDecimal interest;
	/** 平台服务费 */
	private BigDecimal serviceCharge;
	/** 还款总金额 */
	private BigDecimal repayTotalMoney;
	/** (此公司)总授信额度 */
	@NotNull(message = "{companyLoanApply_creditLine_notNull}")
	private BigDecimal creditLine;
	/** 期望到款时间 */
	private String expectTime;
	/** 每月需还 */
	private BigDecimal repaymentMonth;
	/** 每月需还服务费 */
	private BigDecimal serviceMoneyMonth;
	/** 每月需还利息 */
	private BigDecimal interestMonth;
	/** 还款日 */
	@NotNull(message = "{companyLoanApply_repaymentDate_notNull}")
	private String repaymentDate;
	/** 创建时间 */
	private Date createTime;
	/** 设备id */
	private Long deviceId;
	/** 设备信息 */
	private String device;
	/** 渠道 */
	private Long channelId;
	/** 会员位置id */
	private Long memberPositionId;
	
	/**  */
	public CompanyLoanApply_.ApplyStatusEnum getApplyStatusStr(){
		return CompanyLoanApply_.ApplyStatusEnum.getInstance(this.getApplyStatus());
	}
	public CompanyLoanApply_.IsAgreeEnum getIsagreeStr(){
		return CompanyLoanApply_.IsAgreeEnum.getInstance(this.getIsagree());
	}
	
	@Override
	public String toString() {
		return "CompanyLoanApply [id=" + id + ", companyId=" + companyId
				+ ", companyName=" + companyName + ", memberId=" + memberId
				+ ", mobile=" + mobile + ", memberName=" + memberName
				+ ", applyTime=" + applyTime + ", applyMoney=" + applyMoney
				+ ", applyTerm=" + applyTerm + ", applyReason=" + applyReason
				+ ", applyStatus=" + applyStatus + ", isagree=" + isagree
				+ ", actuallyMoney=" + actuallyMoney + ", serviceCharge="
				+ serviceCharge + ", repayTotalMoney=" + repayTotalMoney
				+ ", creditLine=" + creditLine + ", expectTime=" + expectTime
				+ ", repaymentMonth=" + repaymentMonth + ", repaymentDate="
				+ repaymentDate + ", createTime=" + createTime + ", deviceId="
				+ deviceId + ", device=" + device + ", channelId=" + channelId
				+ ", memberPositionId=" + memberPositionId + ", interest="
				+ interest + ", serviceMoneyMonth=" + serviceMoneyMonth
				+ ", interestMonth=" + interestMonth + "]";
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public BigDecimal getApplyMoney() {
		return applyMoney;
	}
	public void setApplyMoney(BigDecimal applyMoney) {
		this.applyMoney = applyMoney;
	}
	public Integer getApplyTerm() {
		return applyTerm;
	}
	public void setApplyTerm(Integer applyTerm) {
		this.applyTerm = applyTerm;
	}
	public String getApplyReason() {
		return applyReason;
	}
	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}
	public Integer getApplyStatus() {
		return applyStatus;
	}
	public void setApplyStatus(Integer applyStatus) {
		this.applyStatus = applyStatus;
	}
	public Integer getIsagree() {
		return isagree;
	}
	public void setIsagree(Integer isagree) {
		this.isagree = isagree;
	}
	public BigDecimal getActuallyMoney() {
		return actuallyMoney;
	}
	public void setActuallyMoney(BigDecimal actuallyMoney) {
		this.actuallyMoney = actuallyMoney;
	}
	public BigDecimal getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(BigDecimal serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public BigDecimal getRepayTotalMoney() {
		return repayTotalMoney;
	}
	public void setRepayTotalMoney(BigDecimal repayTotalMoney) {
		this.repayTotalMoney = repayTotalMoney;
	}
	public BigDecimal getCreditLine() {
		return creditLine;
	}
	public void setCreditLine(BigDecimal creditLine) {
		this.creditLine = creditLine;
	}
	public String getExpectTime() {
		return expectTime;
	}
	public void setExpectTime(String expectTime) {
		this.expectTime = expectTime;
	}
	public BigDecimal getRepaymentMonth() {
		return repaymentMonth;
	}
	public void setRepaymentMonth(BigDecimal repaymentMonth) {
		this.repaymentMonth = repaymentMonth;
	}
	public String getRepaymentDate() {
		return repaymentDate;
	}
	public void setRepaymentDate(String repaymentDate) {
		this.repaymentDate = repaymentDate;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public Long getChannelId() {
		return channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	public Long getMemberPositionId() {
		return memberPositionId;
	}
	public void setMemberPositionId(Long memberPositionId) {
		this.memberPositionId = memberPositionId;
	}
	public BigDecimal getInterest() {
		return interest;
	}
	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}
	public BigDecimal getServiceMoneyMonth() {
		return serviceMoneyMonth;
	}
	public void setServiceMoneyMonth(BigDecimal serviceMoneyMonth) {
		this.serviceMoneyMonth = serviceMoneyMonth;
	}
	public BigDecimal getInterestMonth() {
		return interestMonth;
	}
	public void setInterestMonth(BigDecimal interestMonth) {
		this.interestMonth = interestMonth;
	} 
}
