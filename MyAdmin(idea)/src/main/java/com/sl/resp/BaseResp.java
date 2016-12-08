package com.sl.resp;

/**
 * Created by Maibenben on 2016/12/7.
 */
public class BaseResp {
    private String status;
    public static final String ERROR="{\"status\":\"err\"}";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
