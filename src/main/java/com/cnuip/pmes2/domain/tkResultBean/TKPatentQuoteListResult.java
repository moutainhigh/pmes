package com.cnuip.pmes2.domain.tkResultBean;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA.
 * User:zhaozhihui
 * Date: 2018/6/28.
 * Time: 15:41
 */
@Setter
@Getter
public class TKPatentQuoteListResult {
    private boolean success;
    private String message;
    private Object error;
    private PatentQuote result;
}
