package demomaster.vo.request;

import demomaster.vo.plugin.TCommentNoPriVo;
import demomaster.vo.plugin.TCommentPriVo;

/**
 * 这个是用于updateByKey的request使用
 */
public class TCommentRequestUpdatePrimaryKey {

    /**
     * source -> 需要更新的
     */
    private TCommentNoPriVo source;

    /**
     * target -> 目标条件
     */
    private TCommentPriVo target;



    public TCommentNoPriVo getSource() {
        return source;
    }

    public void setSource(TCommentNoPriVo source) {
        this.source = source;
    }

    public TCommentPriVo getTarget() {
        return target;
    }

    public void setTarget(TCommentPriVo target) {
        this.target = target;
    }


    @Override
    public String toString() {
        return "TCommentRequestUpdatePrimaryKey{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

}
