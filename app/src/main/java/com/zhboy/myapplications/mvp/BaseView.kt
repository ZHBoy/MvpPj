package com.zhboy.myapplications.mvp

/**
 * @author : HaoBoy
 * @date : 2019/4/10
 * @description :MVP  V层
 **/
interface BaseView<in T> {
    //将view层和presenter层进行数据绑定
    fun setPresenter(presenter : T)
}