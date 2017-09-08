package cn.com.servyou.xqy.openapi.client.sky.utils.sign;


import cn.com.servyou.xqy.openapi.client.sky.utils.base64.Base64Helper;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;


/**
 * @author luyb@servyou.com.cn
 * @version $Id: HmacSHA256Signature.java v 0.1 2017/4/13 15:11 luyb Exp $$
 */
public class HmacSHA256Signature implements Signature {

    public static final String HMAC_SHA256 = "HmacSHA256";


    public String getSignName() {
        return HMAC_SHA256;
    }


    public String sign(String data, String accessKey) throws SignatureException {
        try {
            Mac mac = Mac.getInstance(HMAC_SHA256);
            SecretKeySpec signingKey = new SecretKeySpec(accessKey.getBytes(), HMAC_SHA256);
            mac.init(signingKey);
            byte[] signData = mac.doFinal(data.getBytes());
            return Base64Helper.encodeToString(signData);
        } catch (NoSuchAlgorithmException e) {
            throw new SignatureException("平台不支持" + HMAC_SHA256 + "摘要方式");
        } catch (InvalidKeyException e) {
            throw new SignatureException("Speicified access secret is not valid.");
        }
    }
}
