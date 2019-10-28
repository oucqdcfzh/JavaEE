package edu.cn;

import edu.cn.mapping.BookMapping;
import edu.cn.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String resource = "config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                                               .build(inputStream);

//        Configuration configuration = sqlSessionFactory.getConfiguration();
//        configuration.addMapper(BookMapping.class);
        
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        try{
            BookMapping bookMapping = sqlSession.getMapper(BookMapping.class);
           Book book = bookMapping.findBookByIsbn("9787214068828");
            bookMapping.update("9787214068828",30);
            System.out.println(book);
        }finally {
            sqlSession.close();
        }


   //     List<Book> list = bookMapping.findAllBooks();

    //    System.out.println(list.size());
    }
}
