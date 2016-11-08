package com.jiedai.model.company.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 【实体】企业借贷:基本信息
 * @author chenghailong
 *
 */
public class CompanyInfo implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 企业名称 */
	private String companyName;
	/** 企业规模 */
	private String companyScale;
	/** 企业年收入 */
	private String companyYearincome;
	/** 组织机构代码 */
	private String companyOrgCode;
	/** 所在城市 */
	private String companyCity;
	/** 法人姓名 */
	private String corpartion;
	/** 法人身份证号码 */
	private String corpartonIdnum;
	/** 法人电话 */
	private String corpartonMobile;
	/** 企业开户银行 */
	private String companyBankname;
	/** 企业银行账号 */
	private String companyBankcode;
	/** 企业经营许可证 */
	private String enterpriseLicense;
	/** 企业工商营业执照 */
	private String businessLicense;
	/** 组织机构代码证 */
	private String organizationCertificate;
	/** 关联member表id */
	private Long memberId;
	/** 创建时间 */
	private Date createTime;
	/** 设备 */
	private Long deviceId;
	/** 设备信息 */
	private String device;
	/** 渠道 */
	private Long channelId;
	
	@Override
	public String toString() {
		return "CompanyInfo [id=" + id + ", companyName=" + companyName
				+ ", companyScale=" + companyScale + ", companyYearincome="
				+ companyYearincome + ", companyOrgCode=" + companyOrgCode
				+ ", companyCity=" + companyCity + ", corpartion=" + corpartion
				+ ", corpartonIdnum=" + corpartonIdnum + ", corpartonMobile="
				+ corpartonMobile + ", companyBankname=" + companyBankname
				+ ", companyBankcode=" + companyBankcode
				+ ", enterpriseLicense=" + enterpriseLicense
				+ ", businessLicense=" + businessLicense
				+ ", organizationCertificate=" + organizationCertificate
				+ ", memberId=" + memberId + ", createTime=" + createTime
				+ ", deviceId=" + deviceId + ", device=" + device
				+ ", channelId=" + channelId + "]";
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyScale() {
		return companyScale;
	}
	public void setCompanyScale(String companyScale) {
		this.companyScale = companyScale;
	}
	public String getCompanyYearincome() {
		return companyYearincome;
	}
	public void setCompanyYearincome(String companyYearincome) {
		this.companyYearincome = companyYearincome;
	}
	public String getCompanyOrgCode() {
		return companyOrgCode;
	}
	public void setCompanyOrgCode(String companyOrgCode) {
		this.companyOrgCode = companyOrgCode;
	}
	public String getCompanyCity() {
		return companyCity;
	}
	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}
	public String getCorpartion() {
		return corpartion;
	}
	public void setCorpartion(String corpartion) {
		this.corpartion = corpartion;
	}
	public String getCorpartonIdnum() {
		return corpartonIdnum;
	}
	public void setCorpartonIdnum(String corpartonIdnum) {
		this.corpartonIdnum = corpartonIdnum;
	}
	public String getCorpartonMobile() {
		return corpartonMobile;
	}
	public void setCorpartonMobile(String corpartonMobile) {
		this.corpartonMobile = corpartonMobile;
	}
	public String getCompanyBankname() {
		return companyBankname;
	}
	public void setCompanyBankname(String companyBankname) {
		this.companyBankname = companyBankname;
	}
	public String getCompanyBankcode() {
		return companyBankcode;
	}
	public void setCompanyBankcode(String companyBankcode) {
		this.companyBankcode = companyBankcode;
	}
	public String getEnterpriseLicense() {
		return enterpriseLicense;
	}
	public void setEnterpriseLicense(String enterpriseLicense) {
		this.enterpriseLicense = enterpriseLicense;
	}
	public String getBusinessLicense() {
		return businessLicense;
	}
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}
	public String getOrganizationCertificate() {
		return organizationCertificate;
	}
	public void setOrganizationCertificate(String organizationCertificate) {
		this.organizationCertificate = organizationCertificate;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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
}
