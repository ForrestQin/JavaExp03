package cn.edu.scut.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.scut.dao.BookDao;
import cn.edu.scut.model.Book;
import cn.edu.scut.service.BookService;

@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookDao bookDao;
    
    public String findBookById(int id)
    {
        return bookDao.findBookById(id);
    }
    
    public void saveBook(Book book)
    {
        bookDao.saveBook(book);
        
    }
}