package com.suql.SpringStudy.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * xy_userinfo
 * Created by wangkun23 on 2018/1/17.
 */
//@ToString
//@NoArgsConstructor
public class UserInfo {
    /**/
    @Setter
    @Getter
    private long id;

    /**/
    @Setter
    @Getter
    private String name;

    /**/
    @Setter
    @Getter
    private String cardId;

    /**/
    @Setter
    @Getter
    private String phone;

    /**
     * 用户性别
     */
    @Setter
    @Getter
    private Integer sex;

    /**
     * 用户类型
     */
    @Setter
    @Getter
    private Integer type;

    /**/
    @Setter
    @Getter
    private Long birthday;

    /**/
    @Setter
    @Getter
    private Long loginTime;

    /**/
    @Setter
    @Getter
    private Long registerTime;

    /**
     * 0删除1启用2禁用
     */
    @Setter
    @Getter
    private Integer state;

    /**/
    @Setter
    @Getter
    private String password;

    /**/
    @Setter
    @Getter
    private String ico;

    /**
     * 备注信息
     */
    @Setter
    @Getter
    private String remark;

    /**
     * 国家代码
     */
    @Setter
    @Getter
    private Integer countryCode;

    /**
     * 手机唯一编号,极光推送使用
     */
    @Setter
    @Getter
    private String deviceId;

    /**/
    @Setter
    @Getter
    private String email;

    /**
     * 特斯联同步状态
     */
    @Setter
    @Getter
    private Integer updateState;

    /**/
    @Setter
    @Getter
    private String token;

    /**/
    @Setter
    @Getter
    private Long tokenTime;

    /* 不在使用 原来应该是登录设备的id loginEquip*/
    @Setter
    @Getter
    private String loginIp;

    /**/
    @Setter
    @Getter
    private String faceUrl;

    /**/
    @Setter
    @Getter
    private String faceConditionUrl;

    /**/
    @Setter
    @Getter
    private Long upFaceImageTime;

    /**
     * 虹膜识别编号
     */
    @Setter
    @Getter
    private String irisCondition;

//    public UserInfo(Long id) {
//        this.id = id;
//    }
}
