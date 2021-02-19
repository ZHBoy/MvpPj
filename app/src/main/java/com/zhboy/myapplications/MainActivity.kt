package com.zhboy.myapplications

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhboy.myapplications.bean.MainBean
import com.zhboy.myapplications.ui.main.MainContract
import com.zhboy.myapplications.ui.main.MainPresenter
import com.zhboy.myapplications.mvp.ResponseListener

class MainActivity : AppCompatActivity(), MainContract.View {

    private var presenter: MainContract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainPresenter(this)

        //获取主页面数据
        presenter?.getMainData("0023ddr", object : ResponseListener<MainBean, String> {
            override fun onSuccess(success: MainBean) {
            }

            override fun onError(error: String) {
            }
        })
    }

    override fun context(): Activity = this

    override fun setPresenter(presenter: MainContract.Presenter) {
        this.presenter = presenter
    }
}