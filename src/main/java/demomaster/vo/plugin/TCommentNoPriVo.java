package demomaster.vo.plugin;

import java.sql.Timestamp;

/**
 * 这里属性是非主键字段
 *
 * 表名称      :t_comment
 * 表类型      :BASE TABLE
 * 表引擎      :InnoDB
 * 表版本      :10
 * 行格式      :Dynamic
 * 表创建      :2020-2-17
 * 字符集      :utf8mb4_bin
 * 表注释      :博客评论
 */
public class TCommentNoPriVo {

    private String name;  // 昵称 
    private String email;  // 邮箱 
    private String content;  // 评论内容 
    private Integer blongBlogId;  // 所属blog 
    private Timestamp createTime;  // 创建时间 


    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }
    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }
    public String getContent() {

        return content;

    }

    public void setContent(String content) {

        this.content = content;

    }
    public Integer getBlongBlogId() {

        return blongBlogId;

    }

    public void setBlongBlogId(Integer blongBlogId) {

        this.blongBlogId = blongBlogId;

    }
    public Timestamp getCreateTime() {

        return createTime;

    }

    public void setCreateTime(Timestamp createTime) {

        this.createTime = createTime;

    }

    @Override
    public String toString() {
        return "TCommentNoPriVo{" +
                ", name '" + name + '\'' +
                ", email '" + email + '\'' +
                ", content '" + content + '\'' +
                ", blongBlogId '" + blongBlogId +
                ", createTime '" + createTime +
                '}';
    }

}
