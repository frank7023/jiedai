package com.jiedai.model.product.domian;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.jiedai.model.product.enums.ProjectInfo_;

/**
 * 【实体】产品项目
 * @author chenghailong
 *
 */
public class ProjectInfo implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 产品名称 */
	@NotNull(message = "{project_name_notNull}")
	private String name;
	/** 标题 */
	private String title;
	/** 排序 */
	private String orders;
	/** 默认描述 */
	private String defaultDescribe;
	/** 借款描述 */
	private String loanDescribe;
	/** 状态 */
	@NotNull(message = "{project_status_notNull}")
	private Integer status;
	/** 上限金额 */
	private BigDecimal limitMoney;
	/** 广告语 */
	private String slogan;
	/** 图片a */
	private Long picIdA;
	/** 图片b */
	private Long picIdB;
	/** 图片c */
	private Long picIdC;
	/** url_a */
	private String urlA;
	/** url_b */
	private String urlB;
	/** url_c */
	private String urlC;
	/** 类型 */
	@NotNull(message = "{project_type_notNull}")
	private Integer type;
	/** 创建人 */
	private String createBy;
	/** 创建时间 */
	private Date createTime;
	/** 更新人 */
	private String updateBy;
	/** 更新时间 */
	private Date updateTime;
	/** 发布人 */
	private String publishBy;
	/** 发布时间 */
	private Date publishTime;
	
	/** 状态-枚举 */
	public ProjectInfo_.StatusEnum getStatusStr(){
		return ProjectInfo_.StatusEnum.getInstance(this.getStatus());
	}
	/** 类型-枚举 */
	public ProjectInfo_.TypeEnum getTypeStr(){
		return ProjectInfo_.TypeEnum.getInstance(this.getType());
	}
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", title=" + title
				+ ", defaultDescribe=" + defaultDescribe + ", loanDescribe="
				+ loanDescribe + ", status=" + status + ", limitMoney="
				+ limitMoney + ", slogan=" + slogan + ", picIdA=" + picIdA
				+ ", picIdB=" + picIdB + ", picIdC=" + picIdC + ", urlA="
				+ urlA + ", urlB=" + urlB + ", urlC=" + urlC + ", type=" + type
				+ ", createBy=" + createBy + ", createTime=" + createTime
				+ ", updateBy=" + updateBy + ", updateTime=" + updateTime
				+ ", publishBy=" + publishBy + ", publishTime=" + publishTime
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOrders() {
		return orders;
	}
	public void setOrders(String orders) {
		this.orders = orders;
	}
	public String getDefaultDescribe() {
		return defaultDescribe;
	}
	public void setDefaultDescribe(String defaultDescribe) {
		this.defaultDescribe = defaultDescribe;
	}
	public String getLoanDescribe() {
		return loanDescribe;
	}
	public void setLoanDescribe(String loanDescribe) {
		this.loanDescribe = loanDescribe;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public BigDecimal getLimitMoney() {
		return limitMoney;
	}
	public void setLimitMoney(BigDecimal limitMoney) {
		this.limitMoney = limitMoney;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public Long getPicIdA() {
		return picIdA;
	}
	public void setPicIdA(Long picIdA) {
		this.picIdA = picIdA;
	}
	public Long getPicIdB() {
		return picIdB;
	}
	public void setPicIdB(Long picIdB) {
		this.picIdB = picIdB;
	}
	public Long getPicIdC() {
		return picIdC;
	}
	public void setPicIdC(Long picIdC) {
		this.picIdC = picIdC;
	}
	public String getUrlA() {
		return urlA;
	}
	public void setUrlA(String urlA) {
		this.urlA = urlA;
	}
	public String getUrlB() {
		return urlB;
	}
	public void setUrlB(String urlB) {
		this.urlB = urlB;
	}
	public String getUrlC() {
		return urlC;
	}
	public void setUrlC(String urlC) {
		this.urlC = urlC;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getPublishBy() {
		return publishBy;
	}
	public void setPublishBy(String publishBy) {
		this.publishBy = publishBy;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
}
