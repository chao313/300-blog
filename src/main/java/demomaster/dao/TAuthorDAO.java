package demomaster.dao;


import java.util.List;

import demomaster.vo.TAuthorVo;
import demomaster.vo.plugin.TAuthorPriVo;
import demomaster.vo.plugin.TAuthorNoPriVo;


import org.apache.ibatis.annotations.Param;

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
public interface TAuthorDAO {

    /**
     * insert
     */
    int insert(TAuthorVo vo);

    /**
     * insert vos 批量插入
     */
    int inserts(@Param(value = "vos") List<TAuthorVo> vos);

    /**
     * 查询base
     */
    List<TAuthorVo> queryBase(TAuthorVo query);

    /**
     * update base (exclude value is null or "")
     */
    int updateBase(@Param(value = "source") TAuthorVo source, @Param(value = "target") TAuthorVo target);


    /**
     * update base (include value is null or "")
     */
    int updateBaseIncludeNull(@Param(value = "source") TAuthorVo source, @Param(value = "target") TAuthorVo target);

    /**
     * 删除base
     */
    int deleteBase(TAuthorVo vo);


    /**
     * 根据PrimaryKey查询
     * <p>
     * id : 
     * @param id
     * 
     */
    TAuthorVo queryByPrimaryKey(@Param(value = "id") Integer id);

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
    int updateByPrimaryKey(@Param(value = "source") TAuthorNoPriVo source,@Param(value = "target") TAuthorPriVo target);

}
