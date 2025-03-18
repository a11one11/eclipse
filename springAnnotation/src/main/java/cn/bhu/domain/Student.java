package cn.bhu.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Student {
    @Value("${db.user}")
    private String sname;

    @Value("${JAVA_HOME}") // 注入系统环境变量
    private String sno;

    private Double score;

    @Value("#{'${db.favs}'.split(',')}")
    private List<String> favs;

    // Getter/Setter 方法
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public List<String> getFavs() {
        return favs;
    }

    public void setFavs(List<String> favs) {
        this.favs = favs;
    }

    @Override
    public String toString() {
        return "Student [sname=" + sname + ", sno=" + sno + ", score=" + score + ", favs=" + favs + "]";
    }
}