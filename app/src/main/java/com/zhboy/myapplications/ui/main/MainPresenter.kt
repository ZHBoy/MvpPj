package com.zhboy.myapplications.ui.main

import com.zhboy.myapplications.bean.MainBean
import com.zhboy.myapplications.mvp.ResponseListener

/**
 *@author : HaoBoy
 *@date : 2019/4/11
 *@description :抽奖的P层
 **/
class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    init {
        view.setPresenter(this)
    }

    override fun getMainData(
        uid: String,
        mMainResponseListener: ResponseListener<MainBean, String>
    ) {
        //进行网络请求、数据库操作等

        //成功 mMainResponseListener.onSuccess(MainBean())

        //失败 mMainResponseListener.onError(String())
    }

}