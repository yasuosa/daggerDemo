package admin.com.example.administrator.dagger.baseliezi;

import javax.inject.Singleton;

import admin.com.example.administrator.dagger.baseliezi.annotion.ActivityScore;
import admin.com.example.administrator.dagger.baseliezi.base.BaseComponent;
import dagger.Component;
import dagger.Provides;

@ActivityScore
@Component(modules = MainModule.class,dependencies = BaseComponent.class)
public interface MainComponent {

    void inject(FristActivity activity);
}
