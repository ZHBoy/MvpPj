package com.zhboy.myapplications.ui.main

import android.app.Activity
import com.zhboy.myapplications.bean.MainBean
import com.zhboy.myapplications.mvp.BaseView
import com.zhboy.myapplications.mvp.ResponseListener

/**
 *@author : HaoBoy
 *@date : 2019/4/11
 *@description :抽奖mvp控制类
 **/
interface MainContract {

    interface Presenter {
        /**.获取会员信息**/
        fun getMainData(uid: String, mMainResponseListener: ResponseListener<MainBean, String>)
    }

    //主要是将去定上下文对象context类型
    interface View :
        BaseView<Presenter> {
        fun context(): Activity
    }

}