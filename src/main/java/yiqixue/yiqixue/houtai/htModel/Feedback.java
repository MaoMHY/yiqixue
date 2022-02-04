package yiqixue.yiqixue.houtai.htModel;

public class Feedback {
    int fid;
    int uid;
    String text;
    int done;

    public Feedback(int fid, int uid, String text, int done) {
        this.fid = fid;
        this.uid = uid;
        this.text = text;
        this.done = done;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDone() {
        return done;
    }

    public void setDone(int done) {
        this.done = done;
    }
}
