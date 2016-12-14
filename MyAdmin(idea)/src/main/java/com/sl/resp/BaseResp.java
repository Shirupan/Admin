package com.sl.resp;

/**
 * Created by Maibenben on 2016/12/7.
 */
public class BaseResp {
    private String status;
    public static final String ERROR="error";
    public static final String SUCCESS_INSERT="success_insert";
    public static final String SUCCESS="success";

    public static final String RSP_ERROR="{\"status\":\""+ERROR+"\"}";
    public static final String RSP_SUCCESS_INSERT="{\"status\":\""+SUCCESS_INSERT+"\"}";
    public static final String RSP_SUCCESS="{\"status\":\""+SUCCESS+"\"}";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
