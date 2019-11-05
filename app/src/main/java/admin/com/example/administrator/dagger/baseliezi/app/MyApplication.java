package admin.com.example.administrator.dagger.baseliezi.app;

import android.app.Application;

import admin.com.example.administrator.dagger.baseliezi.base.BaseComponent;
import admin.com.example.administrator.dagger.baseliezi.base.BaseModule;
import admin.com.example.administrator.dagger.baseliezi.base.DaggerBaseComponent;

public class MyApplication extends Application {

    private BaseComponent baseComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        baseComponent = DaggerBaseComponent.builder().baseModule(new BaseModule()).build();
    }

    public BaseComponent getBaseComponent() {
        return baseComponent;
    }
}
