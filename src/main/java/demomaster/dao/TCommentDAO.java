package demomaster.dao;


import java.util.List;

import demomaster.vo.TCommentVo;
import demomaster.vo.plugin.TCommentPriVo;
import demomaster.vo.plugin.TCommentNoPriVo;

import java.sql.Timestamp;

import org.apache.ibatis.annotations.Param;

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
public interface TCommentDAO {

    /**
     * insert
     */
    int insert(TCommentVo vo);

    /**
     * insert vos 批量插入
     */
    int inserts(@Param(value = "vos") List<TCommentVo> vos);

    /**
     * 查询base
     */
    List<TCommentVo> queryBase(TCommentVo query);

    /**
     * update base (exclude value is null or "")
     */
    int updateBase(@Param(value = "source") TCommentVo source, @Param(value = "target") TCommentVo target);


    /**
     * update base (include value is null or "")
     */
    int updateBaseIncludeNull(@Param(value = "source") TCommentVo source, @Param(value = "target") TCommentVo target);

    /**
     * 删除base
     */
    int deleteBase(TCommentVo vo);


    /**
     * 根据PrimaryKey查询
     * <p>
     * id : 
     * @param id
     * 
     */
    TCommentVo queryByPrimaryKey(@Param(value = "id") Integer id);

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
    int updateByPrimaryKey(@Param(value = "source") TCommentNoPriVo source,@Param(value = "target") TCommentPriVo target);

}
