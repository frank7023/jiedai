package com.jiedai.model.member.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 * 【实体】会员-个人/企业:银行卡-确认信息 [第三方交互的数据]
 * @author chenghailong
 *
 */
public class MemberBankcardEnsure implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/**  */
	@NotNull
	private Long id;
	/**  */
	private Long companyId;
	/**  */
	private String companyName;
	/**  */
	private Long membrId;
	/**  */
	private BigDecimal randomMoney; //随即生成要打的钱数
	/**  */
	private Date createTime;
	/**  */
	private Integer status; //1:已通过 2:未通过，3: 待验证
	/**  */
	private String auditor;
	/**  */
	private Date auditTime;
	/**  */
	@NotNull
	private BigDecimal realityMoney; //财务实际看到的打款数
	/** get()/set() */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
