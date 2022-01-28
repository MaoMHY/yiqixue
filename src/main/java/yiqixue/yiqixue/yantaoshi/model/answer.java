package yiqixue.yiqixue.yantaoshi.model;
import javax.persistence.*;


//实例类
@Entity
public class answer {
    @Id
    private int aid;
    @Column
    private int uid;//回答问题的用户id
    @Column
    private int qid;//问题的id
    @Column
    private int recallaid;//回复评论的id
    @Column
    private int recalluid;//回复评论用户id
    @Column
    private String text;//回复内容
    @Column
    private String img;//回复图片所在路径
    @Column
    private int agree;//点赞
    @Column
    private int star;//收藏数量
    @Column
    private float tip;//赏金
    @Column
    private String date;//日期
    @Column
    private String time;//时间
    public int getAid(){return aid;}
    public int getUid()
    {
        return uid;
    }
    public int getQid()
    {
        return qid;
    }
    public int getRecallaid()
    {
        return recallaid;
    }
    public int getRecalluid()
    {
        return recalluid;
    }
    public String getText()
    {
        return text;
    }
    public String getImg()
    {
        return img;
    }
    public int getAgree()
    {
        return agree;
    }
    public int getStar()
    {
        return star;
    }
    public float getTip()
    {
        return tip;
    }
    public String getDate()
    {
        return date;
    }
    public String getTime()
    {
        return time;
    }
    public void setUid(int a)
    {
        uid=a;
    }
    public void setQid(int a)
    {
        qid=a;
    }
    public void setRecallaid(int a)
    {
        recallaid=a;
    }
    public void setRecalluid(int a)
    {
        recalluid=a;
    }
    public void setText(String a)
    {
        text=a;
    }
    public void setImg(String a)
    {
        img=a;
    }
    public void setAgree(int a)
    {
        agree=a;
    }
    public void setStar(int a)
    {
        star=a;
    }
    public void setTip(float a)
    {
        tip=a;
    }
    public void setDate(String a)
    {
        date=a;
    }
    public void setTime(String a)
    {
        time=a;
    }
}
