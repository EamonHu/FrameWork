package cn.eamon.mybatis.po;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/15 11:28
 */
public class Pic {
    private Integer picId;

    private Integer noteId;

    private String picInfo;

    @Override
    public String toString() {
        return "Pic{" +
                "picId=" + picId +
                ", noteId=" + noteId +
                ", picInfo='" + picInfo + '\'' +
                '}';
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public String getPicInfo() {
        return picInfo;
    }

    public void setPicInfo(String picInfo) {
        this.picInfo = picInfo;
    }
}
