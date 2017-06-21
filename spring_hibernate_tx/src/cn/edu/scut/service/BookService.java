package cn.edu.scut.service;

import cn.edu.scut.model.Book;

public interface BookService {
    public String findBookById(int id);
    public void saveBook(Book book);
}
