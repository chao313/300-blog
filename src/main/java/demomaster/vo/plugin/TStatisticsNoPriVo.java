package demomaster.vo.plugin;


/**
 * 这里属性是非主键字段
 *
 * 表名称      :t_statistics
 * 表类型      :BASE TABLE
 * 表引擎      :InnoDB
 * 表版本      :10
 * 行格式      :Dynamic
 * 表创建      :2020-2-13
 * 字符集      :utf8mb4_bin
 * 表注释      :统计信息
 */
public class TStatisticsNoPriVo {

    private Integer total;  // 日志总数 
    private Integer runTime;  // 网站运行时间 


    public Integer getTotal() {

        return total;

    }

    public void setTotal(Integer total) {

        this.total = total;

    }
    public Integer getRunTime() {

        return runTime;

    }

    public void setRunTime(Integer runTime) {

        this.runTime = runTime;

    }

    @Override
    public String toString() {
        return "TStatisticsNoPriVo{" +
                ", total '" + total +
                ", runTime '" + runTime +
                '}';
    }

}
