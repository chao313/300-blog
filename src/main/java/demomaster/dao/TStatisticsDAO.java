package demomaster.dao;


import java.util.List;

import demomaster.vo.TStatisticsVo;
import demomaster.vo.plugin.TStatisticsPriVo;
import demomaster.vo.plugin.TStatisticsNoPriVo;


import org.apache.ibatis.annotations.Param;

/**
 * 表名称      :t_statistics
 * 表类型      :BASE TABLE
 * 表引擎      :InnoDB
 * 表版本      :10
 * 行格式      :Dynamic
 * 表创建      :2020-2-13
 * 字符集      :utf8mb4_bin
 * 表注释      :统计信息
 */
public interface TStatisticsDAO {

    /**
     * insert
     */
    int insert(TStatisticsVo vo);

    /**
     * insert vos 批量插入
     */
    int inserts(@Param(value = "vos") List<TStatisticsVo> vos);

    /**
     * 查询base
     */
    List<TStatisticsVo> queryBase(TStatisticsVo query);

    /**
     * update base (exclude value is null or "")
     */
    int updateBase(@Param(value = "source") TStatisticsVo source, @Param(value = "target") TStatisticsVo target);


    /**
     * update base (include value is null or "")
     */
    int updateBaseIncludeNull(@Param(value = "source") TStatisticsVo source, @Param(value = "target") TStatisticsVo target);

    /**
     * 删除base
     */
    int deleteBase(TStatisticsVo vo);


    /**
     * 根据PrimaryKey查询
     * <p>
     * id : 
     * @param id
     * 
     */
    TStatisticsVo queryByPrimaryKey(@Param(value = "id") Integer id);

    /**
     * 根据PrimaryKey删除
     * <p>
     * id : 
     * @param id
     * 
     */
    int deleteByPrimaryKey(@Param(value = "id") Integer id);

    /**
     * 根据PrimaryKey更新，会根据主键去更新其他的值(空值不覆盖有值)
     * <p>
     * id : 
     * @param id
     * 
     */
    int updateByPrimaryKey(@Param(value = "source") TStatisticsNoPriVo source,@Param(value = "target") TStatisticsPriVo target);

}
