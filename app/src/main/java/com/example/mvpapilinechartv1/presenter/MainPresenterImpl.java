package com.example.mvpapilinechartv1.presenter;

import android.content.Context;
import android.util.Log;

import com.example.mvpapilinechartv1.interactor.MainInteractor;
import com.example.mvpapilinechartv1.interactor.MainInteractorImpl;
import com.example.mvpapilinechartv1.model.Model;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainPresenterImpl implements MainPresenter{

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

        Log.d("", "haloooo" );

        interactor.getMainInteractor(new MainInteractor.ListenerInteractor<Object>() {
            @Override
            public void onSuccess(Object response) {

                Log.d("aaaa", "aaaaa   " + response );

                try {
                    List<Model> dataJsonModel = new ArrayList<>();
                    JSONArray jsonArray = new JSONArray(new Gson().toJson(response));
                    Log.d("aaaa", "jsonArray   " + jsonArray );

                    for (int i=0; i<10; i++){
                        JSONObject jsonObject = (JSONObject) jsonArray.get(i);

                        String criticalChance = jsonObject.getString("critical_chance");
                        int duration = jsonObject.getInt("duration");
                        int moveId = jsonObject.getInt("move_id");
                        String name = jsonObject.getString("name");
                        int power = jsonObject.getInt("power");
                        String staminaLoss = jsonObject.getString("stamina_loss_scaler");
                        String type = jsonObject.getString("type");

                        Log.d("aaaa", "typeHOOOOO   " + jsonObject );
                        Log.d("aaaa", "kuat   " + staminaLoss );
                        Log.d("aaaa", "thor   " + power );

                        dataJsonModel.add(new Model(criticalChance, duration, moveId, name, power, staminaLoss, type));
                    }

                    Log.d("aaaa", "bbb   ");
                    Log.d("presenter", "isoook   " + dataJsonModel);
                    view.showLineChart(jsonArray);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(String message) {
                Log.d("presenter", "dataPresError" + message);
            }
        });
    }
}
