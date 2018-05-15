package cn.edu.gdmec.android.book.presenter;

import cn.edu.gdmec.android.book.BookBean;
import cn.edu.gdmec.android.book.model.BookModel;
import cn.edu.gdmec.android.book.model.IBookModel;
import cn.edu.gdmec.android.book.model.ILoadListener;
import cn.edu.gdmec.android.book.view.IBookView;

/**
 * Created by apple on 18/5/15.
 */

public class BookPresenter implements IBookPresenter, ILoadListener {

    private String url = "https://api.douban.com/v2/book/search?q=%E9%87%91%E7%93%B6%E6%A2%85";

    private IBookView iBookView;
    private IBookModel iBookModel;

    public BookPresenter(IBookView iBookView){
        this.iBookView = iBookView;
        this.iBookModel = new BookModel();
    }

    @Override
    public void loadBook() {
        iBookView.showProgress();
        iBookModel.loadBook(url,this);
    }

    @Override
    public void onSuccess(BookBean bean) {
        iBookView.hideProgress();
        iBookView.showBookData(bean);
    }

    @Override
    public void onFailure(Exception e) {
        iBookView.hideProgress();
        iBookView.showLoadFailMsg(e);
    }
}