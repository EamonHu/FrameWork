package cn.eamon.diy;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/31 16:08
 */
public class DiyPointCut {

    public void before() {
        System.out.println("方法执行前");
    }

    public void after(){
        System.out.println("方法执行后");
    }
}
