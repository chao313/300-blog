package demomaster.vo.plugin;


/**
 * 这里属性是非主键字段
 *
 * 表名称      :t_pic
 * 表类型      :BASE TABLE
 * 表引擎      :InnoDB
 * 表版本      :10
 * 行格式      :Dynamic
 * 表创建      :2020-2-16
 * 字符集      :utf8mb4_bin
 * 表注释      :存放轮转图片的路径
 */
public class TPicNoPriVo {

    private String picPath;  // 图片路径 
    private String alt;  // 图片提示 


    public String getPicPath() {

        return picPath;

    }

    public void setPicPath(String picPath) {

        this.picPath = picPath;

    }
    public String getAlt() {

        return alt;

    }

    public void setAlt(String alt) {

        this.alt = alt;

    }

    @Override
    public String toString() {
        return "TPicNoPriVo{" +
                ", picPath '" + picPath + '\'' +
                ", alt '" + alt + '\'' +
                '}';
    }

}
