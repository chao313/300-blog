package demomaster.vo;


/**
 * 表名称      :t_title
 * 表类型      :BASE TABLE
 * 表引擎      :InnoDB
 * 表版本      :10
 * 行格式      :Dynamic
 * 表创建      :2020-2-13
 * 字符集      :utf8mb4_bin
 * 表注释      :
 */
public class TTitleVo {

    private Integer id; 
    private String title;  // 栏目名称 


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


    @Override
    public String toString() {
        return "TTitleVo{" +
                ", id '" + id +
                ", title '" + title + '\'' +
                '}';
    }

}
