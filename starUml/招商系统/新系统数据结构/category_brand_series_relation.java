
import java.util.*;

/**
 * 分类与品牌系列关系表
 */
public class category_brand_series_relation {

    /**
     * Default constructor
     */
    public category_brand_series_relation() {
    }

    /**
     * 主键 
     * int(11)
     */
    public void id;

    /**
     * 关联分类表category主键
     * int(11)
     */
    public void category_id;

    /**
     * 关联品牌系列表brand_series主键
     * int(11)
     */
    public void brand_series_id;



}