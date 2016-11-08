package com.jiedai.model.company.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 【实体】企业借贷:还款记录
 * @author chenghailong
 *
 */
public class CompanyRepaymentRecord implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 还款计划id */
	private Long loanOrdersId;
	/** 借款订单id */
	private Long planId;
	/** 会员id */
	private Long memberId;
	/** 企业ID */
	private Long companyId;
	/** 会员名字 */
	private String memberName;
	/** 手机号码 */
	private String mobile;
	/** 还款金额 */
	private BigDecimal repaymentMoney;
	/** 还款状态,1 成功，2 失败，3 处理中 */
	private Integer status;
	/** 订单编码 */
	private String orderNum;
	/** 发起时间 */
	private Date inputTime;
	/** 处理时间 */
	private Date dealTime;
	/** 身份证号码 */
	private String idNum;
	/** 银行卡号 */
	private String bankcardNum;
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
	/** 渠道id */
	private Long channelId;
	/** 设备id */
	private String deviceId;
	/** 设备 */
	private String device;
	/** 手续费 */
	private BigDecimal feeAmount;
	/** 费率 */
	private BigDecimal rate;
	/** 个人/企业借贷 */
	private String projectType;
	/** 是否第一次充值，1非第一次充值，2第一次充值 */
	private Integer flag;
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
	public Long getPlanId() {
		return planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
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
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public String getBankcardNum() {
		return bankcardNum;
	}
	public void setBankcardNum(String bankcardNum) {
		this.bankcardNum = bankcardNum;
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
	public Long getChannelId() {
		return channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
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
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
}
