package admin.com.example.administrator.dagger.baseliezi;

import admin.com.example.administrator.dagger.baseliezi.annotion.ActivityScore;
import admin.com.example.administrator.dagger.baseliezi.base.BaseComponent;
import dagger.Component;

@ActivityScore
@Component(modules =SecondModule.class,dependencies = BaseComponent.class)
public interface SecondComponent {

    void inject(SecondActivity activity);
}
