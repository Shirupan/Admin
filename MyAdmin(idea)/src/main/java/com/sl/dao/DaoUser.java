package com.sl.dao;

import com.sl.bean.User;
import com.sl.java.utils.ConfigManager;
import com.sl.java.utils.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Maibenben on 2016/12/6.
 */
public class DaoUser {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private static DaoUser instance = null;

    private DaoUser() {

    }

    public synchronized static DaoUser getInstance() {
        if (instance == null) {
            instance = new DaoUser();
        }
        return instance;
    }

    private void close(){
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public User login(User user) {
        User result=null;
        con = ConnectionService.getInstance().getConnectionForBusiness();
        try {
            ps = con.prepareStatement("select * from tbl_user where email=? and pwd=?");
            int m=1;
            ps.setString(m++,user.getEmail());
            ps.setString(m++,user.getPwd());
            rs = ps.executeQuery();
            if(rs.next()){
                result =new User();
                result.setEmail(rs.getString("email"));
                result.setPwd(rs.getString("pwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ConfigManager.getConfigData("business.url"));
        User user=new User();
        user.setEmail("pain");
        user.setPwd("123456");
        System.out.println(DaoUser.getInstance().login(user).getEmail());
    }
}
