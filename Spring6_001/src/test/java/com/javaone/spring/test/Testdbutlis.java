package com.javaone.spring.test;

import com.javaone.utlis.DButli;
import org.junit.Test;

import java.sql.Connection;

public class Testdbutlis {
    @Test
    public void testDButli() throws Exception {
        Connection conn = DButli.getConn();
        System.out.println(conn != null ? "数据库连接成功" : "数据库连接失败");
    }
}
