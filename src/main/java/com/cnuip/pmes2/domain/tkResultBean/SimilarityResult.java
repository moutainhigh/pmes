package com.cnuip.pmes2.domain.tkResultBean;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User:zhaozhihui
 * Date: 2018/6/28.
 * Time: 14:54
 */
@Setter
@Getter
public class SimilarityResult {
    private Integer total;
    private List<SimilarityInfo> data;
}
