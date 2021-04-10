package demomaster.dao;


import java.util.List;

import demomaster.vo.TPicVo;
import demomaster.vo.plugin.TPicPriVo;
import demomaster.vo.plugin.TPicNoPriVo;


import org.apache.ibatis.annotations.Param;

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
public interface TPicDAO {

    /**
     * insert
     */
    int insert(TPicVo vo);

    /**
     * insert vos 批量插入
     */
    int inserts(@Param(value = "vos") List<TPicVo> vos);

    /**
     * 查询base
     */
    List<TPicVo> queryBase(TPicVo query);

    /**
     * update base (exclude value is null or "")
     */
    int updateBase(@Param(value = "source") TPicVo source, @Param(value = "target") TPicVo target);


    /**
     * update base (include value is null or "")
     */
    int updateBaseIncludeNull(@Param(value = "source") TPicVo source, @Param(value = "target") TPicVo target);

    /**
     * 删除base
     */
    int deleteBase(TPicVo vo);


    /**
     * 根据PrimaryKey查询
     * <p>
     * id : 
     * @param id
     * 
     */
    TPicVo queryByPrimaryKey(@Param(value = "id") Integer id);

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
    int updateByPrimaryKey(@Param(value = "source") TPicNoPriVo source,@Param(value = "target") TPicPriVo target);

}
