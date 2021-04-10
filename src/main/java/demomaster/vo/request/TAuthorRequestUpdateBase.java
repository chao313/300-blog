package demomaster.vo.request;

import demomaster.vo.TAuthorVo;

/**
 * 这个是用于updateBase的request使用
 */
public class TAuthorRequestUpdateBase {

    /**
     * source -> 需要更新的
     */
    private TAuthorVo source;

    /**
     * target -> 目标条件
     */
    private TAuthorVo target;



    public TAuthorVo getSource() {
        return source;
    }

    public void setSource(TAuthorVo source) {
        this.source = source;
    }

    public TAuthorVo getTarget() {
        return target;
    }

    public void setTarget(TAuthorVo target) {
        this.target = target;
    }


    @Override
    public String toString() {
        return "TAuthorRequestUpdateBase{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

}
