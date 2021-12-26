package com.xiangxue.jack.service;


import rx.Observable;

import java.util.List;
import java.util.concurrent.Future;

public interface UserService {
    List<String> queryContents();

    Future<String> queryContentsAsyn();

    List<String> queryContent();

    String queryMonitor();

    public Observable<String> mergeResult();
}
