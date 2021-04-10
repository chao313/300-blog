package demomaster.vo.request;

import demomaster.vo.TCommentVo;

/**
 * 这个是用于updateBase的request使用
 */
public class TCommentRequestUpdateBase {

    /**
     * source -> 需要更新的
     */
    private TCommentVo source;

    /**
     * target -> 目标条件
     */
    private TCommentVo target;



    public TCommentVo getSource() {
        return source;
    }

    public void setSource(TCommentVo source) {
        this.source = source;
    }

    public TCommentVo getTarget() {
        return target;
    }

    public void setTarget(TCommentVo target) {
        this.target = target;
    }


    @Override
    public String toString() {
        return "TCommentRequestUpdateBase{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

}
