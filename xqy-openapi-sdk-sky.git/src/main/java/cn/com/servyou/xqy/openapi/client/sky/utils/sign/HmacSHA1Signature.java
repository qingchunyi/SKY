package cn.com.servyou.xqy.openapi.client.sky.utils.sign;

import cn.com.servyou.xqy.openapi.client.sky.utils.base64.Base64Helper;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;


/**
 * @author luyb@servyou.com.cn
 * @version $Id: HmacSHA1Signature.java v 0.1 2017/4/13 14:58 luyb Exp $$
 */
public class HmacSHA1Signature implements Signature {

    public static final String HMAC_SHA1 = "HmacSHA1";

    public String getSignName() {
        return HMAC_SHA1;
    }

    public String sign(String data, String accessKey) throws SignatureException {
        try {
            Mac mac = Mac.getInstance(HMAC_SHA1);
            SecretKeySpec signingKey = new SecretKeySpec(accessKey.getBytes(), HMAC_SHA1);
            mac.init(signingKey);
            byte[] signData = mac.doFinal(data.getBytes());
            return Base64Helper.encodeToString(signData);
        } catch (NoSuchAlgorithmException e) {
            throw new SignatureException("平台不支持" + HMAC_SHA1 + "摘要方式");
        } catch (InvalidKeyException e) {
            throw new SignatureException("Speicified access secret is not valid.");
        }
    }
}
