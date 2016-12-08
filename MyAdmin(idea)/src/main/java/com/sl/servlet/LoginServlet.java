package com.sl.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sl.bean.User;
import com.sl.dao.DaoUser;
import com.sl.resp.BaseResp;
import com.sl.resp.LoginResp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Maibenben on 2016/12/5.
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public LoginServlet(){
        super();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        req.setCharacterEncoding("utf-8");
        String info=req.getParameter("info");
        System.out.println(info);
        User user= JSON.parseObject(info,User.class);
        User result=DaoUser.getInstance().login(user);
        if(result!=null){
            LoginResp rsp=new LoginResp();
            rsp.setStatus("success");
            rsp.setData(result);
            resp.getWriter().append(JSONObject.toJSONString(rsp));
        }else{
            resp.getWriter().append(BaseResp.ERROR);
        }
    }
}
