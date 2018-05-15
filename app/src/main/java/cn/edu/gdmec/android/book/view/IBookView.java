package cn.edu.gdmec.android.book.view;

import cn.edu.gdmec.android.book.BookBean;

/**
 * Created by apple on 18/5/15.
 */

public interface IBookView {
    void showProgress();
    void hideProgress();
    void showBookData(BookBean bookBean);
    void showLoadFailMsg(Exception e);
}
