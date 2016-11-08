package com.jiedai.model.member.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 【实体】会员设备关联表
 * @author chenghailong
 *
 */
public class MemberDevice implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 设备id */
	private Long deviceId;
	/** 会员id */
	private Long memberId;
	/** 会员名称 */
	private String memberName;
	/** 创建时间 */
	private Date createTime;
	/** 最后登录时间 */
	private Date lastLoginTime;
	/** 手机号 */
	private String mobile;
	/** 账户id */
	private String accountId;
	/** device表对应的cid */
	private String cid;
	/** 设备机型 */
	private String model;
	/** 手机品牌 */
	private String brand;
	/** 会员位置id */
	private Long memberPositionId;
	/** get()/set() */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
