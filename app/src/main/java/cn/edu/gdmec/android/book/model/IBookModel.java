package cn.edu.gdmec.android.book.model;

/**
 * Created by apple on 18/5/15.
 */

public interface IBookModel {
    void loadBook(String url, ILoadListener loadListener);
}
