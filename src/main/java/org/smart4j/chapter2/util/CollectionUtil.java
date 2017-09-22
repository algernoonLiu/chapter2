package org.smart4j.chapter2.util;

;import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * http://www.otvcloud.com/
 * <p>
 * <p>
 * 集合处理工具类
 * </p>
 *
 * @author roadoor
 * @create 2017-09-22 18:17.
 */
public class CollectionUtil {

    /**
     * 判断Collection是否为空
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<?> collection) {
        return CollectionUtils.isEmpty(collection);
    }

    /**
     * 判断Collection是否非空
     * @param collection
     * @return
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return !CollectionUtil.isEmpty(collection);
    }

    /**
     * 判断Map是否为空
     * @param map
     * @return
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return MapUtils.isEmpty(map);
    }

    /**
     * 判断Map是否非空
     * @param map
     * @return
     */
    public static boolean isNotEmpty(Map<?, ?> map) {
        return !CollectionUtil.isEmpty(map);
    }

}
