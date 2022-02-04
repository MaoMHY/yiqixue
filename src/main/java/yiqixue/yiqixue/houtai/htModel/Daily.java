package yiqixue.yiqixue.houtai.htModel;

public class Daily {
    int did;
    int uid;
    String title;
    String text;
    String img;

    public Daily(int did, int uid, String title, String text, String img) {
        this.did = did;
        this.uid = uid;
        this.title = title;
        this.text = text;
        this.img = img;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
