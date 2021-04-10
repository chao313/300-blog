package demomaster.vo.request;

import demomaster.vo.TBlogVo;

/**
 * 这个是用于updateBase的request使用
 */
public class TBlogRequestUpdateBase {

    /**
     * source -> 需要更新的
     */
    private TBlogVo source;

    /**
     * target -> 目标条件
     */
    private TBlogVo target;



    public TBlogVo getSource() {
        return source;
    }

    public void setSource(TBlogVo source) {
        this.source = source;
    }

    public TBlogVo getTarget() {
        return target;
    }

    public void setTarget(TBlogVo target) {
        this.target = target;
    }


    @Override
    public String toString() {
        return "TBlogRequestUpdateBase{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

}
