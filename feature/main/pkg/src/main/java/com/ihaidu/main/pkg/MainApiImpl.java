package com.ihaidu.main.pkg;

import android.content.Context;
import android.content.Intent;

import com.blankj.utilcode.util.ApiUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.ihaidu.main.export.api.MainApi;
import com.ihaidu.main.export.bean.MainParam;
import com.ihaidu.main.export.bean.MainResult;
import com.ihaidu.main.pkg.feature.activity.MainActivity;

@ApiUtils.Api
public class MainApiImpl extends MainApi {
    @Override
    public MainResult startMainActivity(Context context, final MainParam param) {
        Intent starter = new Intent(context, MainActivity.class);
        context.startActivity(starter);

        ThreadUtils.runOnUiThreadDelayed(new Runnable() {
            @Override
            public void run() {
                ToastUtils.showShort("MainParam.param: " + param.getParam());
            }
        }, 2000);

        return new MainResult("MainApi called succeed!");
    }
}
