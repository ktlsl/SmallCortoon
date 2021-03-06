package xi.lsl.code.app.main.home;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

import java.util.List;

import rx.functions.Action0;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;
import xi.lsl.code.lib.utils.entity.Book;
import xi.lsl.code.lib.utils.entity.Result;

/**
 * Description:
 * Author   :lishoulin
 * Date     :2017/2/24.
 */

public class SubBookPresenter implements SubBookContract.Presenter {

    private SubBookContract.View view;

    private SubBookModel subBookModel;

    private CompositeSubscription compositeSubscription;


    public SubBookPresenter(SubBookModel subBookModel, SubBookContract.View view) {
        this.view = view;
        this.subBookModel = subBookModel;
    }

    @Override
    public void loadSubBooks() {
        compositeSubscription.add(subBookModel.getSubBooks().subscribe(new Action1<Result<Book>>() {
            @Override
            public void call(Result<Book> bookEntity) {
                if (bookEntity != null && bookEntity.getReturn().getT().size() > 0) {
                    Gson gson = new Gson();
                    JsonArray jsonArray = gson.toJsonTree(bookEntity.getReturn().getT()).getAsJsonArray();
                    List<Book> books = gson.fromJson(jsonArray.toString(), new TypeToken<List<Book>>() {
                    }.getType());

                    view.showBooks(books);
                } else {
                    view.showNoBooks();
                }
            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                view.faild(throwable.getMessage());
                view.dissloading();
            }
        }, new Action0() {
            @Override
            public void call() {
                view.dissloading();
            }
        }));
    }

    @Override
    public void subBook(int bookId, boolean isSub) {

    }

    @Override
    public void subscribe() {
        compositeSubscription = new CompositeSubscription();
    }

    @Override
    public void unsubscribe() {
        compositeSubscription.clear();
    }
}
