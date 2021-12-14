package java.note.web.util.po;


public class User {

    private Integer userId;
    private String uname;
    private String upwd;
    private String nick;
    private String head;

    public User(Integer userId, String uname, String upwd, String nick, String head, String mood) {
        this.userId = userId;
        this.uname = uname;
        this.upwd = upwd;
        this.nick = nick;
        this.head = head;
        this.mood = mood;
    }

    private String mood;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }


}







