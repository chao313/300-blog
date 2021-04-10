package demomaster.vo.plugin;


/**
 * 这里属性是非主键字段
 *
 * 表名称      :t_title
 * 表类型      :BASE TABLE
 * 表引擎      :InnoDB
 * 表版本      :10
 * 行格式      :Dynamic
 * 表创建      :2020-2-13
 * 字符集      :utf8mb4_bin
 * 表注释      :
 */
public class TTitleNoPriVo {

    private String title;  // 栏目名称 


    public String getTitle() {

        return title;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    @Override
    public String toString() {
        return "TTitleNoPriVo{" +
                ", title '" + title + '\'' +
                '}';
    }

}
