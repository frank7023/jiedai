package com.jiedai.util;

import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

/**
 * 短信发送工具类
 * @author chenghailong
 *
 */
public class SendSMSUtil {

    static ResourceBundle resourceBundle = ResourceBundle.getBundle("sms");

    public static String sendSMS(String telphone, String telphoneCount, String msg) {
        String url=resourceBundle.getString("url");
        String userId=resourceBundle.getString("username");
        String password=resourceBundle.getString("password");
        String result="";
        try {
           Content content= Request.Post(url).
                   bodyForm(Form.form().
                            add("userId",  userId)
                           .add("password",  password)
                           .add("pszMobis",telphone)
                           .add("pszMsg",msg)
                           .add("iMobiCount",telphoneCount)
                           .add("pszSubPort","*")
                           .add("MsgId",String.valueOf(new Date().getTime()))
                           .build())
                    .execute().returnContent();
             result=content.asString(Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  result;
    }

    public static void main(String[] args) {
       String reslult= sendSMS("13466329314","1","欢迎您的加入，每天签到有红包惊喜！9点、12点、15点理财计划准时相约~海象理财微信公众号，最新活动实时更新，快来关注吧！");
        System.out.println(reslult);
    }
}
