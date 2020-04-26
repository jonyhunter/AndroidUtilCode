package com.ihaidu.mock.main;

import android.content.Context;

import com.blankj.utilcode.util.ApiUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.ihaidu.main.export.api.MainApi;
import com.ihaidu.main.export.bean.MainParam;
import com.ihaidu.main.export.bean.MainResult;

@ApiUtils.Api(isMock = true)
public class MainApiMock extends MainApi {
    @Override
    public MainResult startMainActivity(Context context, final MainParam param) {
        ThreadUtils.runOnUiThreadDelayed(new Runnable() {
            @Override
            public void run() {
                ToastUtils.showShort("MainParam.param: " + param.getParam());
            }
        }, 2000);

        return new MainResult("MainApiMock called succeed!");
    }
}
