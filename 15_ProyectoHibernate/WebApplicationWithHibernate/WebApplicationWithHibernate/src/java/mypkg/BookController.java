package mypkg;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@Named(value = "bookController")
@SessionScoped
public class BookController implements Serializable {

    int startCode;
    int endCode;
    DataModel bookTitles;
    BookHelper helper;
    private int recordCount = 1000;
    private int pageSize = 10;

    private Libros current;
    private int selectedItemIndex;

    // Methods to create the BookController instance and retrieve books:
    
    public BookController() {
	helper = new BookHelper();
	startCode = 1;
	endCode = 10;
    }

    public BookController(int startCode, int endCode) {
	helper = new BookHelper();
	this.startCode = startCode;
	this.endCode = endCode;
    }

    public Libros getSelected() {
	if (current == null) {
	    current = new Libros();
	    selectedItemIndex = -1;
	}
	return current;
    }

    public DataModel getBookTitles() {
	if (bookTitles == null) {
	    bookTitles = new ListDataModel(helper.getBookTitles(startCode, endCode));
	}
	return bookTitles;
    }
    
    void recreateModel() {
	bookTitles = null;
    }
    
    // Methods to display the table and navigate the pages:
    
    public boolean isHasNextPage() {
        if (endCode + pageSize <= recordCount) {
            return true;
        }
        return false;
    }

    public boolean isHasPreviousPage() {
        if (startCode - pageSize > 0) {
            return true;
        }
        return false;
    }

    public String next() {
        startCode = endCode + 1;
        endCode = endCode + pageSize;
        recreateModel();
        return "index";
    }

    public String previous() {
        startCode = startCode - pageSize;
        endCode = endCode - pageSize;
        recreateModel();
        return "index";
    }

    public int getPageSize() {
        return pageSize;
    }

    public String prepareView() {
        current = (Libros) getBookTitles().getRowData();
        return "browse";
    }
    
    public String prepareList() {
        recreateModel();
        return "index";
    }
    
}
