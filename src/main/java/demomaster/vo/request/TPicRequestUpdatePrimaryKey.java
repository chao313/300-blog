package demomaster.vo.request;

import demomaster.vo.plugin.TPicNoPriVo;
import demomaster.vo.plugin.TPicPriVo;

/**
 * 这个是用于updateByKey的request使用
 */
public class TPicRequestUpdatePrimaryKey {

    /**
     * source -> 需要更新的
     */
    private TPicNoPriVo source;

    /**
     * target -> 目标条件
     */
    private TPicPriVo target;



    public TPicNoPriVo getSource() {
        return source;
    }

    public void setSource(TPicNoPriVo source) {
        this.source = source;
    }

    public TPicPriVo getTarget() {
        return target;
    }

    public void setTarget(TPicPriVo target) {
        this.target = target;
    }


    @Override
    public String toString() {
        return "TPicRequestUpdatePrimaryKey{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

}
