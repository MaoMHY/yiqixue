package yiqixue.yiqixue.houtai.htModel;

public class Tipoff {
    int tid;
    int uid;
    int aid;
    String text;

    public Tipoff(int tid, int uid, int aid, String text) {
        this.tid = tid;
        this.uid = uid;
        this.aid = aid;
        this.text = text;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
