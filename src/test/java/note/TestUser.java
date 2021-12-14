package java.note;

import java.note.web.util.dao.UserDao;
import java.note.web.util.po.User;
import org.junit.Test;

public class TestUser {
    @Test
    public void testQueryUserByName(){
        UserDao userDao =new UserDao();
        User user =userDao.queryUserByName("admin");
        System.out.println(user.getUpwd());
    }
}
