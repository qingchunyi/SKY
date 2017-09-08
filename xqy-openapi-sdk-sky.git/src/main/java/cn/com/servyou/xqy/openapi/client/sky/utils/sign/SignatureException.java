package cn.com.servyou.xqy.openapi.client.sky.utils.sign;

/**
 * @author luyb@servyou.com.cn
 * @version $Id: SignatureException.java v 0.1 2017/8/3 20:47 luyb Exp $$
 */
public class SignatureException extends RuntimeException {
    public SignatureException() {
    }

    public SignatureException(String message) {
        super(message);
    }

    public SignatureException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignatureException(Throwable cause) {
        super(cause);
    }

    protected SignatureException(String message, Throwable cause, boolean enableSuppression,
                                 boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
