package demomaster.service;


import java.util.List;

import demomaster.vo.TTitleVo;
import demomaster.vo.plugin.TTitlePriVo;
import demomaster.vo.plugin.TTitleNoPriVo;


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
public interface TTitleService {

    /**
     * insert
     */
    boolean insert(TTitleVo vo);


    /**
     * insert vos 批量插入
     */
    boolean insert(List<TTitleVo> vos);


    /**
     * 查询base
     */
    List<TTitleVo> queryBase(TTitleVo query);


    /**
     * update base (exclude value is null or "")
     */
    boolean updateBase(TTitleVo source, TTitleVo target);

    /**
     * update base (include value is null or "")
     */
    boolean updateBaseIncludeNull(TTitleVo source, TTitleVo target);

    /**
     * 删除base
     */
    boolean deleteBase(TTitleVo vo);


    /**
     * 根据PrimaryKey查询
     * <p>
     * id : 
     */
     TTitleVo queryByPrimaryKey(Integer id);

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
    boolean updateByPrimaryKey(TTitleNoPriVo source,TTitlePriVo target);



}
