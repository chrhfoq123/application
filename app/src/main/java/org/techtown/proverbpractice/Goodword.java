package org.techtown.proverbpractice;

import java.util.ArrayList;

public class Goodword extends Word{

    public static String title = "오늘의 명언";
    public ArrayList<Model> list = new ArrayList<Model>();
    public Model result;

    public Goodword() {
        init();
    }

    private void init(){

        //명언 입력 데이터베이스 대신 하드코딩
        this.list.add(new Model("자신감은 전염된다. 자신감의 부족도 마찬가지다.", "대충 자신감을 가지라는 뜻"));
        this.list.add(new Model("삶이 있는 한 희망은 있다", "살면 희망이있다는 뜻"));
        this.list.add(new Model("산다는것 그것은 치열한 전투이다", "산다는게 쉽지 않다는거 같다"));
        this.list.add(new Model("하루에 3시간을 걸으면 7년 후에 지구를 한바퀴 돌 수 있다", "많이걸어라 라는뜻인거같다"));
        this.list.add(new Model("언제나 현재에 집중할수 있다면 행복할것이다.", "뭔뜻인지 잘모르겠음"));
        this.list.add(new Model("진정으로 웃으려면 고통을 참아야하며 , 나아가 고통을 즐길 줄 알아야 해", "그렇다고 한다"));

        //모델 랜덤하게 셋팅
        int key = (int) (Math.random() * this.list.size());
        this.result = this.list.get(key);

    }

    public Model getWord() {
        return this.result;
    }


}
/*명언도감 커뮤니티 몇만개 명언모아두고 영감을 받는 어플*/