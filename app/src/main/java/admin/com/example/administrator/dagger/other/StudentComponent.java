package admin.com.example.administrator.dagger.other;

import dagger.Component;

@Component(modules = ScoreModule.class)
public interface StudentComponent {

    void inject(Main2Activity activity);
}
