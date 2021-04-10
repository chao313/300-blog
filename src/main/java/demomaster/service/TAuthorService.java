package demomaster.service;


import java.util.List;

import demomaster.vo.TAuthorVo;
import demomaster.vo.plugin.TAuthorPriVo;
import demomaster.vo.plugin.TAuthorNoPriVo;


/**
 * 表名称      :t_author
 * 表类型      :BASE TABLE
 * 表引擎      :InnoDB
 * 表版本      :10
 * 行格式      :Dynamic
 * 表创建      :2020-2-13
 * 字符集      :utf8mb4_bin
 * 表注释      :站长信息
 */
public interface TAuthorService {

    /**
     * insert
     */
    boolean insert(TAuthorVo vo);


    /**
     * insert vos 批量插入
     */
    boolean insert(List<TAuthorVo> vos);


    /**
     * 查询base
     */
    List<TAuthorVo> queryBase(TAuthorVo query);


    /**
     * update base (exclude value is null or "")
     */
    boolean updateBase(TAuthorVo source, TAuthorVo target);

    /**
     * update base (include value is null or "")
     */
    boolean updateBaseIncludeNull(TAuthorVo source, TAuthorVo target);

    /**
     * 删除base
     */
    boolean deleteBase(TAuthorVo vo);


    /**
     * 根据PrimaryKey查询
     * <p>
     * id : 
     */
     TAuthorVo queryByPrimaryKey(Integer id);

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
    boolean updateByPrimaryKey(TAuthorNoPriVo source,TAuthorPriVo target);



}
