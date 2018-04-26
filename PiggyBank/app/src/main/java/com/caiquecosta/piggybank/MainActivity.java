package com.caiquecosta.piggybank;

import android.net.sip.SipAudioCall;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Initialize buttons as private variables
    private Button pennyButton;
    private Button nickelButton;
    private Button dimeButton;
    private Button quarterButton;
    private Button dollarButton;
    private Button negPennyButton;
    private Button negNickelButton;
    private Button negDimeButton;
    private Button negQuarterButton;
    private Button negDollarButton;
    private EditText totalText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create buttons
        pennyButton = (Button)findViewById(R.id.pennyButton);
        nickelButton = (Button)findViewById(R.id.nickelButton);
        dimeButton = (Button)findViewById(R.id.dimeButton);
        quarterButton = (Button)findViewById(R.id.quarterButton);
        dollarButton = (Button)findViewById(R.id.dollarButton);
        totalText = (EditText)findViewById(R.id.TotalAmountText);
        negPennyButton = (Button)findViewById(R.id.negPennyButton);
        negNickelButton = (Button)findViewById(R.id.negNickelButton);
        negDimeButton = (Button)findViewById(R.id.negDimeButton);
        negQuarterButton = (Button)findViewById(R.id.negQuarterButton);
        negDollarButton = (Button)findViewById(R.id.negDollarButton);


        // Add 1 cent when penny button is clicked
        View.OnClickListener pennyListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalClass.addPenny();
                String total = totalClass.getTotal();
                totalText.setText(total);
            }
        };

        // Subtracts 1 cent when -penny button is clicked
        View.OnClickListener negPennyListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalClass.subtractPenny();
                String total = totalClass.getTotal();
                totalText.setText(total);
            }
        };

        // Add 5 cent when nickel button is clicked
        View.OnClickListener nickelListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalClass.addNickel();
                String total = totalClass.getTotal();
                totalText.setText(total);
            }
        };

        // Subtract 5 cent when -nickel button is clicked
        View.OnClickListener negNickelListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalClass.subtractNickel();
                String total = totalClass.getTotal();
                totalText.setText(total);
            }
        };

        // Add 10 cents when nickel button is clicked
        View.OnClickListener dimeListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalClass.addDime();
                String total = totalClass.getTotal();
                totalText.setText(total);
            }
        };

        // Subtract 10 cents when -nickel button is clicked
        View.OnClickListener negDimeListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalClass.subtractDime();
                String total = totalClass.getTotal();
                totalText.setText(total);
            }
        };

        // Add a quarter when quarter button is clicked
        View.OnClickListener quarterListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalClass.addQuarter();
                String total = totalClass.getTotal();
                totalText.setText(total);
            }
        };

        // Subtract a quarter when -quarter button is clicked
        View.OnClickListener negQuarterListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalClass.subtractQuarter();
                String total = totalClass.getTotal();
                totalText.setText(total);
            }
        };

        // Add a dollar when dollar button is clicked
        View.OnClickListener dollarListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalClass.addDollar();
                String total = totalClass.getTotal();
                totalText.setText(total);
            }
        };

        // Subtract a dollar when -dollar button is clicked
        View.OnClickListener negDollarListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalClass.subttractDollar();
                String total = totalClass.getTotal();
                totalText.setText(total);
            }
        };

        // Add listeners to buttons
        pennyButton.setOnClickListener(pennyListener);
        nickelButton.setOnClickListener(nickelListener);
        dimeButton.setOnClickListener(dimeListener);
        quarterButton.setOnClickListener(quarterListener);
        dollarButton.setOnClickListener(dollarListener);
        negPennyButton.setOnClickListener(negPennyListener);
        negNickelButton.setOnClickListener(negNickelListener);
        negDimeButton.setOnClickListener(negDimeListener);
        negQuarterButton.setOnClickListener(negQuarterListener);
        negDollarButton.setOnClickListener(negDollarListener);

    }
}
