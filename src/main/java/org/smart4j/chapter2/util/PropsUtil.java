package org.smart4j.chapter2.util;

;import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * http://www.otvcloud.com/
 * <p>
 * <p>
 * 配置文件加载
 * </p>
 *
 * @author roadoor
 * @create 2017-09-22 17:28.
 */
public class PropsUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 加载属性文件
     * @param fileName
     * @return
     */
    public static Properties loadProps(String fileName) {
        Properties props = null;
        InputStream is = null;
        try{
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if (is == null) {
                throw new RuntimeException(fileName + "file is not found");
            }
            props = new Properties();
            props.load(is);
        } catch (Exception e) {
            LOGGER.error("load properties file failure", e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    LOGGER.error("close input stream failure", e);
                }
            }
        }
        return props;
    }

    /**
     * 获取字符串属性（默认值为空字符串）
     * @param props
     * @param key
     * @return
     */
    public static String getString(Properties props, String key) {
        return getString(props, key, "");
    }

    /**
     * 获取字符串属性（可指定默认值）
     * @param props
     * @param key
     * @param defaultValue
     * @return
     */
    public static String getString(Properties props, String key, String defaultValue) {
        String value = defaultValue;
        if(props.containsKey(key)) {
            value = props.getProperty(key);
        }
        return value;
    }

    /**
     * 获取数值型属性（默认值为0）
     * @param props
     * @param key
     * @return
     */
    public static Integer getInteger(Properties props, String key) {
        return getInteger(props, key, 0);
    }

    /**
     * 获取数值型属性（可指定默认值）
     * @param props
     * @param key
     * @param defaultValue
     * @return
     */
    public static Integer getInteger(Properties props, String key, Integer defaultValue) {
        Integer value = defaultValue;
        if(props.containsKey(key)) {
            value = CastUtil.castInteger(props.getProperty(key));
        }
        return value;
    }

    /**
     * 获取布尔型属性（默认值为0）
     * @param props
     * @param key
     * @return
     */
    public static Boolean getBoolean(Properties props, String key) {
        return getBoolean(props, key, Boolean.FALSE);
    }

    /**
     * 获取布尔型属性（可指定默认值）
     * @param props
     * @param key
     * @param defaultValue
     * @return
     */
    public static Boolean getBoolean(Properties props, String key, Boolean defaultValue) {
        Boolean value = defaultValue;
        if(props.containsKey(key)) {
            value = CastUtil.castBoolean(props.getProperty(key));
        }
        return value;
    }

}
