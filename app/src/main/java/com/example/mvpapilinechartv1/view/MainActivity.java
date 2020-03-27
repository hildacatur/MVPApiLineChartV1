package com.example.mvpapilinechartv1.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

//import com.example.mvpapilinechartv1.R;
import com.example.mvpapilinechartv1.R;
import com.example.mvpapilinechartv1.model.Model;
import com.example.mvpapilinechartv1.presenter.MainPresenter;
import com.example.mvpapilinechartv1.presenter.MainPresenterImpl;
import com.example.mvpapilinechartv1.presenter.MainView;
import com.github.mikephil.charting.data.Entry;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenterImpl(this, this);
        mainPresenter.dataMainPresenter();
    }

    @Override
    public void showLineChart(Object jsonArray) {
        Log.d("", "isoooooo" + jsonArray);
    }


//    @Override
//    public void showLineChart() {
//
//        Log.d("", "haloo" + models);
////        Toast.makeText(this, "bisaaa", Toast.LENGTH_SHORT).show();
////        List<Entry> entries = new ArrayList<Entry>();
////        final ArrayList<String> change = new ArrayList<String>();
////        for (int i=0; i<models.size(); i++){
////            entries.add(new Entry(i, Math.round(models.get(i).getCriticalChance())));
////            change.add(models.get(i).getDuration());
////        }
//    }

//    @Override
//    public void showLineChart(JSONArray jsonArray) {
//        Log.d("", "jesoon" + jsonArray);
//    }
}
