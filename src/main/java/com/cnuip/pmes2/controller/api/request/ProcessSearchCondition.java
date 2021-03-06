package com.cnuip.pmes2.controller.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * Created by wangzhibin on 2018/1/12.
 */
@Data
@AllArgsConstructor
public class ProcessSearchCondition {
    private String name;
    private String username;
    private Date fromTime;
    private Date toTime;
}
