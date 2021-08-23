package org.techtown.proverbpractice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProverbArray extends Fragment {
    TextView textView;
    String s;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.proverbarrlayout, container,false);

        textView = view.findViewById(R.id.textView);

        if(getArguments() != null){
            s = getArguments().getString("name");
            textView.setText(s);
        }

        return view;
    }
}
