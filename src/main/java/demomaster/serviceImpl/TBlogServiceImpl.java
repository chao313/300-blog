package demomaster.serviceImpl;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import demomaster.vo.TBlogVo;
import demomaster.dao.TBlogDAO;
import demomaster.service.TBlogService;
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
@Service
public class TBlogServiceImpl implements TBlogService {

    @Autowired
    private TBlogDAO dao;

    /**
     * insert
     */
    @Override
    public boolean insert(TBlogVo vo) {

        return dao.insert(vo) > 0 ? true : false;

    }

    /**
     * insert vos 批量插入
     */
    @Override
    public boolean insert(List<TBlogVo> vos) {

        return dao.inserts(vos) > 0 ? true : false;

    }

    /**
     * 查询base
     */
    @Override
    public List<TBlogVo> queryBase(TBlogVo query) {

        return dao.queryBase(query);

    }

    /**
     * update base (exclude value is null or "")
     */
    @Override
    public boolean updateBase(TBlogVo source, TBlogVo target) {

        return dao.updateBase(source, target) > 0 ? true : false;

    }

    /**
     * update base (include value is null or "")
     */
    @Override
    public boolean updateBaseIncludeNull(TBlogVo source, TBlogVo target) {

        return dao.updateBaseIncludeNull(source, target) > 0 ? true : false;

    }

    /**
     * 删除base
     */
    @Override
    public boolean deleteBase(TBlogVo vo) {

        return dao.deleteBase(vo) > 0 ? true : false;

    }


    /**
     * 根据PrimaryKey查询
     * <p>
     * id  
     */
    @Override
    public TBlogVo queryByPrimaryKey(Integer id) {

        return dao.queryByPrimaryKey(id);

    }

    /**
     * 根据PrimaryKey删除
     * <p>
     * id : 
     * @param id
     * 
     */
    @Override
    public boolean deleteByPrimaryKey(Integer id) {

        return dao.deleteByPrimaryKey(id) > 0 ? true : false;

    }

    /**
     * 根据PrimaryKey更新，会根据主键去更新其他的值(空值不覆盖有值)
     * <p>
     * id : 
     * @param id
     * 
     */
    @Override
    public boolean updateByPrimaryKey(TBlogNoPriVo source,TBlogPriVo target){

        return dao.updateByPrimaryKey(source,target) > 0 ? true : false;

    }


}
