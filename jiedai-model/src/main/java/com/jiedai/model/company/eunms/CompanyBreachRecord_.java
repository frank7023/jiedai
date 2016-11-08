package com.jiedai.model.company.eunms;

/**
 * 【枚举】企业借贷:违约记录
 * @author mubosong
 *
 */
public abstract class CompanyBreachRecord_ {
	
	public enum StatusEnum {
		AURTHORIZED(1, "已授权"),
		UNAURTHORIZED(2, "未授权");
		
		private int id;
		private String name;

		private StatusEnum(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public static StatusEnum getInstance(Integer value) {
			if (null != value) {
				for (StatusEnum e : StatusEnum.values()) {
					if (e.getId() == value.intValue()) {
						return e;
					}
				}
			}
			return null;
		}
		public static String getName(Integer value) {
			if (null != value) {
				for (StatusEnum e : StatusEnum.values()) {
					if (e.getId() == value.intValue()) {
						return e.name;
					}
				}
			}
			return null;
		}
		public String toString() {
			return this.getName();
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
	}

}
