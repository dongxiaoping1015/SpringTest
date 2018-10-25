package aspectxml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {

    public void before() {
        System.out.println("执行前置通知方法");
    }

    public void before(JoinPoint jp) {
        System.out.println("执行前置通知方法 jp = " + jp);
    }

    public void myAfter(Object result) {
        System.out.println("执行后置通知方法 result=" + result);
    }

    public Object MyAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("执行环绕方法-之前");
        Object result = proceedingJoinPoint.proceed();
        System.out.println("执行环绕方法-之后");

        return result;
    }

    public void myAfterThrowing() {
        System.out.println("执行异常通知方法");
    }

    public void finalAdvice() {
        System.out.println("最终通知");
    }

    public void doThirdPointCut() {

    }
}

