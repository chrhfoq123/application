package org.techtown.proverbpractice;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
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

                /* 쿼리 명령어  -> 마인크래프트 명령어라고 생각하면됨 */

                Context context = getActivity().getApplicationContext();
                /*데이터 베이스를 만드는 명령어*/
                SQLiteDatabase db = context.openOrCreateDatabase("ptk_db", Context.MODE_PRIVATE, null);

                /* 데이터 베이스 테이블을 만드는 쿼리문 (명령어) */
                db.execSQL("CREATE TABLE IF NOT EXISTS 'comment_list'(category VARCHAR(50), comment VARCHAR(255), content VARCHAR(512)) ");

                /* 데이터 베이스 (데이블) 해당 열 에 입력 하는 쿼리문 (명령어) 넣어주는거*/
                db.execSQL("INSERT INTO comment_list (category, comment, content) VALUES ('"+ category +"','"+ comment +"','"+ content +"')  ");
                Log.d("sql 내가 입력한값", "INSERT INTO comment_list (category, comment, content) VALUES ('"+ category +"','"+ comment +"','"+ content +"')  ");

                /* 해당 모든테이블에 데이터를 조회하는 쿼리문 (명령어) */
                Cursor cursor = db.rawQuery("SELECT * FROM comment_list", null);
                while (cursor.moveToNext()) {
                    String db_column_0 = cursor.getString(0);
                    String db_column_1 = cursor.getString(1);
                    String db_column_2 = cursor.getString(2);
                    Log.d("첫번째 칼럼", db_column_0);
                    Log.d("두번째 칼럼", db_column_1);
                    Log.d("새번째 칼럼", db_column_2);
                }

                /*Cursor cursor = database.rawQuery(sql,null);
                while(cursor.moveToNext()){
                    String id = cursor.getString(0);
                    String pass = cursor.getString(1);
                }*/

                //대충 데이터베이스 입력하는 어쩌구 저쩌구 함수 (new asdsad("구분","문구","설명"))


            }
        });
        return view;
    }
}
