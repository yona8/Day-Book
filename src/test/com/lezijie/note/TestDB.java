package com.lezijie.note;

import com.lezijie.note.web.util.DBUtil;
import org.junit.Test;

public class TestDB {
//    单元测试方法
//    1.方法的返回值，建议使用void,一般没有返回值
//    2.参数列表，建议空参，一般没有参数
//    3.方法上的需求设置@test注解
//    4.每个方法都能独立运行
    @Test
    public void testDB(){
        System.out.println(DBUtil.getConnection());
    }
}
