package admin.com.example.administrator.dagger.baseliezi.base;

import javax.inject.Singleton;

import admin.com.example.administrator.dagger.baseliezi.Cloth;
import admin.com.example.administrator.dagger.baseliezi.ClothHandler;
import dagger.Module;
import dagger.Provides;

@Module
public class BaseModule {


    @Singleton
    @Provides
    public ClothHandler getRedCloth(){
        return new ClothHandler();
    }
}
