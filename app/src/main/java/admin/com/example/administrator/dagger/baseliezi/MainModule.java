package admin.com.example.administrator.dagger.baseliezi;

import javax.inject.Named;
import javax.inject.Singleton;


import admin.com.example.administrator.dagger.baseliezi.annotion.ActivityScore;
import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {


    @Provides
    Cloth getRedCloth(){
        return new Cloth("红");
    }



    @Provides
    Cloths getColths( Cloth cloth){
        return new Cloths(cloth);
    }



}
