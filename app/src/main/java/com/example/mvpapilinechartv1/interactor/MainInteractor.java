package com.example.mvpapilinechartv1.interactor;

public interface MainInteractor {
    interface ListenerInteractor<T>{
        void onSuccess(Object response);
        void onError(String message);
    }

    void getMainInteractor(ListenerInteractor<Object> listenerInteractor);
}
