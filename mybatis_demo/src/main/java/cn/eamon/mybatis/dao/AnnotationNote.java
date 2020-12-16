package cn.eamon.mybatis.dao;

import cn.eamon.mybatis.po.Note;
import cn.eamon.mybatis.po.NotePic;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/15 11:24
 */
public interface AnnotationNote {

    /**
     * 根据学生id查询笔记详情列表
     * @param stuId 学生id
     * @return 笔记详情列表
     */
    @Select("select * from note where stu_id=#{stuId}")
    @Results({
            @Result(column = "note_id", property = "noteId"),
            @Result(column = "subject_name", property = "subjectName"),
            @Result(column = "stu_id", property = "stuId"),
            @Result(column = "note_id", property = "picArr",
                many = @Many(select = "cn.eamon.mybatis.dao.AnnotationPic.selectByNoteId"))
    })
    List<NotePic> selectByStuId(Integer stuId);

    @Select("select * from note where stu_id=#{stuId}")
    @Results({
            @Result(column = "note_id", property = "noteId"),
            @Result(column = "subject_name", property = "subjectName"),
            @Result(column = "stu_id", property = "stuId")

    })
    List<Note> selectByStuId1(Integer stuId);
}
