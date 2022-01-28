package yiqixue.yiqixue.yantaoshi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//实例类
@Entity
public class question {
    @Id
    private int qid;
    @Column
    private int uid;//用户编号
    @Column
    private String title;//问题标题
    @Column
    private String text;//问题描述
    @Column
    private String img;//问题描述图片路径
    @Column
    private float value;//赏金
    @Column
    private String date;//日期
    @Column
    private String time;//时间
    @Column
    private int learning;//是否是学术区资料，取值0或1，默认0
    @Column
    private int higherschool;//是否是升学区资料，取值0或1，默认0
    @Column
    private int practice;//是否是实习区资料，取值0或1，默认0
    @Column
    private int jobwanted;//是否是求职区资料，取值0或1，默认0
    @Column
    private int economics;//经济学，取值0或1，默认0
    @Column
    private int literature;//文学，取值0或1，默认0
    @Column
    private int science;//理学，取值0或1，默认0
    @Column
    private int engineering;//工学，取值0或1，默认0
    @Column
    private int medicine;//医药学，取值0或1，默认0
    @Column
    private int business;//商学，取值0或1，默认0
    @Column
    private int applyforresearch;//申研（出国），取值0或1，默认0
    @Column
    private int examination;//考研，取值0或1，默认0
    @Column
    private int recommend;//保研，取值0或1，默认0
    @Column
    private int usa;//美国，取值0或1，默认0
    @Column
    private int britain;//英国，取值0或1，默认0
    @Column
    private int australia;//澳洲，取值0或1，默认0
    @Column
    private int hongkong;//香港，取值0或1，默认0
    @Column
    private int singapore;//新加坡，取值0或1，默认0
    public int getQid() {return qid;}
    public int getUid()
    {
        return uid;
    }
    public String getTitle()
    {
        return title;
    }
    public String getText()
    {
        return text;
    }
    public String getImg()
    {
        return img;
    }
    public String getDate()
    {
        return date;
    }
    public String getTime()
    {
        return time;
    }
    public float getValue()
    {
        return  value;
    }
    public int getLearning()
    {
        return learning;
    }
    public int getHigherschool()
    {
        return higherschool;
    }
    public int getPractice()
    {
        return practice;
    }
    public int getJobwanted()
    {
        return jobwanted;
    }
    public int getEconomics()
    {
        return economics;
    }
    public int getLiterature()
    {
        return literature;
    }
    public int getScience()
    {
        return science;
    }
    public int getEngineering()
    {
        return engineering;
    }
    public int getMedicine()
    {
        return medicine;
    }
    public int getBusiness()
    {
        return business;
    }
    public int getApplyforresearch()
    {
        return applyforresearch;
    }
    public int getExamination()
    {
        return examination;
    }
    public int getRecommend()
    {
        return recommend;
    }
    public int getUsa()
    {
        return usa;
    }
    public int getBritain()
    {
        return britain;
    }
    public int getAustralia()
    {
        return australia;
    }
    public int getHongkong()
    {
        return hongkong;
    }
    public int getSingapore()
    {
        return singapore;
    }
    public void setUid(int a)
    {
        uid=a;
    }
    public void setTitle(String a)
    {
        title=a;
    }
    public void setText(String a)
    {
        text=a;
    }
    public void setImg(String a)
    {
        img=a;
    }
    public void setDate(String a)
    {
        date=a;
    }
    public void setTime(String a)
    {
        time=a;
    }
    public void setValue(float a)
    {
        value=a;
    }
    public void setLearning(int a)
    {
        learning=a;
    }
    public void setHigherschool(int a)
    {
        higherschool=a;
    }
    public void setPractice(int a)
    {
        practice=a;
    }
    public void setJobwanted(int a)
    {
        jobwanted=a;
    }
    public void setEconomics(int a)
    {
        economics=a;
    }
    public void setLiterature(int a)
    {
        literature=a;
    }
    public void setScience(int a)
    {
        science=a;
    }
    public void setEngineering(int a)
    {
        engineering=a;
    }
    public void setMedicine(int a)
    {
        medicine=a;
    }
    public void setBusiness(int a)
    {
        business=a;
    }
    public void setApplyforresearch(int a)
    {
        applyforresearch=a;
    }
    public void setExamination(int a)
    {
        examination=a;
    }
    public void setRecommend(int a)
    {
        recommend=a;
    }
    public void setUsa(int a)
    {
        usa=a;
    }
    public void setBritain(int a)
    {
        britain=a;
    }
    public void setAustralia(int a)
    {
        australia=a;
    }
    public void setHongkong(int a)
    {
        hongkong=a;
    }
    public void setSingapore(int a)
    {
        singapore=a;
    }
}
