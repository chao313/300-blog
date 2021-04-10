package demomaster.service;


import java.util.List;

import demomaster.vo.TPicVo;
import demomaster.vo.plugin.TPicPriVo;
import demomaster.vo.plugin.TPicNoPriVo;


/**
 * 表名称      :t_pic
 * 表类型      :BASE TABLE
 * 表引擎      :InnoDB
 * 表版本      :10
 * 行格式      :Dynamic
 * 表创建      :2020-2-16
 * 字符集      :utf8mb4_bin
 * 表注释      :存放轮转图片的路径
 */
public interface TPicService {

    /**
     * insert
     */
    boolean insert(TPicVo vo);


    /**
     * insert vos 批量插入
     */
    boolean insert(List<TPicVo> vos);


    /**
     * 查询base
     */
    List<TPicVo> queryBase(TPicVo query);


    /**
     * update base (exclude value is null or "")
     */
    boolean updateBase(TPicVo source, TPicVo target);

    /**
     * update base (include value is null or "")
     */
    boolean updateBaseIncludeNull(TPicVo source, TPicVo target);

    /**
     * 删除base
     */
    boolean deleteBase(TPicVo vo);


    /**
     * 根据PrimaryKey查询
     * <p>
     * id : 
     */
     TPicVo queryByPrimaryKey(Integer id);

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
    boolean updateByPrimaryKey(TPicNoPriVo source,TPicPriVo target);



}
