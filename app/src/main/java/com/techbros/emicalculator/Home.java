package com.techbros.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    Button startcalc;
    EditText amount, percent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        startcalc = findViewById(R.id.calc);

        ListView l;
        ArrayList<String> listItems=new ArrayList<String>();

        l = findViewById(R.id.lv);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                listItems);

        startcalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listItems.clear();
                amount = findViewById(R.id.amount);
                percent = findViewById(R.id.intrest);
                String filler;
                String filler2;
                filler2 = percent.getText().toString();
                filler = amount.getText().toString();
                int p =Integer.parseInt(filler);
                int r = Integer.parseInt(filler2);
                //EMI = p × r × (1 + r)n/((1 + r)n - 1)
                listItems.add("3 Months"+((p * r * (1 + r)*3)/(((1 + r)*3) - 1)));
//                listItems.add("6 Months"+((numamount*numpercent*(1+numpercent)*6)/((1+numpercent)*6-1)));
//                listItems.add("9 Months"+((numamount*numpercent*(1+numpercent)*9)/((1+numpercent)*9-1)));
//                listItems.add("12 Months"+((numamount*numpercent*(1+numpercent)*12)/((1+numpercent)*12-1)));
//                listItems.add("18 Months"+((numamount*numpercent*(1+numpercent)*18)/((1+numpercent)*18-1)));


                l.setAdapter(arr);

//                i1.setText(Integer.toString((numamount+(numamount*numpercent/100))/3) + " per month");
//                i2.setText(Integer.toString((numamount+(numamount*numpercent/100))/6)+ " per month");
//                i3.setText(Integer.toString((numamount+(numamount*numpercent/100))/9)+ " per month");
//                i4.setText(Integer.toString((numamount+(numamount*numpercent/100))/12)+" per month");
//                i5.setText(Integer.toString((numamount+(numamount*numpercent/100))/18)+" per month");

            }
        });
    }
}