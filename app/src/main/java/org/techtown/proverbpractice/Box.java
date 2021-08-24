package org.techtown.proverbpractice;

import android.os.Parcel;
import android.os.Parcelable;

public class Box implements Parcelable {
    public String category;
    public String comment;
    public String content;

    public Box(String category, String comment, String content) {
        this.category = category;
        this.comment = comment;
        this.content = content;
    }

    protected Box(Parcel in) {
        category = in.readString();
        comment = in.readString();
        content = in.readString();
    }

    public static final Creator<Box> CREATOR = new Creator<Box>() {
        @Override
        public Box createFromParcel(Parcel in) {
            return new Box(in);
        }

        @Override
        public Box[] newArray(int size) {
            return new Box[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(category);
        dest.writeString(comment);
        dest.writeString(content);
    }
}
