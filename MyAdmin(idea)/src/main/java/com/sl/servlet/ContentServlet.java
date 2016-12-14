package com.sl.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sl.bean.Content;
import com.sl.bean.User;
import com.sl.dao.ContentDao;
import com.sl.resp.BaseResp;
import com.sl.resp.ContentResp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Maibenben on 2016/12/13.
 */
@WebServlet("/ContentServlet")
public class ContentServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        String info= req.getParameter("info");
        System.out.println(info);
        Content content= JSON.parseObject(info,Content.class);
        boolean result= ContentDao.getInstance().insertContext(content);
        if(result){
            ContentResp rsp=new ContentResp();
            rsp.setStatus(BaseResp.SUCCESS_INSERT);
            rsp.setData(content);
            resp.getWriter().append(JSONObject.toJSONString(rsp));
        }else{
            resp.getWriter().append(BaseResp.RSP_ERROR);
        }
    }
}
