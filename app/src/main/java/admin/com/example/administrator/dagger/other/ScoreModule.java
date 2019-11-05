package admin.com.example.administrator.dagger.other;

import dagger.Module;
import dagger.Provides;

@Module
public class ScoreModule {

    @Provides
    Score provideCooker(){
        return new Score(99);
    }
}
