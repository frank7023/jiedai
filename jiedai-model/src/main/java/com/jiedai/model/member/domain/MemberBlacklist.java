package com.jiedai.model.member.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 【实体】会员黑名单表
 * @author chenghailong
 *
 */
public class MemberBlacklist implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 会员表id */
	private Long memberId;
	/** 公司表id */
	private Long companyId;
	/** 创建时间 */
	private Date createTime;
	/** 期限 */
	private Date timeLimit;
	/** 解禁时间 */
	private Date removeTime;
	/** 状态 (1,解除黑名单状态（正常）； 2,黑名单状态) */
	private Integer status;
	/** 原因 */
	private String reason;
	/** 手机号 */
	private String mobile;
	/** get()/set() */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
