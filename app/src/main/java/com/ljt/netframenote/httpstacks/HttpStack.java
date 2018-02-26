package com.ljt.netframenote.httpstacks;

import com.ljt.netframenote.base.Request;
import com.ljt.netframenote.base.Response;

/**
 * Created by ${JT.L} on 2018/2/26.
 * 执行网络请求的接口
 */

public interface HttpStack {
/*
*执行Http请求
* */
   public Response performRequest(Request<?> request);

}
