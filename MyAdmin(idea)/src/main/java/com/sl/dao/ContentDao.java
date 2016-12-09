package com.sl.dao;

import com.sl.bean.Content;
import com.sl.java.utils.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Maibenben on 2016/12/9.
 */
public class ContentDao {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private static ContentDao instance = null;

    private ContentDao() {

    }

    public synchronized static ContentDao getInstance() {
        if (instance == null) {
            instance = new ContentDao();
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

    public ArrayList<Content> getAllContext(){
        ArrayList<Content> result=new ArrayList<Content>();
        con = ConnectionService.getInstance().getConnectionForBusiness();
        try {
            ps = con.prepareStatement("select * from tbl_content");
            rs = ps.executeQuery();
            while(rs.next()){
                Content c =new Content();
                c.setId(rs.getInt("id"));
                c.setType(rs.getString("type"));
                c.setTitle(rs.getString("title"));
                c.setContent(rs.getString("content"));
                result.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return result;
    }
}
