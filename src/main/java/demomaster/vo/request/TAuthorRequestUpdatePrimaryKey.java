package demomaster.vo.request;

import demomaster.vo.plugin.TAuthorNoPriVo;
import demomaster.vo.plugin.TAuthorPriVo;

/**
 * 这个是用于updateByKey的request使用
 */
public class TAuthorRequestUpdatePrimaryKey {

    /**
     * source -> 需要更新的
     */
    private TAuthorNoPriVo source;

    /**
     * target -> 目标条件
     */
    private TAuthorPriVo target;



    public TAuthorNoPriVo getSource() {
        return source;
    }

    public void setSource(TAuthorNoPriVo source) {
        this.source = source;
    }

    public TAuthorPriVo getTarget() {
        return target;
    }

    public void setTarget(TAuthorPriVo target) {
        this.target = target;
    }


    @Override
    public String toString() {
        return "TAuthorRequestUpdatePrimaryKey{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

}
