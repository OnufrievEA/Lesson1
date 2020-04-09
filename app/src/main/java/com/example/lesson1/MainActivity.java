package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getWeatherMessageBtn(View view) {
        TextView weatherTV = (TextView) findViewById(R.id.weatherTV);
        Spinner cities = (Spinner) findViewById(R.id.cities);

//        Прогнозируем погоду
        Random r = new Random();
        String weather;
        if (r.nextBoolean()) {
            weather = getResources().getString(R.string.good);
        } else {
            weather = getResources().getString(R.string.bad);
        }


        String city = (String) cities.getSelectedItem();
        StringBuilder weatherMessage = new StringBuilder();

        weatherMessage.append(city).append(": ").append(getResources().getString(R.string.app_name).toLowerCase()).append(" ").append(weather);
        weatherTV.setText(weatherMessage);
    }
}
