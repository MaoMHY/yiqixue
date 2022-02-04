package yiqixue.yiqixue.houtai.htModel;

import java.sql.Date;
import java.sql.Time;

public class message {
    int mid;
    int uid;
    String title;
    String text;
    Date date;
    Time time;
    int read;

    public message(int mid, int uid, String title, String text, Date date, Time time, int read) {
        this.mid = mid;
        this.uid = uid;
        this.title = title;
        this.text = text;
        this.date = date;
        this.time = time;
        this.read = read;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }
}
