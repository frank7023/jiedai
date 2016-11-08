package com.jiedai.model.company.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 * 【实体】企业借贷:打款记录
 * @author chenghailong
 *
 */
public class CompanyLoanRecord implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	@NotNull
	private Long id;
	/** 借款订单id */
	private Long loanId;
	/** member表id */
	private Long memberId;
	/** 企业id */
	private Long companyId;
	/** 企业名称 */
	private String companyName;
	/** 手机号码 */
	private String mobile;
	/** 借款人姓名 */
	private String memberName;
	/** 身份证号码 */
	private String idNum;
	/** 打款金额 */
	private BigDecimal loanMoney;
	/** 订单号 */
	private String orderNum;
	/** 发起时间 */
	private Date inputTime;
	/** 处理时间 */
	private Date dealTime;
	/** 状态 */
	@NotNull
	private Integer status;
	/** 银行卡号 */
	private String bankCardNo;
	/** 银行编码 */
	private String bankCode;
	/** 银行名称 */
	private String bankName;
	/** 支行名称 */
	private String branchName;
	/** 省ID */
	private String provinceId;
	/** 省名称 */
	private String provinceName;
	/** 市ID */
	private String cityId;
	/** 市名称 */
	private String cityName;
	/** 站点id */
	private Integer siteId;
	/** 站点版本 */
	private Integer siteVersion;
	/** 频道id */
	private Integer channelId;
	/** 设备id */
	private Long deviceId;
	/** 设备 */
	private String device;
	/** 手续费 */
	private BigDecimal feeAmount;
	/** 类型 */
	private Integer type;
	
	@Override
	public String toString() {
		return "CompanyLoanRecord [id=" + id + ", loanId=" + loanId
				+ ", memberId=" + memberId + ", companyId=" + companyId
				+ ", companyName=" + companyName + ", mobile=" + mobile
				+ ", memberName=" + memberName + ", idNum=" + idNum
				+ ", loanMoney=" + loanMoney + ", orderNum=" + orderNum
				+ ", inputTime=" + inputTime + ", dealTime=" + dealTime
				+ ", status=" + status + ", bankCardNo=" + bankCardNo
				+ ", bankCode=" + bankCode + ", bankName=" + bankName
				+ ", branchName=" + branchName + ", provinceId=" + provinceId
				+ ", provinceName=" + provinceName + ", cityId=" + cityId
				+ ", cityName=" + cityName + ", siteId=" + siteId
				+ ", siteVersion=" + siteVersion + ", channelId=" + channelId
				+ ", deviceId=" + deviceId + ", device=" + device
				+ ", feeAmount=" + feeAmount + ", type=" + type + "]";
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
	public Long getLoanId() {
		return loanId;
	}
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public BigDecimal getLoanMoney() {
		return loanMoney;
	}
	public void setLoanMoney(BigDecimal loanMoney) {
		this.loanMoney = loanMoney;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public Date getInputTime() {
		return inputTime;
	}
	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}
	public Date getDealTime() {
		return dealTime;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Integer getSiteId() {
		return siteId;
	}
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}
	public Integer getSiteVersion() {
		return siteVersion;
	}
	public void setSiteVersion(Integer siteVersion) {
		this.siteVersion = siteVersion;
	}
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
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
	public BigDecimal getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
}
