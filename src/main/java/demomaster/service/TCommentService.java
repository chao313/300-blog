package demomaster.service;


import java.util.List;

import demomaster.vo.TCommentVo;
import demomaster.vo.plugin.TCommentPriVo;
import demomaster.vo.plugin.TCommentNoPriVo;

import java.sql.Timestamp;

/**
 * 表名称      :t_comment
 * 表类型      :BASE TABLE
 * 表引擎      :InnoDB
 * 表版本      :10
 * 行格式      :Dynamic
 * 表创建      :2020-2-17
 * 字符集      :utf8mb4_bin
 * 表注释      :博客评论
 */
public interface TCommentService {

    /**
     * insert
     */
    boolean insert(TCommentVo vo);


    /**
     * insert vos 批量插入
     */
    boolean insert(List<TCommentVo> vos);


    /**
     * 查询base
     */
    List<TCommentVo> queryBase(TCommentVo query);


    /**
     * update base (exclude value is null or "")
     */
    boolean updateBase(TCommentVo source, TCommentVo target);

    /**
     * update base (include value is null or "")
     */
    boolean updateBaseIncludeNull(TCommentVo source, TCommentVo target);

    /**
     * 删除base
     */
    boolean deleteBase(TCommentVo vo);


    /**
     * 根据PrimaryKey查询
     * <p>
     * id : 
     */
     TCommentVo queryByPrimaryKey(Integer id);

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
    boolean updateByPrimaryKey(TCommentNoPriVo source,TCommentPriVo target);



}
