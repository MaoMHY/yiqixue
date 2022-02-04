package yiqixue.yiqixue.houtai.htModel;

import java.sql.Date;
import java.sql.Time;

public class Question {
    int qid;
    int uid;
    String title;
    String text;
    String img;
    Date date;
    Time time;
    int learning;
    int higherschool;
    int practice;
    int jobwanted;
    int economics;
    int literature;
    int science;
    int engineering;
    int medicine;
    int business;
    int applyforresearch;
    int examination;
    int recommend;
    int usa;
    int britain;
    int australia;
    int hongkong;
    int singapore;

    public Question(int qid, int uid, String title, String text, String img, Date date, Time time, int learning, int higherschool, int practice, int jobwanted, int economics, int literature, int science, int engineering, int medicine, int business, int applyforresearch, int examination, int recommend, int usa, int britain, int australia, int hongkong, int singapore) {
        this.qid = qid;
        this.uid = uid;
        this.title = title;
        this.text = text;
        this.img = img;
        this.date = date;
        this.time = time;
        this.learning = learning;
        this.higherschool = higherschool;
        this.practice = practice;
        this.jobwanted = jobwanted;
        this.economics = economics;
        this.literature = literature;
        this.science = science;
        this.engineering = engineering;
        this.medicine = medicine;
        this.business = business;
        this.applyforresearch = applyforresearch;
        this.examination = examination;
        this.recommend = recommend;
        this.usa = usa;
        this.britain = britain;
        this.australia = australia;
        this.hongkong = hongkong;
        this.singapore = singapore;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
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

    public int getLearning() {
        return learning;
    }

    public void setLearning(int learning) {
        this.learning = learning;
    }

    public int getHigherschool() {
        return higherschool;
    }

    public void setHigherschool(int higherschool) {
        this.higherschool = higherschool;
    }

    public int getPractice() {
        return practice;
    }

    public void setPractice(int practice) {
        this.practice = practice;
    }

    public int getJobwanted() {
        return jobwanted;
    }

    public void setJobwanted(int jobwanted) {
        this.jobwanted = jobwanted;
    }

    public int getEconomics() {
        return economics;
    }

    public void setEconomics(int economics) {
        this.economics = economics;
    }

    public int getLiterature() {
        return literature;
    }

    public void setLiterature(int literature) {
        this.literature = literature;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getEngineering() {
        return engineering;
    }

    public void setEngineering(int engineering) {
        this.engineering = engineering;
    }

    public int getMedicine() {
        return medicine;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }

    public int getBusiness() {
        return business;
    }

    public void setBusiness(int business) {
        this.business = business;
    }

    public int getApplyforresearch() {
        return applyforresearch;
    }

    public void setApplyforresearch(int applyforresearch) {
        this.applyforresearch = applyforresearch;
    }

    public int getExamination() {
        return examination;
    }

    public void setExamination(int examination) {
        this.examination = examination;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public int getUsa() {
        return usa;
    }

    public void setUsa(int usa) {
        this.usa = usa;
    }

    public int getBritain() {
        return britain;
    }

    public void setBritain(int britain) {
        this.britain = britain;
    }

    public int getAustralia() {
        return australia;
    }

    public void setAustralia(int australia) {
        this.australia = australia;
    }

    public int getHongkong() {
        return hongkong;
    }

    public void setHongkong(int hongkong) {
        this.hongkong = hongkong;
    }

    public int getSingapore() {
        return singapore;
    }

    public void setSingapore(int singapore) {
        this.singapore = singapore;
    }
}
