package stock.beans;

public class Stock {
    private Integer sid;
    private String sname;
    private int count;

    public Stock() {
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", count=" + count +
                '}';
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Stock(Integer sid, String sname, int count) {

        this.sid = sid;
        this.sname = sname;
        this.count = count;
    }
}
