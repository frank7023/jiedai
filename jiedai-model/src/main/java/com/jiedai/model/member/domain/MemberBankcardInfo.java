package com.jiedai.model.member.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 【实体】会员-个人/企业:银行卡-基本信息
 * @author chenghailong
 *
 */
public class MemberBankcardInfo implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/**  */
	private Long id;
	/** 会员id */
	private Long memberId;
	/** 商户号 */
	private String oidPartner;
	/** 手机号 */
	private String mobile;
	/** 账户名称 */
	private String memberName;
	/** 银行卡号 */
	private String bankcardNum;
	/** 身份证号 */
	private String idNum;
	/** 银行编码 */
	private String bankCode;
	/** 银行名称 */
	private String bankName;
	/** 支行名称 */
	private String subbranchBank;
	/** 卡类型，1：借记卡 2：信用卡 */
	private Integer bankType;
	/** 省id */
	private String provinceId;
	/** 省名称  */
	private String provinceName;
	/**  */
	private String cityId;
	/**  */
	private String cityName;
	/**  */
	private Integer status;
	/**  */
	private Date createTime;
	/**  */
	private Date dealTime;
	/**  */
	private Date useTime;
	/**  */
	private String agreeNo;
	/**  */
	private Integer gatewayId;
	/**  */
	private Integer siteId;
	/**  */
	private String siteVersion;
	/**  */
	private Integer channelId;
	/**  */
	private String deviceId;
	/**  */
	private String device;
	/**  */
	private Integer version;
	/** get()/set() */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
