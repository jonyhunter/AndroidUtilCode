package com.ihaidu.main.export.api;

import android.content.Context;

import com.blankj.utilcode.util.ApiUtils;
import com.ihaidu.main.export.bean.MainParam;
import com.ihaidu.main.export.bean.MainResult;

public abstract class MainApi extends ApiUtils.BaseApi {

    public abstract MainResult startMainActivity(Context context, MainParam param);

}
