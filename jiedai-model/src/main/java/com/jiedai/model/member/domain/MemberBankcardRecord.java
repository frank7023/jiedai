package com.jiedai.model.member.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 【实体】会员-个人/企业:银行卡-变更记录
 * @author chenghailong
 *
 */
public class MemberBankcardRecord implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/**  */
	private Long id;
	/**  */
	private Long memberId;
	/**  */
	private Long memberBankcardId;
	/**  */
	private String oidPartner;
	/**  */
	private String mobile;
	/**  */
	private String memberName;
	/**  */
	private String bankcardNum;
	/**  */
	private String idNum;
	/**  */
	private String bankCode;
	/**  */
	private String bankName;
	/**  */
	private String subbranchBank;
	/**  */
	private Integer bankType;
	/**  */
	private String provinceId;
	/**  */
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
	private String unbindBy;
	/**  */
	private Date unbindTime;
	/**  */
	private Integer version;
	/** get()/set() */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
