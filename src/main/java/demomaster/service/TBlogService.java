package demomaster.service;


import java.util.List;

import demomaster.vo.TBlogVo;
import demomaster.vo.plugin.TBlogPriVo;
import demomaster.vo.plugin.TBlogNoPriVo;


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
public interface TBlogService {

    /**
     * insert
     */
    boolean insert(TBlogVo vo);


    /**
     * insert vos 批量插入
     */
    boolean insert(List<TBlogVo> vos);


    /**
     * 查询base
     */
    List<TBlogVo> queryBase(TBlogVo query);


    /**
     * update base (exclude value is null or "")
     */
    boolean updateBase(TBlogVo source, TBlogVo target);

    /**
     * update base (include value is null or "")
     */
    boolean updateBaseIncludeNull(TBlogVo source, TBlogVo target);

    /**
     * 删除base
     */
    boolean deleteBase(TBlogVo vo);


    /**
     * 根据PrimaryKey查询
     * <p>
     * id : 
     */
     TBlogVo queryByPrimaryKey(Integer id);

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
    boolean updateByPrimaryKey(TBlogNoPriVo source,TBlogPriVo target);



}
