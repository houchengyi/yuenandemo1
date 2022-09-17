package com.example.yuenandemo1.M1.common;


public class ResponseResult {
    public static String code;//处理成功获取失败的标记：1---成功,0---失败

    public static String getCode() {
        return code;
    }

    public static void setCode(String code) {
        ResponseResult.code = code;
    }

    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        ResponseResult.message = message;
    }

    public  static String message;//提示信息
}
