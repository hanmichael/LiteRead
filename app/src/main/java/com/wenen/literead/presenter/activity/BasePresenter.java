package com.wenen.literead.presenter.activity;

import com.wenen.literead.contract.activity.BaseContract;

import me.zhanghai.android.materialprogressbar.MaterialProgressBar;

/**
 * Created by Wen_en on 16/9/14.
 */
public class BasePresenter implements BaseContract.Presenter {
    public MaterialProgressBar indeterminateHorizontalProgressToolbar;

    public BasePresenter(BaseContract.View view) {
        indeterminateHorizontalProgressToolbar = view.getProgressBar();
    }
}
