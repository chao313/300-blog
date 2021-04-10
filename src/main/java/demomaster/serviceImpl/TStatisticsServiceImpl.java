package demomaster.serviceImpl;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import demomaster.vo.TStatisticsVo;
import demomaster.dao.TStatisticsDAO;
import demomaster.service.TStatisticsService;
import demomaster.vo.plugin.TStatisticsPriVo;
import demomaster.vo.plugin.TStatisticsNoPriVo;



/**
 * 表名称      :t_statistics
 * 表类型      :BASE TABLE
 * 表引擎      :InnoDB
 * 表版本      :10
 * 行格式      :Dynamic
 * 表创建      :2020-2-13
 * 字符集      :utf8mb4_bin
 * 表注释      :统计信息
 */
@Service
public class TStatisticsServiceImpl implements TStatisticsService {

    @Autowired
    private TStatisticsDAO dao;

    /**
     * insert
     */
    @Override
    public boolean insert(TStatisticsVo vo) {

        return dao.insert(vo) > 0 ? true : false;

    }

    /**
     * insert vos 批量插入
     */
    @Override
    public boolean insert(List<TStatisticsVo> vos) {

        return dao.inserts(vos) > 0 ? true : false;

    }

    /**
     * 查询base
     */
    @Override
    public List<TStatisticsVo> queryBase(TStatisticsVo query) {

        return dao.queryBase(query);

    }

    /**
     * update base (exclude value is null or "")
     */
    @Override
    public boolean updateBase(TStatisticsVo source, TStatisticsVo target) {

        return dao.updateBase(source, target) > 0 ? true : false;

    }

    /**
     * update base (include value is null or "")
     */
    @Override
    public boolean updateBaseIncludeNull(TStatisticsVo source, TStatisticsVo target) {

        return dao.updateBaseIncludeNull(source, target) > 0 ? true : false;

    }

    /**
     * 删除base
     */
    @Override
    public boolean deleteBase(TStatisticsVo vo) {

        return dao.deleteBase(vo) > 0 ? true : false;

    }


    /**
     * 根据PrimaryKey查询
     * <p>
     * id  
     */
    @Override
    public TStatisticsVo queryByPrimaryKey(Integer id) {

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
    public boolean updateByPrimaryKey(TStatisticsNoPriVo source,TStatisticsPriVo target){

        return dao.updateByPrimaryKey(source,target) > 0 ? true : false;

    }


}
