package cn.eamon.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/31 15:24
 */
public class BeforeLog implements MethodBeforeAdvice {

    /**
     *
     * @param method 要执行的目标对象的方法
     * @param objects 目标参数
     * @param o 目标对象
     * @throws Throwable 异常
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        assert o != null;
        System.out.println(o.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
