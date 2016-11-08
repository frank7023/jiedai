package com.jiedai.model.company.eunms;

/**
 * 【枚举】企业借贷:借款订单
 * @author chenghailong
 *
 */
public abstract class CompanyLoanOrders_ {
	
	public enum IsLoanEnum {
		NOTlOAN(1, "未放款"),
		LOANING(2, "放款中"),
		LOAN_SUCCESS(3, "放款成功"),
		LOAN_FAILURE(4, "放款失败");

		private int id;
		private String name;

		private IsLoanEnum(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public static IsLoanEnum getInstance(Integer value) {
			if (null != value) {
				for (IsLoanEnum e : IsLoanEnum.values()) {
					if (e.getId() == value.intValue()) {
						return e;
					}
				}
			}
			return null;
		}
		public static String getName(Integer value) {
			if (null != value) {
				for (IsLoanEnum e : IsLoanEnum.values()) {
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
