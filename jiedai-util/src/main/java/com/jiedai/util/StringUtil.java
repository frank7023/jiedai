package com.jiedai.util;

import org.apache.commons.lang3.StringUtils;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: wentao_tang
 * Date: 2016/9/28
 * Time: 11:07
 * To change this template use File | Settings | File Templates.
 */
public class StringUtil {

    /**
     * Created with IDEA
     * Author: wentao_tang
     * Date: 2016/9/28 11:11
     * Description:手机号码脱敏  135****1234
     */
    public static String markSecurityMobile(String mobilePhone) {
        if (StringUtils.isNotBlank(mobilePhone)) {
            return mobilePhone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(markSecurityBankCard("6217123423423423456788320"));
    }

    /**
     * Created with IDEA
     * Author: wentao_tang
     * Date: 2016/9/28 11:37
     * 普通借记银行卡号19位数，信用卡16位卡号；活期存折账号18位数
     * Description:银行卡脱敏
     */
    public static String markSecurityBankCard(String bankCard) {
        String SECURITY_MASK_CARD = "********";
        if (StringUtils.isNotBlank(bankCard) && bankCard.length() > 8) {
            StringBuffer sb = new StringBuffer();
            int length = bankCard.length();
            return sb.append(bankCard.substring(0, 4)).append(SECURITY_MASK_CARD).append(bankCard.substring(length - 4, length)).toString();
        } else {
            return "";
        }
    }

    /**
     * Created with IDEA
     * Author: wentao_tang
     * Date: 2016/9/28 11:51
     * Description:身份证号码脱敏
     */
    public static String markSecurityIdCard(String bankCard) {
        String SECURITY_MASK_ID_CARD = "**********";
        if (StringUtils.isNotBlank(bankCard) && bankCard.length() > 14) {
            StringBuilder sb = new StringBuilder();
            int length = bankCard.length();
            return sb.append(bankCard.substring(0, 4)).append(SECURITY_MASK_ID_CARD).append(bankCard.substring(length - 4, length)).toString();
        } else {
            return "";
        }
    }

    /**
     * Created with IDEA
     * Author: wentao_tang
     * Date: 2016/9/28 11:58
     * Description: 姓名脱敏
     */
    public static String markSecurityName(String name) {
        if (StringUtils.isNotBlank(name)) {
            StringBuilder sb = new StringBuilder();
            int length = name.length();
            if (length == 2) {
                return sb.append("*").append(name.substring(1, length)).toString();
            }
            if (length == 3) {
                return sb.append("**").append(name.substring(2, length)).toString();
            }
            if (length == 4) {
                return sb.append("***").append(name.substring(2, length)).toString();
            }
            return name;
        } else {
            return "";
        }
    }

    /**
     * Description:生成短信验证码
     * Author: wentao_tang
     * Date: 2016/10/17 10:45
     */
    public static String msgCode() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            sb.append(new Random().nextInt(10));
        }
        return sb.toString();
    }
    
    /**
	 * @Description 判断对象是否为空，非空返回false； 空或NULL返回true
	 * @author wanglb
	 * @created 2016年10月17日 下午2:04:58
	 * @param obj
	 * @return
	 */
	public static boolean isNull(Object obj) {
		if (obj == null || "".equals(obj)
				|| "null".equalsIgnoreCase((String) obj)) {
			return true;
		} else {
			return false;
		}
	}
}
