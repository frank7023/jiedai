package com.jiedai.model.company.eunms;

/**
 * 【枚举】企业借贷:借款申请
 * @author chenghailong
 *
 */
public abstract class CompanyLoanApply_ {
	
	public enum ApplyStatusEnum {
		APPLY(1, "申请中"),
		ACCOUNT_ENSURE(2,"账户已校验"),
		ACCOUNT_ERROR(3,"账户校验失败"),
		COMPANY_CREDITED(4,"已授信"),
		ACCEPT_CREDIT(5,"用户接受"),
		REFUSE_CREDIT(6,"用户拒绝"),
		REDUIT_SUCCESS(7, "终审成功"),//勿动，前端写死id值
		REDUIT_REFUSE(8, "终审拒绝"),//勿动，前端写死id值
		REPAYMENT_END(9, "还款结束");

		private int id;
		private String name;

		private ApplyStatusEnum(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public static ApplyStatusEnum getInstance(Integer value) {
			if (null != value) {
				for (ApplyStatusEnum e : ApplyStatusEnum.values()) {
					if (e.getId() == value.intValue()) {
						return e;
					}
				}
			}
			return null;
		}
		public static String getName(Integer value) {
			if (null != value) {
				for (ApplyStatusEnum e : ApplyStatusEnum.values()) {
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
	
	public enum IsAgreeEnum {
		DISAGREE(1, "不同意"),
		AGREE(2, "同意");

		private int id;
		private String name;

		private IsAgreeEnum(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public static IsAgreeEnum getInstance(Integer value) {
			if (null != value) {
				for (IsAgreeEnum e : IsAgreeEnum.values()) {
					if (e.getId() == value.intValue()) {
						return e;
					}
				}
			}
			return null;
		}
		public static String getName(Integer value) {
			if (null != value) {
				for (IsAgreeEnum e : IsAgreeEnum.values()) {
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
	 * 期望到款时间
	 */
	public enum ExpectTimeEnum {
		THREE_DAY(1, "3天"),
		FIVE_DAY(2, "5天"),
		SEVEN_DAY(3, "7天");

		private int id;
		private String name;

		private ExpectTimeEnum(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public static ExpectTimeEnum getInstance(Integer value) {
			if (null != value) {
				for (ExpectTimeEnum e : ExpectTimeEnum.values()) {
					if (e.getId() == value.intValue()) {
						return e;
					}
				}
			}
			return null;
		}
		public static String getName(Integer value) {
			if (null != value) {
				for (ExpectTimeEnum e : ExpectTimeEnum.values()) {
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
	 * 借款用途/申请原因
	 */
	public enum ApplyReasonEnum {
		TURNOVER(1, "短期周转"),
		EXPAND(2, "企业扩张");

		private int id;
		private String name;

		private ApplyReasonEnum(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public static ApplyReasonEnum getInstance(Integer value) {
			if (null != value) {
				for (ApplyReasonEnum e : ApplyReasonEnum.values()) {
					if (e.getId() == value.intValue()) {
						return e;
					}
				}
			}
			return null;
		}
		public static String getName(Integer value) {
			if (null != value) {
				for (ApplyReasonEnum e : ApplyReasonEnum.values()) {
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
