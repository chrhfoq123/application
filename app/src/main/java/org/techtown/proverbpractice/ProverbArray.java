package org.techtown.proverbpractice;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ProverbArray extends Fragment {
    TextView textView;
    String s;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.proverbarrlayout, container,false);

        textView = view.findViewById(R.id.textView);

        String result = "짜잔 아무것도 없음";
        if(getArguments() != null){
            s = getArguments().getString("name");
            ArrayList<Box> list = getArguments().getParcelableArrayList("list");
            if(list.size() != 0){
                result = "";
            }
            for(int i=0; i<list.size(); i++){
                Box box = list.get(i);
                result += "1. 분류 => "+ box.category +"";
                result += "2. 내용 => "+ box.comment +"";
                result += "3. 설명 => "+ box.content +"";
                result += "\n";

            }
        }
        textView.setText(result);


        return view;
    }
}
