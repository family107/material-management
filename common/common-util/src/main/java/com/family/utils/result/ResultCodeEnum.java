package com.family.utils.result;

import lombok.Getter;

/**
 * Description:
 *
 * @Author qxy
 * @Create 2023/5/31 20:44
 * @Version 1.0
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(200,"成功"),
    FAIL(201, "失败"),
    PARAM_ERROR( 202, "参数不正确"),
    SERVICE_ERROR(203, "服务异常"),
    DATA_ERROR(204, "数据异常"),
    ILLEGAL_REQUEST(205, "非法请求"),
    REPEAT_SUBMIT(206, "重复提交"),

    LOGIN_AUTH(208, "未登录"),
    PERMISSION(209, "没有权限"),
    CODE_ERROR(210, "验证码错误"),
    ACCOUNT_ERROR(211, "账号不正确"),
    LOGIN_DISABLED_ERROR(212, "该用户已被禁用"),
    REGISTER_MOBILE_ERROR(213, "手机号已被使用"),
    LOGIN_TIMEOUT(214, "登录超时"),
    PASSWORD_ERROR(215, "密码不正确"),
    ACCOUNT_STOP( 216, "账号已停用"),
    NODE_ERROR( 217, "该节点下有子节点，不可以删除"),


    URL_ENCODE_ERROR( 220, "URL编码失败"),
    ILLEGAL_CALLBACK_REQUEST_ERROR( 221, "非法回调请求"),
    FETCH_ACCESSTOKEN_FAILD( 222, "获取accessToken失败"),
    FETCH_USERINFO_ERROR( 223, "获取用户信息失败"),

    PAY_RUN(250, "支付中"),
    CANCEL_ORDER_FAIL(251, "取消订单失败"),
    CANCEL_ORDER_NO(252, "不能取消预约"),

    HOSCODE_EXIST(260, "医院编号已经存在"),
    NUMBER_NO(261, "可预约号不足"),
    TIME_NO(262, "当前时间不可以预约"),


    SIGN_ERROR(270, "签名错误"),
    SIGN_NOT_EXIST(271, "没有签名"),
    SIGN_OVERDUE(272, "签名过期"),
    HOSPITAL_OPEN(273, "医院未开通，暂时不能访问"),
    HOSPITAL_NOT_EXIST(274, "医院数据不存在，请先上传医院数据"),
    HOSPITAL_LOCK(275, "医院被锁定，暂时不能访问"),


    DATA_SEARCH_ERROR(280, "查询记录异常"),
    DATA_CALCULATE_ERROR(281, "数据计算异常"),
    DATA_SQL_GRAMMAR_ERROR(282, "SQL语法异常");
    ;

    private final Integer code;

    private final String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
