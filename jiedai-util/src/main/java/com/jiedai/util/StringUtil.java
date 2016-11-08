package com.jiedai.util;

import java.util.Random;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串-工具类: 继承了apache的StringUtils
 * @author chenghailong
 *
 */
public class StringUtil extends StringUtils {
	
	/** 工具类-测试 */
	public static void main(String[] args) {
		System.out.println("手机号："+markSecurityMobile("  135-5214-5073  "));
		System.out.println("姓氏："+markSecuritySurname("欧阳"));
		System.out.println("名字："+markSecurityName("欧阳"));
		System.out.println("中间："+markSecurityUsername("欧阳"));
	}
	
	/**
	 * 手机号码脱敏 : 135****1234
	 */
	public static String markSecurityMobile(String mobilePhone) {
		//判空
		if(StringUtils.isBlank(mobilePhone)){
			return "";
		}
		//去掉特殊字符
		mobilePhone = mobilePhone.replace("-", "");
		mobilePhone = mobilePhone.replaceAll(" ", "");
		//长度校验
		int length = mobilePhone.length();
		if(length != 11){
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<length; i++){
				sb.append("*");
			}
			return sb.toString();
		}
		//脱敏
		return mobilePhone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
	}

	/**
	 * 银行卡脱敏: 普通借记银行卡号19位数，信用卡16位卡号；活期存折账号18位数
	 */
	public static String markSecurityBankCard(String bankCard) {
		//判空
		if(StringUtils.isBlank(bankCard) ){
			return "";
		}
		//去掉特殊字符
		bankCard = bankCard.replace("-", "");
		bankCard = bankCard.replaceAll(" ", "");
		//长度校验
		int length = bankCard.length();
		if(length < 8){
			return bankCard;
		}
		//脱敏:前-中-后
		String SECURITY_MASK_CARD = "********";
		StringBuilder sb = new StringBuilder();
		sb.append(bankCard.substring(0, 4));
		sb.append(SECURITY_MASK_CARD);
		sb.append(bankCard.substring(length-4, length));
		return sb.toString();
	}

	/**
	 * 身份证号码脱敏: 15位 或 18位
	 */
	public static String markSecurityIdCard(String bankCard) {
		//判空
		if(StringUtils.isBlank(bankCard)){
			return "";
		}
		//去掉特殊字符
		bankCard = bankCard.replace("-", "");
		bankCard = bankCard.replaceAll(" ", "");
		//长度校验
		int length = bankCard.length();
		if(length < 15){
			return bankCard;
		}
		//脱敏:前-中-后
		String SECURITY_MASK_ID_CARD = "**********";
		StringBuilder sb = new StringBuilder();
		sb.append(bankCard.substring(0, 4));
		sb.append(SECURITY_MASK_ID_CARD);
		sb.append(bankCard.substring(length-4, length));
		return sb.toString();
	}

	/**
	 * 姓氏脱敏
	 */
	public static String markSecuritySurname(String username) {
		//判空
		if(StringUtils.isBlank(username)){
			return "";
		}
		//去掉特殊字符
		username = username.replace("-", "");
		username = username.replaceAll(" ", "");
		//长度校验
		int length = username.length();
		if(length < 2){
			return "*";
		}
		//脱敏:前-后
		StringBuilder sb = new StringBuilder();
		sb.append("*");
		sb.append(username.substring(1, length));
		return sb.toString();
	}
	
	/**
	 * 名字脱敏
	 */
	public static String markSecurityName(String username) {
		//判空
		if(StringUtils.isBlank(username)){
			return "";
		}
		//去掉特殊字符
		username = username.replace("-", "");
		username = username.replaceAll(" ", "");
		//长度校验
		int length = username.length();
		if(length < 2){
			return "*";
		}
		//脱敏:前-中-后
		StringBuilder sb = new StringBuilder();
		sb.append(username.substring(0,1));
		for(int i=0; i<length-1; i++){
			sb.append("*");
		}
		return sb.toString();
	}
	
	/**
	 * 姓名中间脱敏
	 */
	public static String markSecurityUsername(String username) {
		//判空
		if(StringUtils.isBlank(username)){
			return "";
		}
		//去掉特殊字符
		username = username.replace("-", "");
		username = username.replaceAll(" ", "");
		//长度校验
		int length = username.length();
		if(length < 2){
			return "*";
		}
		//脱敏:前-中-后
		StringBuilder sb = new StringBuilder();
		sb.append(username.substring(0,1));
		for(int i=0; i<length-2; i++){
			sb.append("*");
		}
		if(length == 2){
			sb.append("*");
		} else {
			sb.append(username.substring(length-1, length));
		}
		return sb.toString();
	}

	/**
	 * 生成短信验证码
	 */
	public static String msgCode() {
		int number = 6;
		return StringUtil.msgCode(number);
	}
	public static String msgCode(int number) {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<number; i++) {
			sb.append(new Random().nextInt(10));
		}
		return sb.toString();
	}
}
