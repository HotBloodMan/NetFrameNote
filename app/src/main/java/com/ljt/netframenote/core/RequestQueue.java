package com.ljt.netframenote.core;

import com.ljt.netframenote.base.Request;
import com.ljt.netframenote.httpstacks.HttpStack;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ${JT.L} on 2018/2/26.
 * 请求队列, 使用优先队列,使得请求可以按照优先级进行处理.
 */

public final class RequestQueue {

    private BlockingQueue<Request<?>> mRequestQueue= new PriorityBlockingQueue<Request<?>>();

    private AtomicInteger mSerialNumGenerator=new AtomicInteger(0);

    public static int DEFAULT_CORE_NUMS=Runtime.getRuntime().availableProcessors()+1;

    private int mDispatcherNums=DEFAULT_CORE_NUMS;

    private NetworkExecutor[] mDispatchers=null;

    private HttpStack mHttpStack;

    

}
