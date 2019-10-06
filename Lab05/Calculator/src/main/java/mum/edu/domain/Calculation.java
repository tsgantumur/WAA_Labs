package mum.edu.domain;
import java.io.Serializable;

public class Calculation implements Serializable {
    private static final long serialVersionUID = 748392348L;

    private Integer add1 = 0;
    private Integer add2 = 0;
    private Integer mult1 = 0;
    private Integer mult2 = 0;
    private Integer sum = 0;
    private Integer mult = 0;

    public Integer getAdd1() {
        return add1;
    }
    public void setAdd1(Integer add1) {
        this.add1 = add1;
    }
    public Integer getAdd2() {
        return add2;
    }
    public void setAdd2(Integer add2) {
        this.add2 = add2;
    }
    public Integer getMult1() {
        return mult1;
    }
    public void setMult1(Integer mult1) {
        this.mult1 = mult1;
    }
    public Integer getMult2() {
        return mult2;
    }
    public void setMult2(Integer mult2) {
        this.mult2 = mult2;
    }
    public Integer getSum() {
        return sum;
    }
    public void setSum(Integer sum) {
        this.sum = sum;
    }
    public Integer getMult() {
        return mult;
    }
    public void setMult(Integer mult) {
        this.mult = mult;
    }

}