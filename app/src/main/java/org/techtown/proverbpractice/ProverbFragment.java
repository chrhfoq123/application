package org.techtown.proverbpractice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProverbFragment extends Fragment {

    /**
     *  프레그먼트메니저로 자신을 호출했을때?
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.proverlayout, container, false);

        TextView title, comment, content;
        title = view.findViewById(R.id.title);
        title.setText("속담 setContext");

        comment = view.findViewById(R.id.comment);
        comment.setText("속담 문구 setText");

        content = view.findViewById(R.id.content);
        content.setText("속담 내용 setText");


        return view;
    }

}