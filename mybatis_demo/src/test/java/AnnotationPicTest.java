import cn.eamon.mybatis.dao.AnnotationPic;
import cn.eamon.mybatis.po.Note;
import cn.eamon.mybatis.po.Pic;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/15 16:22
 */
public class AnnotationPicTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void testSelectByNoteIds(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AnnotationPic mapper = sqlSession.getMapper(AnnotationPic.class);
        List<Note> notes = new ArrayList<Note>();
        Note note1 = new Note();
        Note note2 = new Note();
        Note note3 = new Note();
        note1.setNoteId(1);
        note2.setNoteId(2);
        note3.setNoteId(3);
        notes.add(note1);
        notes.add(note2);
        notes.add(note3);
        List<Pic> pics = mapper.selectByNoteIds(notes);
        for (Pic pic : pics) {
            System.out.println(pic);
        }
    }
}
