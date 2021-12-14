package java.note.web.util.vo;
//封装返回结果的类

public class ResultInfo<T> {
    private Integer code;//状态码 成功为1，失败为0
    private String msg; //提示信息
    private T result; //返回的对象（字符串，JAVABean,集合，Map等）
}
