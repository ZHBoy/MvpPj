package com.zhboy.myapplications.mvp

/**
 * @author zhou_hao
 * @date 2021/2/19
 * @description: 结果回调 T成功回调 E失败回调
 */
interface ResponseListener<T,E> {
    fun onSuccess(success: T)
    fun onError(error: E)
}