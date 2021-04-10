package demomaster.vo.request;

import demomaster.vo.TPicVo;

/**
 * 这个是用于updateBase的request使用
 */
public class TPicRequestUpdateBase {

    /**
     * source -> 需要更新的
     */
    private TPicVo source;

    /**
     * target -> 目标条件
     */
    private TPicVo target;



    public TPicVo getSource() {
        return source;
    }

    public void setSource(TPicVo source) {
        this.source = source;
    }

    public TPicVo getTarget() {
        return target;
    }

    public void setTarget(TPicVo target) {
        this.target = target;
    }


    @Override
    public String toString() {
        return "TPicRequestUpdateBase{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

}
