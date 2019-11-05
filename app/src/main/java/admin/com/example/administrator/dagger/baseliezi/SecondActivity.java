package admin.com.example.administrator.dagger.baseliezi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

import javax.inject.Inject;

import admin.com.example.administrator.dagger.R;
import admin.com.example.administrator.dagger.baseliezi.app.MyApplication;

public class SecondActivity extends AppCompatActivity {


    @Inject
    Cloth cloth;
    private Cloth cloth1;

    private TextView tx;



    @Inject
    ClothHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SecondComponent component=DaggerSecondComponent.builder()
                .baseComponent(((MyApplication)getApplication()).getBaseComponent())
                .secondModule(new SecondModule())
                .build();
        component.inject(this);
        tx=findViewById(R.id.t2);
        cloth1 = (Cloth) getIntent().getSerializableExtra("cloth");

        tx.setText(cloth.equals(cloth1)+"");

        tx.setText(handler+"");

    }
}
