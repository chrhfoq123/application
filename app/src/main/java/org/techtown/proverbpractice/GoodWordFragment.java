package org.techtown.proverbpractice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class GoodWordFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.goodwordlayout, container, false);
        TextView title, comment, content;

        Goodword word = new Goodword();

        title = view.findViewById(R.id.title);
        title.setText(Goodword.title);

        comment = view.findViewById(R.id.comment);
        comment.setText(word.getWord().getComment());

        content = view.findViewById(R.id.content);
        content.setText(word.getWord().getContent());

        Button reset = view.findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView title, comment, content;

                Goodword word = new Goodword();

                title = view.findViewById(R.id.title);
                title.setText(Goodword.title);

                comment = view.findViewById(R.id.comment);
                comment.setText(word.getWord().getComment());

                content = view.findViewById(R.id.content);
                content.setText(word.getWord().getContent());

            }
        });



        return view;
    }
}
