package com.jiedai.model.product.enums;

/**
 * 【枚举】产品项目
 * @author chenghailong
 *
 */
public abstract class ProjectInfo_ {
	/**
	 * 枚举-状态
	 */
	public enum StatusEnum {
		UNPUBLISH(1, "预发布"),
		PUBLISH(2, "已发布"),
		DELETE(3, "已删除");
		
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
	
	/**
	 * 枚举-类型
	 */
	public enum TypeEnum {
		MEMBER(1, "个人借款"),
		COMPANY(2, "企业借款"),
		CONSUMER(3, "海象随便花");
		
		private int id;
		private String name;

		private TypeEnum(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public static TypeEnum getInstance(Integer value) {
			if (null != value) {
				for (TypeEnum e : TypeEnum.values()) {
					if (e.getId() == value.intValue()) {
						return e;
					}
				}
			}
			return null;
		}
		public static String getName(Integer value) {
			if (null != value) {
				for (TypeEnum e : TypeEnum.values()) {
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
