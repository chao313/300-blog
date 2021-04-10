package demomaster.vo.request;

import demomaster.vo.plugin.TTitleNoPriVo;
import demomaster.vo.plugin.TTitlePriVo;

/**
 * 这个是用于updateByKey的request使用
 */
public class TTitleRequestUpdatePrimaryKey {

    /**
     * source -> 需要更新的
     */
    private TTitleNoPriVo source;

    /**
     * target -> 目标条件
     */
    private TTitlePriVo target;



    public TTitleNoPriVo getSource() {
        return source;
    }

    public void setSource(TTitleNoPriVo source) {
        this.source = source;
    }

    public TTitlePriVo getTarget() {
        return target;
    }

    public void setTarget(TTitlePriVo target) {
        this.target = target;
    }


    @Override
    public String toString() {
        return "TTitleRequestUpdatePrimaryKey{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

}
