package cn.com.servyou.xqy.openapi.client.sky.utils.sign;

import cn.com.servyou.xqy.openapi.client.sky.utils.SdkConstant;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 签名工具类
 * 
 * @author luyb@servyou.com.cn
 * @version $Id: SignUtils.java v 0.1 2017/8/5 18:13 luyb Exp $$
 */
public class SignUtils {

    /** SHA256摘要签名 */
    private static final Signature signature = new HmacSHA256Signature();

    /**
     * 创建签名
     *
     * @param characterEncoding 字符编码
     * @param params    等待摘要参数
     * @param appSecret 应用密钥
     * @return String 返回<tt>null</tt>表示创建Sign失败
     */
    public static String sign(Map<String, Object> params, String appSecret,
                              String characterEncoding) {
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put(SdkConstant.APP_SECRET, appSecret);

        for (Map.Entry<String, Object> entry : params.entrySet()) {
            treeMap.put(entry.getKey(), entry.getValue().toString());
        }

        StringBuilder builder = new StringBuilder();
        for (Object parameter : treeMap.values()) {
            if (parameter != null) {
                builder.append(parameter.toString());
            }
        }
        String signStr = null;
        try {
            signStr = signature.sign(URLEncoder.encode(builder.toString(), characterEncoding),
                appSecret);
        } catch (UnsupportedEncodingException e) {
        }
        return signStr;
    }

    /**
     * 创建签名
     *
     * @param params    等待摘要参数
     * @param appSecret 应用密钥
     * @return String 返回<tt>null</tt>表示创建Sign失败
     */
    public static String sign(Map<String, Object> params, String appSecret) {
        return sign(params, appSecret, "UTF-8");
    }


    public static void main(String[] args) {
        Map<String, Object> params = new HashMap<String, Object>();
        //params.put("customerId", 38082);

        //默认设置
        params.put("version", "1.0.0");
        params.put("timestamp", System.currentTimeMillis());

        //需要手动设置
        params.put("appKey", "MjQwNzY3RTExNkUzNENDMzk0RTY3MzZEMjYyMzM5MDM=");

        params.put("companyTaxPayerId", "111111111111111");
        params.put("customerTaxPayerId", "130203678537223");
        params.put("period", "201706");

        String sign = SignUtils.sign(params, "51L6kULinTFzhkg2aBX4bA==");
        System.out.println(sign);
    }
}
