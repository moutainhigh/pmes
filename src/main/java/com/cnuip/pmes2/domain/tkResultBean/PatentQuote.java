package com.cnuip.pmes2.domain.tkResultBean;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User:zhaozhihui
 * Date: 2018/6/28.
 * Time: 15:43
 */
@Setter
@Getter
public class PatentQuote {
    private List<QuoteData> quoteData;
    private List<QuoteData> byQuoteTotal;
}
