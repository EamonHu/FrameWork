package cn.eamon.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/31 16:16
 */
@Aspect
public class AnnotationPointcut {
    @Before("execution(* cn.eamon.service.impl.*.*(..))")
    public void before() {
        System.out.println("注解方法执行前");
    }

    @After("execution(* cn.eamon.service.impl.*.*(..))")
    public void after() {
        System.out.println("注解方法执行后");
    }

    @Around("execution(* cn.eamon.service.impl.*.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        // 获得签名
        Signature signature = jp.getSignature();
        System.out.println(signature);
        // 执行方法
        Object proceed = jp.proceed();

        System.out.println("环绕后");
        System.out.println(proceed);

    }

}
