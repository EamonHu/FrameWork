import cn.eamon.mybatis.dao.AnnotationNote;
import cn.eamon.mybatis.dao.AnnotationPic;
import cn.eamon.mybatis.po.*;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/15 13:49
 */
public class MultipleQueryTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void testSelectByStuId1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AnnotationNote mapper = sqlSession.getMapper(AnnotationNote.class);
        List<Note> notePics = mapper.selectByStuId1(1);
        for (Note notePic : notePics) {
            System.out.println(notePic);
        }
    }

    @Test
    public void testSelectByStuId(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AnnotationNote mapper = sqlSession.getMapper(AnnotationNote.class);
        List<NotePic> notePics = mapper.selectByStuId(1);
        for (NotePic notePic : notePics) {
            System.out.println(JSON.toJSONString(notePic));
        }
    }

    @Test
    public void testSelectByNoteId(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AnnotationPic mapper = sqlSession.getMapper(AnnotationPic.class);
        List<Pic> pics = mapper.selectByNoteId(1);
        for (Pic pic : pics) {
            System.out.println(pic);
        }
    }
}
