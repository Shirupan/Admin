package com.sl.resp;

import com.sl.bean.User;

/**
 * Created by Maibenben on 2016/12/7.
 */
public class LoginResp extends BaseResp{
    private User data;

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }
}
