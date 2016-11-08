package com.jiedai.model.company.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 【实体】企业借贷:借款合同
 * @author chenghailong
 *
 */
public class CompanyContract implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 合同编号 */
	private String contractNumber;
	/** 签订日期 */
	private Date contractDate;
	/** 合同类型 */
	private Integer contractType;
	/** 交易号 */
	private Integer tradeNumber;
	/** member表id */
	private Long memberId;
	/** 会员姓名 */
	private String memberName;
	/** 身份证号码 */
	private String identityCardId;
	/** 手机号码 */
	private String mobile;
	/** 甲方 */
	private String partyACompanyname;
	/** 营业执照 */
	private String partyALicense;
	/** 甲方法人代表 */
	private String partyALegalperson;
	/** 乙方companyID */
	private Integer partyBCompanyId;
	/** 乙方 */
	private String partyBCompanyname;
	/** 乙方营业执照 */
	private String partyBLicense;
	/** 乙方法人代表 */
	private String partyBLegalperson;
	/** 借款金额 */
	private BigDecimal loanMoney;
	/** 合同路径 */
	private String path;
	/** 创建时间 */
	private Date createTime;
	/** 合同状态（0：生效 1：失效） */
	private Integer status;
	
	@Override
	public String toString() {
		return "CompanyContract [id=" + id + ", contractNumber="
				+ contractNumber + ", contractDate=" + contractDate
				+ ", contractType=" + contractType + ", tradeNumber="
				+ tradeNumber + ", memberId=" + memberId + ", memberName="
				+ memberName + ", identityCardId=" + identityCardId
				+ ", mobile=" + mobile + ", partyACompanyname="
				+ partyACompanyname + ", partyALicense=" + partyALicense
				+ ", partyALegalperson=" + partyALegalperson
				+ ", partyBCompanyId=" + partyBCompanyId
				+ ", partyBCompanyname=" + partyBCompanyname
				+ ", partyBLicense=" + partyBLicense + ", partyBLegalperson="
				+ partyBLegalperson + ", loanMoney=" + loanMoney + ", path="
				+ path + ", createTime=" + createTime + ", status=" + status
				+ "]";
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
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public Date getContractDate() {
		return contractDate;
	}
	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}
	public Integer getContractType() {
		return contractType;
	}
	public void setContractType(Integer contractType) {
		this.contractType = contractType;
	}
	public Integer getTradeNumber() {
		return tradeNumber;
	}
	public void setTradeNumber(Integer tradeNumber) {
		this.tradeNumber = tradeNumber;
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
	public String getIdentityCardId() {
		return identityCardId;
	}
	public void setIdentityCardId(String identityCardId) {
		this.identityCardId = identityCardId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPartyACompanyname() {
		return partyACompanyname;
	}
	public void setPartyACompanyname(String partyACompanyname) {
		this.partyACompanyname = partyACompanyname;
	}
	public String getPartyALicense() {
		return partyALicense;
	}
	public void setPartyALicense(String partyALicense) {
		this.partyALicense = partyALicense;
	}
	public String getPartyALegalperson() {
		return partyALegalperson;
	}
	public void setPartyALegalperson(String partyALegalperson) {
		this.partyALegalperson = partyALegalperson;
	}
	public Integer getPartyBCompanyId() {
		return partyBCompanyId;
	}
	public void setPartyBCompanyId(Integer partyBCompanyId) {
		this.partyBCompanyId = partyBCompanyId;
	}
	public String getPartyBCompanyname() {
		return partyBCompanyname;
	}
	public void setPartyBCompanyname(String partyBCompanyname) {
		this.partyBCompanyname = partyBCompanyname;
	}
	public String getPartyBLicense() {
		return partyBLicense;
	}
	public void setPartyBLicense(String partyBLicense) {
		this.partyBLicense = partyBLicense;
	}
	public String getPartyBLegalperson() {
		return partyBLegalperson;
	}
	public void setPartyBLegalperson(String partyBLegalperson) {
		this.partyBLegalperson = partyBLegalperson;
	}
	public BigDecimal getLoanMoney() {
		return loanMoney;
	}
	public void setLoanMoney(BigDecimal loanMoney) {
		this.loanMoney = loanMoney;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
