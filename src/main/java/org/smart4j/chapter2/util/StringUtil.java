package org.smart4j.chapter2.util;

;import org.apache.commons.lang3.StringUtils;

/**
 * http://www.otvcloud.com/
 * <p>
 * <p>
 * 字符串操作工具
 * </p>
 *
 * @author roadoor
 * @create 2017-09-22 18:01.
 */
public class StringUtil {

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return !StringUtil.isEmpty(str);
    }
}
