package com.jiedai.model.member.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 【实体】会员位置信息表
 * @author chenghailong
 *
 */
public class MemberLocation implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/** 主键-自增 */
	private Long id;
	/** 用户id */
	private Long memberId;
	/** 手机号码 */
	private String mobile;
	/** 定位省名称 */
	private String proviceNameLocation;
	/** 选择省名称 */
	private String proviceNameSelect;
	/** 定位市名称 */
	private String cityNameLocation;
	/** 选择市名称 */
	private String cityNameSelect;
	/** 创建时间 */
	private Date createTime;
	/** 具体的街道信息 */
	private String streetInfo;
	/** X 坐标 */
	private String xPoint;
	/** y坐标 */
	private String yPoint;
	/** 操作说明 */
	private String operating;
	/** get()/set() */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
