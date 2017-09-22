package org.smart4j.chapter2.util;

;

/**
 * http://www.otvcloud.com/
 * <p>
 * <p>
 * 数据转换工具
 * </p>
 *
 * @author roadoor
 * @create 2017-09-22 17:49.
 */
public class CastUtil {

    /**
     * 转为字符串（默认为空字符串）
     * @param obj
     * @return
     */
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    /**
     * 转为字符串（提供默认值）
     * @param obj
     * @return
     */
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为int类型（默认为0）
     * @param obj
     * @return
     */
    public static Integer castInteger(Object obj) {
        return CastUtil.castInteger(obj, 0);

    }

    /**
     * 转为int类型（提供默认值）
     * @param obj
     * @return
     */
    public static Integer castInteger(Object obj, Integer defaultValue) {
        Integer intValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try{
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e){
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转为long类型（默认为0）
     * @param obj
     * @return
     */
    public static Long castLong(Object obj) {
        return CastUtil.castLong(obj, 0L);

    }

    /**
     * 转为long类型（提供默认值）
     * @param obj
     * @return
     */
    public static Long castLong(Object obj, Long defaultValue) {
        Long longValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try{
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e){
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为double类型（默认为0）
     * @param obj
     * @return
     */
    public static Double castDouble(Object obj) {
        return CastUtil.castDouble(obj, 0.0);

    }

    /**
     * 转为double类型（提供默认值）
     * @param obj
     * @return
     */
    public static Double castDouble(Object obj, Double defaultValue) {
         Double doubleValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try{
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e){
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转为布尔类型（默认为false）
     * @param obj
     * @return
     */
    public static Boolean castBoolean(Object obj) {
        return CastUtil.castBoolean(obj, Boolean.FALSE);

    }

    /**
     * 转为布尔类型（提供默认值）
     * @param obj
     * @return
     */
    public static Boolean castBoolean(Object obj, Boolean defaultValue) {
        Boolean booleanValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try{
                    booleanValue = Boolean.parseBoolean(strValue);
                } catch (NumberFormatException e){
                    booleanValue = defaultValue;
                }
            }
        }
        return booleanValue;
    }
}
