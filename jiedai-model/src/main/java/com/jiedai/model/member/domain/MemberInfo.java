package com.jiedai.model.member.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 【实体】会员基础信息表
 * @author chenghailong
 *
 */
public class MemberInfo implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 手机号码 */
	private String mobile;
	/** 用户姓名 */
	private String memberName;
	/** 身份证号 */
	private String idNum;
	/** 用户头像 */
	private String headImage;
	/** 支付密码 */
	private String paymentCode;
	/** 会员等级 */
	private Integer memberGrade;
	/** 用户状态 1：正常 2：黑名单 3：禁用 */
	private Integer status;
	/** 身份证正面照(找回密码，上传图片) */
	private String forgetPwdImg1;
	/** 身份证反面照(找回密码，上传图片) */
	private String forgetPwdImg2;
	/** 注册时间 */
	private Date registrationDate;
	/** 最后修改时间 */
	private Date lastUpdatetime;
	/** 最后登录时间 */
	private Date loginDate;
	/** 注册时的站点ID */
	private Integer siteId;
	/** 版本号 */
	private String siteVersion;
	/** 注册渠道 */
	private Integer channelId;
	/** 位置信息 */
	private String positions;
	/** 设备信息 */
	private String device;
	/** 创建时间 */
	private Date createTime;
	/** 会员位置id */
	private Long memberPositionId;
	/** 是否拥有公司 1:拥有公司 2：未拥有公司 */
	private Integer isCompany;
	/** 是否有个人借款 1:有 2：没有 */
	private Integer isMemberLoan;
	/** 个人借款时间 */
	private Date memberLoanTime;
	/** 是否有公司借款 1:有 2：没有 */
	private Integer isCompanyLoan;
	/** 公司借款时间 */
	private Date companyTime;
	/** 绑卡状态 1：已绑卡 2：未绑卡 */
	private Integer bindStatus;
	/** 绑卡时间 */
	private Date bindTime;
	/** get()/set() */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
