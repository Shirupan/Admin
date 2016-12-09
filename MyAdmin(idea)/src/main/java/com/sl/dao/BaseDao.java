package com.sl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Maibenben on 2016/12/6.
 */
public abstract class BaseDao {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;


}
