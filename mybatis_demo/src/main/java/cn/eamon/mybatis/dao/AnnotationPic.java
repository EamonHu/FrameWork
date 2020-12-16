package cn.eamon.mybatis.dao;

import cn.eamon.mybatis.po.Note;
import cn.eamon.mybatis.po.Pic;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/15 13:44
 */
public interface AnnotationPic {
    /**
     * 根据笔记id查询图片详情列表
     * @param noteId 笔记id
     * @return 图片详情列表
     */
    @Select("select pic_id picId, note_id noteId, pic_info picInfo from pic where note_id = #{noteId}")
    List<Pic> selectByNoteId(Integer noteId);

    // select * from pic where 1=1 and note_id in (1,2,3);
    @Select({
            "<script>",
            "select pic_id picId, note_id noteId, pic_info picInfo from pic",
            "<where>",
                "<foreach collection='list' item='Note' open='and note_id in (' close=') ' separator=','>",
                "#{Note.noteId, jdbcType=INTEGER}",
                "</foreach>",
            "</where>",
            "</script>"
    })
    List<Pic> selectByNoteIds(List<Note> notes);

}
