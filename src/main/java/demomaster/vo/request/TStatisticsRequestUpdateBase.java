package demomaster.vo.request;

import demomaster.vo.TStatisticsVo;

/**
 * 这个是用于updateBase的request使用
 */
public class TStatisticsRequestUpdateBase {

    /**
     * source -> 需要更新的
     */
    private TStatisticsVo source;

    /**
     * target -> 目标条件
     */
    private TStatisticsVo target;



    public TStatisticsVo getSource() {
        return source;
    }

    public void setSource(TStatisticsVo source) {
        this.source = source;
    }

    public TStatisticsVo getTarget() {
        return target;
    }

    public void setTarget(TStatisticsVo target) {
        this.target = target;
    }


    @Override
    public String toString() {
        return "TStatisticsRequestUpdateBase{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

}
