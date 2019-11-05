package admin.com.example.administrator.dagger.other;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import admin.com.example.administrator.dagger.R;

public class Main2Activity extends AppCompatActivity {

    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        DaggerStudentComponent.create().inject(this);

        System.out.println(student.getScore().getNumber());
    }
}
