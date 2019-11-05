package admin.com.example.administrator.dagger.baseliezi.base;

import javax.inject.Singleton;

import admin.com.example.administrator.dagger.baseliezi.Cloth;
import admin.com.example.administrator.dagger.baseliezi.ClothHandler;
import dagger.Component;

@Singleton
@Component(modules = BaseModule.class)
public interface BaseComponent {
    ClothHandler getClothHandler();
}
