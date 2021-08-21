package org.techtown.proverbpractice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mainlayout, container,false);

        Button send;

        send = view.findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton proverb = view.findViewById(R.id.proverb);
                RadioButton goodword = view.findViewById(R.id.goodword);
                EditText input_comment, input_content;

                input_comment = view.findViewById(R.id.comment);
                input_content = view.findViewById(R.id.content);

                String category = null;
                String comment = null;
                String content = null;

                if(proverb.isChecked()){
                    category = "속담";
                } else if (goodword.isChecked()) {
                    category = "명언";
                }

                comment = input_comment.getText().toString();
                content = input_content.getText().toString();

                //대충 데이터베이스 입력하는 어쩌구 저쩌구 함수 (new asdsad("구분","문구","설명"))


            }
        });
        return view;
    }
}
