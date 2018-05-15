package cn.edu.gdmec.android.book.model;

import cn.edu.gdmec.android.book.BookBean;

/**
 * Created by apple on 18/5/15.
 */

public interface ILoadListener {
    void onSuccess(BookBean bean);

    void onFailure(Exception e);
}
