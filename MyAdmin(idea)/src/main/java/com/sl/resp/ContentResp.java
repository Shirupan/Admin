package com.sl.resp;

import com.sl.bean.Content;

/**
 * Created by Maibenben on 2016/12/7.
 */
public class ContentResp extends BaseResp{
    private Content data;

    public Content getData() {
        return data;
    }

    public void setData(Content data) {
        this.data = data;
    }
}
