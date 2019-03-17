package com.todd.seckill.error;

/**
 * 业务异常枚举
 * @author Todd
 * @date 2019-03-17 22:36
 */
public enum BussinessErrorEnum implements CommonError {

    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),
    UNKNOW_ERROR(10002, "未知错误"),

    USER_NOT_EXIST(20001, "用户不存在"),
    ;

    private int errCode;

    private String errMsg;

    BussinessErrorEnum(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrCode() {
        return errCode;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }}