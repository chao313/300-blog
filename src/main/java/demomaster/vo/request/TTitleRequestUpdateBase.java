package demomaster.vo.request;

import demomaster.vo.TTitleVo;

/**
 * 这个是用于updateBase的request使用
 */
public class TTitleRequestUpdateBase {

    /**
     * source -> 需要更新的
     */
    private TTitleVo source;

    /**
     * target -> 目标条件
     */
    private TTitleVo target;



    public TTitleVo getSource() {
        return source;
    }

    public void setSource(TTitleVo source) {
        this.source = source;
    }

    public TTitleVo getTarget() {
        return target;
    }

    public void setTarget(TTitleVo target) {
        this.target = target;
    }


    @Override
    public String toString() {
        return "TTitleRequestUpdateBase{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

}
