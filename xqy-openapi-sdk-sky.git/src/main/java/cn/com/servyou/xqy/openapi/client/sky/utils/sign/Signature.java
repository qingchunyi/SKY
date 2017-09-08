package cn.com.servyou.xqy.openapi.client.sky.utils.sign;


/**
 *
 * HMAC:Hash Message Authentication Code
 * HMAC用来在程序之间交换数据时做校验。
 * MD5、SHA1、SHA256等Hash函数都可以用来创建HMAC签名.
 *
 * HMAC是密钥相关的哈希运算消息认证码（Hash-based Message Authentication Code）,
 * HMAC运算利用哈希算法，以一个密钥和一个消息为输入，生成一个消息摘要作为输出
 *
 * @author luyb@servyou.com.cn
 * @version $Id: Signature.java v 0.1 2017/4/13 14:45 luyb Exp $$
 */
public interface Signature {

    /**
     * 返回签名方式
     *
     * @return  String
     */
    String getSignName();

    /**
     * 生成签名数据
     *
     * @param data  待签名数据
     * @param accessKey 访问密钥
     * @return 签名后的Base64编码字符串
     * @throws SignatureException
     */
    String sign(String data, String accessKey) throws SignatureException;
}
