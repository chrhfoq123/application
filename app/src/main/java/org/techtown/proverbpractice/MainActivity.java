package org.techtown.proverbpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_proverb, btn_main, btn_goodword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_proverb = findViewById(R.id.btn_proverb);
        btn_proverb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Proverb proverb = new Proverb();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.def_frame, proverb);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}