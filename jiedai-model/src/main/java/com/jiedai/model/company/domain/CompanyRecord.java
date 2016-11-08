package com.jiedai.model.company.domain;

import java.io.Serializable;

/**
 * 【实体】企业借贷:信息变更记录
 * @author chenghailong
 *
 */
public class CompanyRecord implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 关联-企业ID */
	private Long companyId;
	/** 关联-会员ID */
	private Long memberId;
	/** 旧企业名称 */
	private String oldCompanyName;
	/** 旧企业规模 */
	private String oldCompanyScale;
	/** 旧企业年收入 */
	private String oldCompanyYearincome;
	/** 旧组织机构代码 */
	private String oldCompanyOrgcode;
	/** 旧所在城市 */
	private String oldCompanyCity;
	/** 旧法人姓名 */
	private String oldCompanyCorporation;
	/** 旧法人身份证号码 */
	private String oldCompanyCorpIdnum;
	/** 旧法人电话 */
	private String oldCompanyCorpMobile;
	/** 旧企业开户银行 */
	private String oldCompanyBankname;
	/** 旧企业银行账号 */
	private String oldCompanyBankcode;
	/** 新企业名称 */
	private String newCompanyName;
	/** 新企业规模 */
	private String newCompanyScale;
	/** 新企业年收入 */
	private String newCompanyYearincome;
	/** 新组织机构代码 */
	private String newCompanyOrgcode;
	/** 新所在城市 */
	private String newCompanyCity;
	/** 新法人姓名 */
	private String newCompanyCorporation;
	/** 新法人身份证号码 */
	private String newCompanyCorpIdnum;
	/** 新法人电话 */
	private String newCompanyCorpMobile;
	/** 新企业开户银行 */
	private String newCompanyBankname;
	/** 新企业开户账号 */
	private String newCompanyBankcode;
	/** 旧企业经营许可证 */
	private String oldEnterpriseLicense;
	/** 新企业经营许可证 */
	private String newEnterpriseLicense;
	/** 旧企业工商营业执照 */
	private String oldBusinessLicense;
	/** 新企业工商营业执照 */
	private String newBusinessLicense;
	
	@Override
	public String toString() {
		return "CompanyUpdateRecord [id=" + id + ", companyId=" + companyId
				+ ", memberId=" + memberId + ", oldCompanyName="
				+ oldCompanyName + ", oldCompanyScale=" + oldCompanyScale
				+ ", oldCompanyYearincome=" + oldCompanyYearincome
				+ ", oldCompanyOrgcode=" + oldCompanyOrgcode
				+ ", oldCompanyCity=" + oldCompanyCity
				+ ", oldCompanyCorporation=" + oldCompanyCorporation
				+ ", oldCompanyCorpIdnum=" + oldCompanyCorpIdnum
				+ ", oldCompanyCorpMobile=" + oldCompanyCorpMobile
				+ ", oldCompanyBankname=" + oldCompanyBankname
				+ ", oldCompanyBankcode=" + oldCompanyBankcode
				+ ", newCompanyName=" + newCompanyName + ", newCompanyScale="
				+ newCompanyScale + ", newCompanyYearincome="
				+ newCompanyYearincome + ", newCompanyOrgcode="
				+ newCompanyOrgcode + ", newCompanyCity=" + newCompanyCity
				+ ", newCompanyCorporation=" + newCompanyCorporation
				+ ", newCompanyCorpIdnum=" + newCompanyCorpIdnum
				+ ", newCompanyCorpMobile=" + newCompanyCorpMobile
				+ ", newCompanyBankname=" + newCompanyBankname
				+ ", newCompanyBankcode=" + newCompanyBankcode
				+ ", oldEnterpriseLicense=" + oldEnterpriseLicense
				+ ", newEnterpriseLicense=" + newEnterpriseLicense
				+ ", oldBusinessLicense=" + oldBusinessLicense
				+ ", newBusinessLicense=" + newBusinessLicense + "]";
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
	public String getOldCompanyName() {
		return oldCompanyName;
	}
	public void setOldCompanyName(String oldCompanyName) {
		this.oldCompanyName = oldCompanyName;
	}
	public String getOldCompanyScale() {
		return oldCompanyScale;
	}
	public void setOldCompanyScale(String oldCompanyScale) {
		this.oldCompanyScale = oldCompanyScale;
	}
	public String getOldCompanyYearincome() {
		return oldCompanyYearincome;
	}
	public void setOldCompanyYearincome(String oldCompanyYearincome) {
		this.oldCompanyYearincome = oldCompanyYearincome;
	}
	public String getOldCompanyOrgcode() {
		return oldCompanyOrgcode;
	}
	public void setOldCompanyOrgcode(String oldCompanyOrgcode) {
		this.oldCompanyOrgcode = oldCompanyOrgcode;
	}
	public String getOldCompanyCity() {
		return oldCompanyCity;
	}
	public void setOldCompanyCity(String oldCompanyCity) {
		this.oldCompanyCity = oldCompanyCity;
	}
	public String getOldCompanyCorporation() {
		return oldCompanyCorporation;
	}
	public void setOldCompanyCorporation(String oldCompanyCorporation) {
		this.oldCompanyCorporation = oldCompanyCorporation;
	}
	public String getOldCompanyCorpIdnum() {
		return oldCompanyCorpIdnum;
	}
	public void setOldCompanyCorpIdnum(String oldCompanyCorpIdnum) {
		this.oldCompanyCorpIdnum = oldCompanyCorpIdnum;
	}
	public String getOldCompanyCorpMobile() {
		return oldCompanyCorpMobile;
	}
	public void setOldCompanyCorpMobile(String oldCompanyCorpMobile) {
		this.oldCompanyCorpMobile = oldCompanyCorpMobile;
	}
	public String getOldCompanyBankname() {
		return oldCompanyBankname;
	}
	public void setOldCompanyBankname(String oldCompanyBankname) {
		this.oldCompanyBankname = oldCompanyBankname;
	}
	public String getOldCompanyBankcode() {
		return oldCompanyBankcode;
	}
	public void setOldCompanyBankcode(String oldCompanyBankcode) {
		this.oldCompanyBankcode = oldCompanyBankcode;
	}
	public String getNewCompanyName() {
		return newCompanyName;
	}
	public void setNewCompanyName(String newCompanyName) {
		this.newCompanyName = newCompanyName;
	}
	public String getNewCompanyScale() {
		return newCompanyScale;
	}
	public void setNewCompanyScale(String newCompanyScale) {
		this.newCompanyScale = newCompanyScale;
	}
	public String getNewCompanyYearincome() {
		return newCompanyYearincome;
	}
	public void setNewCompanyYearincome(String newCompanyYearincome) {
		this.newCompanyYearincome = newCompanyYearincome;
	}
	public String getNewCompanyOrgcode() {
		return newCompanyOrgcode;
	}
	public void setNewCompanyOrgcode(String newCompanyOrgcode) {
		this.newCompanyOrgcode = newCompanyOrgcode;
	}
	public String getNewCompanyCity() {
		return newCompanyCity;
	}
	public void setNewCompanyCity(String newCompanyCity) {
		this.newCompanyCity = newCompanyCity;
	}
	public String getNewCompanyCorporation() {
		return newCompanyCorporation;
	}
	public void setNewCompanyCorporation(String newCompanyCorporation) {
		this.newCompanyCorporation = newCompanyCorporation;
	}
	public String getNewCompanyCorpIdnum() {
		return newCompanyCorpIdnum;
	}
	public void setNewCompanyCorpIdnum(String newCompanyCorpIdnum) {
		this.newCompanyCorpIdnum = newCompanyCorpIdnum;
	}
	public String getNewCompanyCorpMobile() {
		return newCompanyCorpMobile;
	}
	public void setNewCompanyCorpMobile(String newCompanyCorpMobile) {
		this.newCompanyCorpMobile = newCompanyCorpMobile;
	}
	public String getNewCompanyBankname() {
		return newCompanyBankname;
	}
	public void setNewCompanyBankname(String newCompanyBankname) {
		this.newCompanyBankname = newCompanyBankname;
	}
	public String getNewCompanyBankcode() {
		return newCompanyBankcode;
	}
	public void setNewCompanyBankcode(String newCompanyBankcode) {
		this.newCompanyBankcode = newCompanyBankcode;
	}
	public String getOldEnterpriseLicense() {
		return oldEnterpriseLicense;
	}
	public void setOldEnterpriseLicense(String oldEnterpriseLicense) {
		this.oldEnterpriseLicense = oldEnterpriseLicense;
	}
	public String getNewEnterpriseLicense() {
		return newEnterpriseLicense;
	}
	public void setNewEnterpriseLicense(String newEnterpriseLicense) {
		this.newEnterpriseLicense = newEnterpriseLicense;
	}
	public String getOldBusinessLicense() {
		return oldBusinessLicense;
	}
	public void setOldBusinessLicense(String oldBusinessLicense) {
		this.oldBusinessLicense = oldBusinessLicense;
	}
	public String getNewBusinessLicense() {
		return newBusinessLicense;
	}
	public void setNewBusinessLicense(String newBusinessLicense) {
		this.newBusinessLicense = newBusinessLicense;
	}
}
