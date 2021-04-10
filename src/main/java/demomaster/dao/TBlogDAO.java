package demomaster.dao;


import java.util.List;

import demomaster.vo.TBlogVo;
import demomaster.vo.plugin.TBlogPriVo;
import demomaster.vo.plugin.TBlogNoPriVo;


import org.apache.ibatis.annotations.Param;

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
public interface TBlogDAO {

    /**
     * insert
     */
    int insert(TBlogVo vo);

    /**
     * insert vos 批量插入
     */
    int inserts(@Param(value = "vos") List<TBlogVo> vos);

    /**
     * 查询base
     */
    List<TBlogVo> queryBase(TBlogVo query);

    /**
     * update base (exclude value is null or "")
     */
    int updateBase(@Param(value = "source") TBlogVo source, @Param(value = "target") TBlogVo target);


    /**
     * update base (include value is null or "")
     */
    int updateBaseIncludeNull(@Param(value = "source") TBlogVo source, @Param(value = "target") TBlogVo target);

    /**
     * 删除base
     */
    int deleteBase(TBlogVo vo);


    /**
     * 根据PrimaryKey查询
     * <p>
     * id : 
     * @param id
     * 
     */
    TBlogVo queryByPrimaryKey(@Param(value = "id") Integer id);

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
    int updateByPrimaryKey(@Param(value = "source") TBlogNoPriVo source,@Param(value = "target") TBlogPriVo target);

}
