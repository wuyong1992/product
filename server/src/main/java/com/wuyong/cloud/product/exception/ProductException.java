package com.wuyong.cloud.product.exception;


import com.wuyong.cloud.product.enums.ResultEnum;

/**
 * @author JianGuo
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
