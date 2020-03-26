package com.example.mvpapilinechartv1.presenter;

import android.content.Context;
import android.util.Log;

import com.example.mvpapilinechartv1.interactor.MainInteractor;
import com.example.mvpapilinechartv1.interactor.MainInteractorImpl;

public class MainPresenterImpl extends MainInteractorImpl implements MainPresenter{

    MainInteractor interactor;
    MainView view;
    Context context;

    public MainPresenterImpl(MainView view, Context context){
        this.view = view;
        this.context = context;
        interactor = new MainInteractorImpl();
    }

    @Override
    public void dataMainPresenter() {

        Log.d("", "halo" );

        interactor.getMainInteractor(new ListenerInteractor<Object>() {
            @Override
            public void onSuccess(Object response) {
                Log.d("presenter", "dataPres" + response);
            }

            @Override
            public void onError(String message) {
                Log.d("presenter", "dataPresError" + message);
            }
        });
    }
}
