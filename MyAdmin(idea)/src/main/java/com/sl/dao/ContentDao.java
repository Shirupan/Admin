package com.sl.dao;

import com.sl.bean.Content;
import com.sl.java.utils.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public Map<Integer,Content> getAllContext(){
        Map<Integer,Content> result=new HashMap<Integer,Content>();
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
                c.setStatus(rs.getInt("status"));
                result.put(c.getId(),c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return result;
    }

    public boolean insertContext(Content content){
        boolean result=false;
        con = ConnectionService.getInstance().getConnectionForBusiness();
        try {
            ps = con.prepareStatement("insert into tbl_content (title,type,content,status) values (?,?,?,?)");
            int m=1;
            ps.setString(m++,content.getTitle());
            ps.setString(m++,"Java");
            ps.setString(m++,content.getContent());
            ps.setInt(m++,1);
            if(ps.executeUpdate()!=0){
                result=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return result;
    }
}
