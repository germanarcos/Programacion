package mypkg;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookHelper {

    Session session = null;

    public BookHelper() {
	this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List getBookTitles(int startCode, int endCode) {
	List<Libros> bookList = null;
	try {
	    Transaction tx = session.beginTransaction();
	    Query q = session.createQuery("from Libros as l where l.codigo between " + startCode + " and " + endCode);
	    bookList = (List<Libros>) q.list();
	} 
	catch (Exception e) {
	    e.printStackTrace();
	}
	return bookList;
    }

    public Libros getBookByCode(int bookCode) {
	Libros book = null;
	try {
	    Transaction tx = session.beginTransaction();
	    Query q = session.createQuery("from Libros as l where l.codigo = " + bookCode);
	    book = (Libros) q.uniqueResult();
	} 
	catch (Exception e) {
	    e.printStackTrace();
	}
	return book;
    }

    public List getLoansByCode(int bookCode) {
	List<Prestamos> loanList = null;
	try {
	    Transaction tx = session.beginTransaction();
	    Query q = session.createQuery("from Prestamos as p where p.id.codigoLibro = " + bookCode);
	    loanList = (List<Prestamos>) q.list();
	} 
	catch (Exception e) {
	    e.printStackTrace();
	}
	return loanList;
    }

}
