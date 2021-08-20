package org.techtown.proverbpractice;

public class Proverb extends Word{
    String title = "속담을 확인해보세요.";
    String[] comment = {"가는말이 고와야 오는말이 곱다", "소 잃고 외양간 고친다", "가던날이 장날", "우물 안 개구리"};
    String[] context = {"말을 곱게하자", "미리 잘하자", "사람 많음", "빠져나갈 곳이 없음"};

    int random = (int)(Math.random()*3);

    public String getTitle(){
        return title;
    }

    public String randomComment(){
        return comment[random];
    }

    public String randomContext(){
        return context[random];
    }
}