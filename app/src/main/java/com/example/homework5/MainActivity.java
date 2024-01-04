package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.homework5.entity.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView output = findViewById(R.id.output);

        Adult adult = new Adult(35, 12);
        Adult children = new Children(35, 14, 0.5F);
        Adult senior = new Senior(35, 10, 0.45F);

        float adultTicketPrice = adult.ticketPriceAll();
        float childrenTicketPrice = children.ticketPriceAll();
        float seniorTicketPrice = senior.ticketPriceAll();
        float totalCost = adultTicketPrice + childrenTicketPrice + seniorTicketPrice;


        Log.v("mylog", "adult = "+String.valueOf(adultTicketPrice));
        Log.v("mylog", "child = "+ String.valueOf(childrenTicketPrice));
        Log.v("mylog", "senior = "+ String.valueOf(seniorTicketPrice));

        output.setText("Общая стоимость: " + totalCost + " монет");
    }
}