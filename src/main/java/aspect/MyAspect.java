package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

@Aspect
public class MyAspect {

    @Before("execution(* *..ISomeService.doFirst(..))")
    public void before() {
        System.out.println("执行前置通知方法");
    }

    @Before("execution(* *..ISomeService.doFirst(..))")
    public void before(JoinPoint jp) {
        System.out.println("执行前置通知方法 jp = " + jp);
    }

    @AfterReturning(value = "execution(* *..ISomeService.doSecond(..))", returning = "result")
    public void myAfter(Object result) {
        System.out.println("执行后置通知方法 result=" + result);
    }

    @Around("execution(* *..ISomeService.doFirst(..))")
    public Object MyAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("执行环绕方法-之前");
        Object result = proceedingJoinPoint.proceed();
        System.out.println("执行环绕方法-之后");

        return result;
    }

    @AfterThrowing("execution(* *..ISomeService.doThird(..))")
    public void myAfterThrowing() {
        System.out.println("执行异常通知方法");
    }

    @After("doThirdPointCut()")
    public void finalAdvice() {
        System.out.println("最终通知");
    }

    @Pointcut("execution(* *..ISomeService.doThird(..))")
    public void doThirdPointCut() {

    }
}

