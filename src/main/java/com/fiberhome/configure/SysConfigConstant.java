package com.fiberhome.configure;

/**
 * system configuration constant
 */
public class SysConfigConstant {

    /**
     * F1K
     */
    public static final String F1K_COMMAND_CONFIG_FILE_PATH = "f1kCommandConfigFile.xml";

    /**
     * F6K
     */
    public static final String F6K_COMMAND_CONFIG_FILE_PATH = "f6kCommandConfigFile.xml";

    /**
     * communicate limited time
     */
    public static final String EQUIPMENT_RESPONSE_LIMITED_TIME = "equipment.response.limited.time";

    /**
     *  default communicate limited time
     */
    public static final String EQUIPMENT_RESPONSE_DEFAULT_LIMITED_TIME = "1000";

    /**
     * equipment type
     */
    public static final String EQUIPMENT_TYPE = "equipment.type";

    /**
     * equipment type
     */
    public static final String EQUIPMENT_TYPE_F1K = "F1K";

    /**
     * equipment type
     */
    public static final String EQUIPMENT_TYPE_F6K = "F6K";

    /**
     * jetty
     */
    public static final String JETTY_IP = "0.0.0.0";

    /**
     * linux port
     */
    public static final String LINUX_PORT = "22";

    /**
     * http port
     */
    public static final String HTTP_PORT = "http.port";
    /**
     * https port
     */
    public static final String HTTPS_PORT = "https.port";
    /**
     * app name
     */
    public static final String APP_NAME = "app.name";
    /**
     * key store for https
     */
    public static final String KEY_STORE = "keyStore.path";
    /**
     * language
     */
    public static final String LANGUAGE = "language";

    /**
     * config.properties
     */
    public static final String CONFIG_PROP_FILEPATH = "conf/config/config.properties";

    /**
     * web.xml
     */
    public static final String WEB_XML_FILEPATH = "WEB-INF/web.xml";

    /**
     * 系统默认语言 default language
     */
    public static final String DEFAULT_LANGUAGE = "zh_CN";

    /**
     * 语言-中文 CHINESE language
     */
    public static final String MSG_LANGUAGE_ZH = "zh_CN";

    /**
     * 语言-英文 ENGLISH language
     */
    public static final String MSG_LANGUAGE_EN = "en_US";

    /**
     * 应用异常信息，显示信息的国际化资源key
     */
    public static final String MESSAGE_ERROR = "message.error";
    /**
     * message data
     */
    public static final String MESSAGE_DATA = "message.data";

    /**
     * salt value
     */
    public static final String SALT = "fiberhome";
    /**
     * password encryption algorithm
     */
    public static final String MD5ALGORITHM = "MD5";
    /**
     * encryption number
     */
    public static final int MD5NUM = 1024;

    /**
     * 文件编码枚举
     */
    public enum CharsetEnum {
        /**
         * DEFAULT
         */
        DEFAULT("UTF-8"),

        /**
         * GBK
         */
        GBK("GBK"),
        /**
         * other
         */
        OTHRE("OTHER");
        /**
         * 值
         */
        private String value;

        /**
         * 构造方法
         *
         * @param value 值
         */
        private CharsetEnum(String value) {
            this.value = value;
        }

        /**
         * 获取值
         *
         * @return int
         */
        public String value() {
            return value;
        }

        /**
         * 获取枚举值
         *
         * @param mapping 枚举类
         * @return 值
         */
        public static String getValue(CharsetEnum mapping) {
            return mapping.value;
        }

    }

}
