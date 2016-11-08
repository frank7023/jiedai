package com.jiedai.util;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

/**
 * 时间处理-工具类：继承了apache的DateUtils; 使用了DateFormatUtils
 * @author chenghailong
 *
 */
public class DateUtil extends DateUtils {

	/** 时间字符串常量*/
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	/** 工具类-测试 */
	public static void main(String[] args) {
		System.out.println("yyyy-MM-dd \t"+formatDate(new Date()));
		System.out.println("yyyy-MM-dd HH:mm:ss \t"+formatDate(new Date()));
		
		System.out.println("yyyy-MM-dd \t"+parseDate("2016-11-02"));
		System.out.println("yyyy-MM-dd HH:mm:ss \t"+parseDateTime("2016-11-02 15:09:00"));
	}
	
	/**
	 * “时间对象” 转 “字符串”【yyyy-MM-dd】
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date){
		//判空
		if(date == null){
			return "";
		}
		//转换
		return DateFormatUtils.format(date, DATE_FORMAT);
	}
	
	/**
	 * “时间对象” 转 “字符串”【yyyy-MM-dd HH:mm:ss】
	 * @param date
	 * @return
	 */
	public static String formatDateTime(Date date){
		//判空
		if(date == null){
			return "";
		}
		//转换
		return DateFormatUtils.format(date, DATETIME_FORMAT);
	}
	
	/**
	 * “字符串” 转 “时间对象”【yyyy-MM-dd】
	 * @param date
	 * @return
	 */
	public static Date parseDate(String dateString){
		//判空
		if(StringUtils.isBlank(dateString)){
			return null;
		}
		//转换
		Date date = null;
		try {
			date = DateUtils.parseDate(dateString, DATE_FORMAT);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * “字符串” 转“时间对象”【yyyy-MM-dd HH:mm:ss】
	 * @param date
	 * @return
	 */
	public static Date parseDateTime(String dateString){
		//判空
		if(StringUtils.isBlank(dateString)){
			return null;
		}
		//转换
		Date datetime = null;
		try {
			datetime = DateUtils.parseDate(dateString, DATETIME_FORMAT);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return datetime;
	}
	
}
