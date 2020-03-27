package com.example.mvpapilinechartv1.interactor;

import android.util.Log;

import com.example.mvpapilinechartv1.network.Endpoint;
import com.example.mvpapilinechartv1.network.Network;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainInteractorImpl implements MainInteractor{

    Endpoint endpoint;

    @Override
    public void getMainInteractor(final ListenerInteractor<Object> listenerInteractor) {

        endpoint = Network.getRetrofit().create(Endpoint.class);
        Call<Object> call = endpoint.getEndPoint("pokemon-go1.p.rapidapi.com", "718e06a47dmshbd955be863f3b8dp1bd68fjsnc831a3a7d438");
        Log.d("responCall", "" + call );
        call.enqueue(new Callback<Object>() {

            @Override
            public void onResponse(Call<Object> call, Response<Object> responses) {

                Log.d("responSukses", "" + responses );

                Object obj = responses.body();
                if (responses.isSuccessful()){
                    listenerInteractor.onSuccess(obj);
                    Log.d("responSukses", "yeay" + obj );
                } else {
                    Log.d("onResponErorr", "nay" + obj );
                }
            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                Log.d("onFailure", "" + t );
            }
        });
    }
}
