package demomaster.vo;


/**
 * 表名称      :t_blog
 * 表类型      :BASE TABLE
 * 表引擎      :InnoDB
 * 表版本      :10
 * 行格式      :Dynamic
 * 表创建      :2020-2-16
 * 字符集      :utf8mb4_bin
 * 表注释      :
 */
public class TBlogVo {

    private Integer id; 
    private String title;  // 博客标题 
    private String img;  // 博客的图片 
    private String time;  // 博客时间 
    private String type;  // 博客类别 
    private Integer lookSum;  // 博客浏览量 
    private String content;  // 博客内容 


    public Integer getId() {

        return id;

    }

    public void setId(Integer id) {

        this.id = id;

    }

    public String getTitle() {

        return title;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public String getImg() {

        return img;

    }

    public void setImg(String img) {

        this.img = img;

    }

    public String getTime() {

        return time;

    }

    public void setTime(String time) {

        this.time = time;

    }

    public String getType() {

        return type;

    }

    public void setType(String type) {

        this.type = type;

    }

    public Integer getLookSum() {

        return lookSum;

    }

    public void setLookSum(Integer lookSum) {

        this.lookSum = lookSum;

    }

    public String getContent() {

        return content;

    }

    public void setContent(String content) {

        this.content = content;

    }


    @Override
    public String toString() {
        return "TBlogVo{" +
                ", id '" + id +
                ", title '" + title + '\'' +
                ", img '" + img + '\'' +
                ", time '" + time + '\'' +
                ", type '" + type + '\'' +
                ", lookSum '" + lookSum +
                ", content '" + content + '\'' +
                '}';
    }

}
