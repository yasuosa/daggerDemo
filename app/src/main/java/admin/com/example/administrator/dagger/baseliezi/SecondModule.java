package admin.com.example.administrator.dagger.baseliezi;

import admin.com.example.administrator.dagger.baseliezi.annotion.ActivityScore;
import dagger.Module;
import dagger.Provides;

@Module
public class SecondModule {

    @Provides
    Cloth getCloth(){
        return new Cloth("黄");
    }
}
