package cn.edu.scut.dao.impl;

import javax.sql.DataSource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.edu.scut.dao.BookDao;
import cn.edu.scut.model.Book;

@Repository
public class BookDaoImpl implements BookDao
{
    @Autowired
    private SessionFactory sessionFactory;
    
    //获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
    @Autowired
	private DataSource ds;
	public void setDs(DataSource ds)
	{
		this.ds = ds;
	}
    public String findBookById(int id)
    {
        String hql="SELECT name from Book where id=?";
        Query query=getSession().createQuery(hql).setInteger(0, id);
        String str= query.uniqueResult().toString();
        return str;
    }
    public void saveBook(Book book)
    {
//        getSession().save(book);  //先注释，测试事务
		JdbcTemplate jt = new JdbcTemplate(ds);
		
		jt.update("insert into book1(id,sid, name, sclass)"
			+ " values( ?, ?, ?, ?)"
			, book.getId(),book.getSid(),book.getName(),book.getSclass());
//		// 两次插入的数据违反唯一键约束
		jt.update("insert into book1(id,sid, name, sclass)"
				+ " values( ?, ?, ?, ?)"
				, book.getId(),book.getSid(),book.getName(),book.getSclass());
 		// 如果没有事务控制，则第一条记录可以被插入
		// 如果增加事务控制，将发现第一条记录也插不进去。
    }
}
