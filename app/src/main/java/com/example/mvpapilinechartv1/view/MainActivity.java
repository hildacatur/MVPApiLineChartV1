package com.example.mvpapilinechartv1.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//import com.example.mvpapilinechartv1.R;
import com.example.mvpapilinechartv1.R;
import com.example.mvpapilinechartv1.presenter.MainPresenter;
import com.example.mvpapilinechartv1.presenter.MainPresenterImpl;
import com.example.mvpapilinechartv1.presenter.MainView;

public class MainActivity extends AppCompatActivity implements MainView {

    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenterImpl(this, this);
        mainPresenter.dataMainPresenter();
    }
}
