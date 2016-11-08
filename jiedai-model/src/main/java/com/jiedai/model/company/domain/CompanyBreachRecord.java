package com.jiedai.model.company.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 * 【实体】企业借贷:违约记录
 * @author mubosong
 *
 */
public class CompanyBreachRecord implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 会员id */
	private Long memberId;
	/** 注册时手机号 */
	@NotNull(message = "{companyBreach_mobile_notNull}")
	private String mobile;
	/** 企业id */
	private Long companyId;
	/** 企业借款订单id */
	private Long companyLoanordersId;
	/** 企业还款计划id */
	private Long companyRepayplanId;
	/** 还款金额 */
	private BigDecimal repayMoney;
	/** 还款日期 */
	private Date repayTime;
	/** 创建时间 */
	private Date createTime;
	/** 违约次数 */
	private Integer breachNum;
	/** 违约金 */
	private BigDecimal breachMoney;
	/** 会员名称 */
	private String memberName;
	/** 公司名称 */
	@NotNull(message = "{companyBreach_companyName_notNull}")
	private String companyName;
	/** 是否为erp操作 */
	private Integer isErp;
	/** 创建人 */
	private String createBy;
	/** 更新人 */
	private String updateBy;
	
	@Override
	public String toString() {
		return "CompanyBreachRecord [id=" + id + ", memberId=" + memberId
				+ ", companyId=" + companyId + ", companyLoanordersId="
				+ companyLoanordersId + ", companyRepayplanId="
				+ companyRepayplanId + ", repayMoney=" + repayMoney
				+ ", repayTime=" + repayTime + ", createTime=" + createTime
				+ ", breachNum=" + breachNum + ", breachMoney=" + breachMoney
				+ ", memberName=" + memberName + ", companyName=" + companyName
				+ ", createBy=" + createBy + ", updateBy=" + updateBy
				+ ", mobile=" + mobile + ", isErp=" + isErp + "]";
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
	public Long getCompanyLoanordersId() {
		return companyLoanordersId;
	}
	public void setCompanyLoanordersId(Long companyLoanordersId) {
		this.companyLoanordersId = companyLoanordersId;
	}
	public Long getCompanyRepayplanId() {
		return companyRepayplanId;
	}
	public void setCompanyRepayplanId(Long companyRepayplanId) {
		this.companyRepayplanId = companyRepayplanId;
	}
	public BigDecimal getRepayMoney() {
		return repayMoney;
	}
	public void setRepayMoney(BigDecimal repayMoney) {
		this.repayMoney = repayMoney;
	}
	public Date getRepayTime() {
		return repayTime;
	}
	public void setRepayTime(Date repayTime) {
		this.repayTime = repayTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getBreachNum() {
		return breachNum;
	}
	public void setBreachNum(Integer breachNum) {
		this.breachNum = breachNum;
	}
	public BigDecimal getBreachMoney() {
		return breachMoney;
	}
	public void setBreachMoney(BigDecimal breachMoney) {
		this.breachMoney = breachMoney;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getIsErp() {
		return isErp;
	}
	public void setIsErp(Integer isErp) {
		this.isErp = isErp;
	}
}
