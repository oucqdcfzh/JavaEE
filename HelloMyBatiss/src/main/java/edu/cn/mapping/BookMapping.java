package edu.cn.mapping;

import edu.cn.pojo.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapping {
  //  @Select("select * from bookta where isbn=#{isbn}")
    public Book findBookByIsbn(String isbn);

    public List<Book> findAllBooks();
    public int update(@Param("isbn") String isbn, @Param("price") double price);
}
