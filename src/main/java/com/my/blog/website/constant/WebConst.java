package com.my.blog.website.constant;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 存储网站常量
 */
@Component
public class WebConst {
    /**
     * 存储安装信息的配置文件名称
     */
    // public static final String INSTALL_FILE_CONF = "install.lock";

    // 初始化配置
    public static Map<String, String> initConfig = new HashMap<>();

    //  登录用户在session的key
    public static final String LOGIN_SESSION_KEY = "login_user";

    // 用户ID的   cookie名称
    public static final String USER_IN_COOKIE = "S_L_ID";

    /**
     * aes加密加盐
     */
    public static String AES_SALT = "0123456789abcdef";

    /**
     * 最大获取文章条数
     */
    public static final int MAX_POSTS = 9999;

    /**
     * 最大页码
     */
    public static final int MAX_PAGE = 100;

    /**
     * 文章最多可以输入的文字数
     */
    public static final int MAX_TEXT_COUNT = 200000;

    /**
     * 文章标题最多可以输入的文字个数
     */
    public static final int MAX_TITLE_COUNT = 200;

    /**
     * 点击次数超过多少更新到数据库
     */
    public static final int HIT_EXCEED = 10;

    /**
     * 上传文件为最大1M
     */
    public static Integer MAX_FILE_SIZE = 1048576;

    /**
     * 要过滤的ip列表 存储的元素无序，值不能重复
     */
    public static final Set<String> BLOCK_IPS = new HashSet<>(16);
}
