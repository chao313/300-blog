package demomaster.vo.plugin;


/**
 * 这里属性是非主键字段
 *
 * 表名称      :t_author
 * 表类型      :BASE TABLE
 * 表引擎      :InnoDB
 * 表版本      :10
 * 行格式      :Dynamic
 * 表创建      :2020-2-13
 * 字符集      :utf8mb4_bin
 * 表注释      :站长信息
 */
public class TAuthorNoPriVo {

    private String qq;  // QQ 
    private String weChat;  // 微信 


    public String getQq() {

        return qq;

    }

    public void setQq(String qq) {

        this.qq = qq;

    }
    public String getWeChat() {

        return weChat;

    }

    public void setWeChat(String weChat) {

        this.weChat = weChat;

    }

    @Override
    public String toString() {
        return "TAuthorNoPriVo{" +
                ", qq '" + qq + '\'' +
                ", weChat '" + weChat + '\'' +
                '}';
    }

}
