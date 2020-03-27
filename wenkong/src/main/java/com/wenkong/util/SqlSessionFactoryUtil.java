//package com.wenkong.util;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.IOException;
//import java.io.InputStream;
//public class SqlSessionFactoryUtil {
//    // 声明一个SqlSessionFactory
//    private static SqlSessionFactory sqlSessionFactory;
//
//    // 使用静态代码块初始化
//    static {
//
//        try {
//            // 1.加载主配置文件sqlMapConfig.xml
//            InputStream inputStream = Resources.getResourceAsStream("mybatis/sqlMapConfig.xml");
//
//            // 2.读取解析配置文件内容，获取框架核心对象
//            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//            /**
//             * SqlSessionFactory：
//             *  1.它是框架的核心对象，很重要
//             *  2.它是线程安全
//             *  3.在一个项目中通常只需要一个（单例设计模式的应用）
//             */
//            sqlSessionFactory = builder.build(inputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    // 提供一个公有的静态方法，获取SqlSessionFactory
//    public static  SqlSessionFactory getSqlSessionFactory(){
//        return  sqlSessionFactory;
//    }
//}
