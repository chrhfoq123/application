package org.techtown.proverbpractice;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
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

        //ArrayList<Box> list = getArguments().getParcelableArrayList("list");
        //여기부터
        ListView listview = view.findViewById(R.id.listView);

        //컨택스트 객채 생성 외울것
        Context context = getActivity().getApplicationContext();

        //db객채 생성 "db이름", "뭔지모름외워야함", null
        SQLiteDatabase db = context.openOrCreateDatabase("ptk_db", Context.MODE_PRIVATE, null);

        Cursor cursor = db.rawQuery("SELECT * FROM comment_list", null);

        ArrayList<String> testarray = new ArrayList<String>();

        while (cursor.moveToNext()) {
            String category = cursor.getString(0);
            String comment = cursor.getString(1);
            String content = cursor.getString(2);
            //Box obj = new Box("category","comment","content");
            testarray.add(comment);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, testarray);
        listview.setAdapter(adapter);


        return view;
    }
}

