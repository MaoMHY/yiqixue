package yiqixue.yiqixue.houtai.htModel;

import java.sql.Date;
import java.sql.Time;


public class Answer {
    int aid;
    int uid;
    int qid;
    int recallaid;
    int recalluid;
    String title;
    String text;
    String img;
    int agree;
    int star;
    float tip;
    Date date;
    Time time;

    public Answer(int aid, int uid, int qid, int recallaid, int recalluid, String title, String text, String img, int agree, int star, float tip, Date date, Time time) {
        this.aid = aid;
        this.uid = uid;
        this.qid = qid;
        this.recallaid = recallaid;
        this.recalluid = recalluid;
        this.title = title;
        this.text = text;
        this.img = img;
        this.agree = agree;
        this.star = star;
        this.tip = tip;
        this.date = date;
        this.time = time;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public int getRecallaid() {
        return recallaid;
    }

    public void setRecallaid(int recallaid) {
        this.recallaid = recallaid;
    }

    public int getRecalluid() {
        return recalluid;
    }

    public void setRecalluid(int recalluid) {
        this.recalluid = recalluid;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getAgree() {
        return agree;
    }

    public void setAgree(int agree) {
        this.agree = agree;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public float getTip() {
        return tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
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
}
