package cn.edu.scut.dao;

import cn.edu.scut.model.Book;

public interface BookDao {
    public String findBookById(int id);
    
    public void saveBook(Book book);
}
