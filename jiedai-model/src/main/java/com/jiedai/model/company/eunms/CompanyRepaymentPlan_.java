package com.jiedai.model.company.eunms;

/**
 * 【枚举】企业借贷:还款计划
 * @author chenghailong
 *
 */
public abstract class CompanyRepaymentPlan_ {
	
	public enum StatusEnum {
        NOTREPAY(1,"未还"),
        REPAY(2,"已还"),
        DELAY(3,"延期");

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
				for (IsFullRepaymentEnum e : IsFullRepaymentEnum.values()) {
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
    
    public enum IsFullRepaymentEnum {
        NO(1,"否"),
        YES(2,"是");

        private int id;
		private String name;

		private IsFullRepaymentEnum(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public static IsFullRepaymentEnum getInstance(Integer value) {
			if (null != value) {
				for (IsFullRepaymentEnum e : IsFullRepaymentEnum.values()) {
					if (e.getId() == value.intValue()) {
						return e;
					}
				}
			}
			return null;
		}
		public static String getName(Integer value) {
			if (null != value) {
				for (IsFullRepaymentEnum e : IsFullRepaymentEnum.values()) {
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
    
    
    
    /**是否有借款*/
    public enum IsRepayMentEnum {
        HAS_REPAYMENT(1,"有借款"),
        NO_REPAYMENT(2,"没借款");

    	private int id;
		private String name;

		private IsRepayMentEnum(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public static IsRepayMentEnum getInstance(Integer value) {
			if (null != value) {
				for (IsRepayMentEnum e : IsRepayMentEnum.values()) {
					if (e.getId() == value.intValue()) {
						return e;
					}
				}
			}
			return null;
		}
		public static String getName(Integer value) {
			if (null != value) {
				for (IsFullRepaymentEnum e : IsFullRepaymentEnum.values()) {
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
    
    
    /**是否已还完*/
    public enum IsRepayFinshedEnum {
        FINSHED(1,"已还完"),
        NOT_YET(2,"未还完");

    	private int id;
		private String name;

		private IsRepayFinshedEnum(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public static IsRepayFinshedEnum getInstance(Integer value) {
			if (null != value) {
				for (IsRepayFinshedEnum e : IsRepayFinshedEnum.values()) {
					if (e.getId() == value.intValue()) {
						return e;
					}
				}
			}
			return null;
		}
		public static String getName(Integer value) {
			if (null != value) {
				for (IsFullRepaymentEnum e : IsFullRepaymentEnum.values()) {
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
