package demomaster.service;


import java.util.List;

import demomaster.vo.TStatisticsVo;
import demomaster.vo.plugin.TStatisticsPriVo;
import demomaster.vo.plugin.TStatisticsNoPriVo;


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
public interface TStatisticsService {

    /**
     * insert
     */
    boolean insert(TStatisticsVo vo);


    /**
     * insert vos 批量插入
     */
    boolean insert(List<TStatisticsVo> vos);


    /**
     * 查询base
     */
    List<TStatisticsVo> queryBase(TStatisticsVo query);


    /**
     * update base (exclude value is null or "")
     */
    boolean updateBase(TStatisticsVo source, TStatisticsVo target);

    /**
     * update base (include value is null or "")
     */
    boolean updateBaseIncludeNull(TStatisticsVo source, TStatisticsVo target);

    /**
     * 删除base
     */
    boolean deleteBase(TStatisticsVo vo);


    /**
     * 根据PrimaryKey查询
     * <p>
     * id : 
     */
     TStatisticsVo queryByPrimaryKey(Integer id);

    /**
     * 根据PrimaryKey删除
     * <p>
     * id : 
     * @param id
     * 
     */
    boolean deleteByPrimaryKey(Integer id);

    /**
     * 根据PrimaryKey更新，会根据主键去更新其他的值(空值不覆盖有值) -> 主键不更新
     * <p>
     * id : 
     * @param id
     * 
     */
    boolean updateByPrimaryKey(TStatisticsNoPriVo source,TStatisticsPriVo target);



}
