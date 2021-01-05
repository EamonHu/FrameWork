package cn.eamon.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/31 15:29
 */
public class AfterLog implements AfterReturningAdvice {
    /**
     * @param returnValue 返回值
     * @param method
     * @param args
     * @param target
     * @throws Throwable
     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + " 返回结果为：" + returnValue);
    }
}
