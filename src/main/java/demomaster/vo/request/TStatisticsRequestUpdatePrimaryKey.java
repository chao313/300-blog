package demomaster.vo.request;

import demomaster.vo.plugin.TStatisticsNoPriVo;
import demomaster.vo.plugin.TStatisticsPriVo;

/**
 * 这个是用于updateByKey的request使用
 */
public class TStatisticsRequestUpdatePrimaryKey {

    /**
     * source -> 需要更新的
     */
    private TStatisticsNoPriVo source;

    /**
     * target -> 目标条件
     */
    private TStatisticsPriVo target;



    public TStatisticsNoPriVo getSource() {
        return source;
    }

    public void setSource(TStatisticsNoPriVo source) {
        this.source = source;
    }

    public TStatisticsPriVo getTarget() {
        return target;
    }

    public void setTarget(TStatisticsPriVo target) {
        this.target = target;
    }


    @Override
    public String toString() {
        return "TStatisticsRequestUpdatePrimaryKey{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

}
