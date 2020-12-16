package cn.eamon.mybatis.po;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/15 11:24
 */
public class Note {
    private Integer noteId;

    private Integer stuId;

    private String subjectName;

    @Override
    public String toString() {
        return "Note{" +
                "noteId=" + noteId +
                ", stuId=" + stuId +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
