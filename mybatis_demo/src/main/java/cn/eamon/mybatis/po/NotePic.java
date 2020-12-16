package cn.eamon.mybatis.po;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/15 11:27
 */
public class NotePic extends Note{
    private List<Pic> picArr;

    @Override
    public String toString() {
        return "NotePic{" +
                "picArr=" + picArr +
                '}';
    }

    public List<Pic> getPicArr() {
        return picArr;
    }

    public void setPicArr(List<Pic> picArr) {
        this.picArr = picArr;
    }
}
