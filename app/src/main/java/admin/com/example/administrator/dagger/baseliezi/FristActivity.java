package admin.com.example.administrator.dagger.baseliezi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import admin.com.example.administrator.dagger.R;


import admin.com.example.administrator.dagger.baseliezi.app.MyApplication;
import admin.com.example.administrator.dagger.other.DaggerStudentComponent;

public class FristActivity extends AppCompatActivity {


//
//    @ClothRed
//    @Inject
//    Cloth cloth1;
//
//    @ClothYellow
//    @Inject
//    Cloth cloth2;

    @Inject
    Cloth cloth1;

    @Inject
    Cloth cloth2;




    @Inject
    Cloths cloths;


    @Inject
    ClothHandler handler;


    TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        tx=findViewById(R.id.tx1);

        MainComponent component=DaggerMainComponent.builder().baseComponent(((MyApplication)getApplication()).getBaseComponent())
        .mainModule(new MainModule()).build();
        component.inject(this);
        tx.setText(cloth1.toString()+"\n");
        tx.append(cloths.toString()+"\n");
        tx.append(cloth1.equals(cloth2) +""+"\n");
        tx.append(cloth1.equals(cloths.getCloth()) +""+"\n");
        tx.setText(handler.handle(cloth1)+"    "+handler);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FristActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });
//        tx.append(cloth2.toString());
    }
}
