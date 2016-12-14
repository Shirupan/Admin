package com.sl.utils;

import com.sl.bean.Content;
import com.sl.dao.ContentDao;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Maibenben on 2016/12/9.
 */
public class Constant {
    public static Map<Integer,Content> contents=null;
//    public static ArrayList<Content> androids=new ArrayList<Content>();
//    public static ArrayList<Content> javas=new ArrayList<Content>();
//    public static ArrayList<Content> bootstraps=new ArrayList<Content>();
//    public static ArrayList<Content> htmls=new ArrayList<Content>();
//    public static ArrayList<Content> tomcats=new ArrayList<Content>();
//    public static ArrayList<Content> errors=new ArrayList<Content>();
//    public static ArrayList<Content> others=new ArrayList<Content>();
    public static void getData(){
        contents = ContentDao.getInstance().getAllContext();
//        for (Content content:contents) {
//            if(content.getType().equals("Android")){
//                androids.add(content);
//            }else if(content.getType().equals("Java")){
//                javas.add(content);
//            }else if(content.getType().equals("Bootstrap")){
//                bootstraps.add(content);
//            }else if(content.getType().equals("HTML")){
//                htmls.add(content);
//            }else if(content.getType().equals("Tomcat")){
//                tomcats.add(content);
//            }else if(content.getType().equals("Error")){
//                errors.add(content);
//            }else if(content.getType().equals("Other")){
//                others.add(content);
//            }
//            System.out.println(content.getTitle());
//        }
    }
}
