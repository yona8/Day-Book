import com.lezijie.note.web.util.DBUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

public class slf4jTest {
    public static final Logger logger= LoggerFactory.getLogger(slf4jTest.class);

    @Test
    public  void test01(){
      logger.error("error");
      logger.warn("warning");
      logger.info("info");
    }
    //    单元测试方法
//    1.方法的返回值，建议使用void,一般没有返回值
//    2.参数列表，建议空参，一般没有参数
//    3.方法上的需求设置@test注解
//    4.每个方法都能独立运行
    @Test
    public void slf4jTest(){
        System.out.println(DBUtil.getConnection());
    }
}
