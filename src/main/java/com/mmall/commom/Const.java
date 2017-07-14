package com.mmall.commom;

/**
 * Created by xuebing on 2017/7/7.
 */
public class Const {

    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Role{
        int ROLE_CUSTOEM = 0; //普通用户
        int ROLE_AMIDN = 1; //管理员
    }
}
