package com.ihaidu.splash.pkg;

import com.blankj.common.activity.CommonActivity;
import com.blankj.utilcode.util.ApiUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.ihaidu.main.export.api.MainApi;
import com.ihaidu.main.export.bean.MainParam;
import com.ihaidu.main.export.bean.MainResult;

public class SplashActivity extends CommonActivity {
    @Override
    public int bindLayout() {
        return R.layout.activity_splash;
    }

    @Override
    public void doBusiness() {
        super.doBusiness();

        ThreadUtils.runOnUiThreadDelayed(new Runnable() {
            @Override
            public void run() {
                MainResult result = ApiUtils.getApi(MainApi.class).startMainActivity(SplashActivity.this,
                        new MainParam("Start MainActivity"));

                ToastUtils.showShort("call startMainActivity result: " + result.getResult());
            }
        }, 3000);
    }
}
