package yiqixue.yiqixue.houtai.htModel;

public class Agree {
    int agid;
    int uid;
    int aid;

    public Agree(int agid, int uid, int aid) {
        this.agid = agid;
        this.uid = uid;
        this.aid = aid;
    }

    public int getAgrid() {
        return agid;
    }

    public void setAgrid(int agrid) {
        this.agid = agrid;
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
}
