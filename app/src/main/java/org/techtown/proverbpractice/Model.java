package org.techtown.proverbpractice;

public class Model {
    private String comment, content;

    public Model (String comment, String content) {
        this.comment = comment;
        this.content = content;
    }

    public String getComment() {
        return comment;
    }

    public String getContent() {
        return content;
    }
}
