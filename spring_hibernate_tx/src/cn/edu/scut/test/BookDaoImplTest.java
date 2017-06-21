package cn.edu.scut.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.scut.model.Book;
import cn.edu.scut.service.BookService;

public class BookDaoImplTest
{
    private ApplicationContext context=null;
    private BookService bookService=null;
    
    
    {
         context= new ClassPathXmlApplicationContext("applicationContext.xml");  
         bookService=context.getBean(BookService.class);
    }
    @Test
    public void test()
    {
        DataSource dataSource=(DataSource) context.getBean(DataSource.class);
        System.out.println(dataSource);
    }
    @Test
    public void test2()
    {
        String bookName=bookService.findBookById(1);
        System.out.println(bookName);
    }
    
    @Test
    public void test3()
    {
        bookService.saveBook(new Book(2,"201562651482", "Qin.Sir",
        		"2015 Electronic Commerce Class 2"));
    }
}
