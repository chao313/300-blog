package demomaster.vo.request;

import demomaster.vo.plugin.TBlogNoPriVo;
import demomaster.vo.plugin.TBlogPriVo;

/**
 * 这个是用于updateByKey的request使用
 */
public class TBlogRequestUpdatePrimaryKey {

    /**
     * source -> 需要更新的
     */
    private TBlogNoPriVo source;

    /**
     * target -> 目标条件
     */
    private TBlogPriVo target;



    public TBlogNoPriVo getSource() {
        return source;
    }

    public void setSource(TBlogNoPriVo source) {
        this.source = source;
    }

    public TBlogPriVo getTarget() {
        return target;
    }

    public void setTarget(TBlogPriVo target) {
        this.target = target;
    }


    @Override
    public String toString() {
        return "TBlogRequestUpdatePrimaryKey{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

}
