package aop;

public class ISomeServiceImpl implements ISomeService {
    public void doFirst() {
        System.out.println("doFirst");
    }

    public String doSecond() {
        System.out.println("doSecond");
        return "lalala";
    }

    public void doThird() {
        System.out.println("doThird");
    }
}
