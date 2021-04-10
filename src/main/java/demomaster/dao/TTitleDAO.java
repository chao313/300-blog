package demomaster.dao;


import java.util.List;

import demomaster.vo.TTitleVo;
import demomaster.vo.plugin.TTitlePriVo;
import demomaster.vo.plugin.TTitleNoPriVo;


import org.apache.ibatis.annotations.Param;

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
public interface TTitleDAO {

    /**
     * insert
     */
    int insert(TTitleVo vo);

    /**
     * insert vos 批量插入
     */
    int inserts(@Param(value = "vos") List<TTitleVo> vos);

    /**
     * 查询base
     */
    List<TTitleVo> queryBase(TTitleVo query);

    /**
     * update base (exclude value is null or "")
     */
    int updateBase(@Param(value = "source") TTitleVo source, @Param(value = "target") TTitleVo target);


    /**
     * update base (include value is null or "")
     */
    int updateBaseIncludeNull(@Param(value = "source") TTitleVo source, @Param(value = "target") TTitleVo target);

    /**
     * 删除base
     */
    int deleteBase(TTitleVo vo);


    /**
     * 根据PrimaryKey查询
     * <p>
     * id : 
     * @param id
     * 
     */
    TTitleVo queryByPrimaryKey(@Param(value = "id") Integer id);

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
    int updateByPrimaryKey(@Param(value = "source") TTitleNoPriVo source,@Param(value = "target") TTitlePriVo target);

}
