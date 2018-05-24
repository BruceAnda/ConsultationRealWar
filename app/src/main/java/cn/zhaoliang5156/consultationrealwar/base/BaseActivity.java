package cn.zhaoliang5156.consultationrealwar.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * Activity基类
 * 需求：Activity的共同代码写在这里
 *
 * @author zhaoliang
 * @version 1.0
 */
public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    /**
     * 初始化操作
     */
    private void init() {
        setContentView(initLayout());
        initView();
        initListener();
        initData();
    }

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 初始化点击事件
     */
    protected abstract void initListener();

    /**
     * 初始化View
     */
    protected abstract void initView();

    /**
     * 初始化布局
     *
     * @return
     */
    protected abstract int initLayout();
}
