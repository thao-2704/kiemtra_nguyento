package com.example.kiemtra_nguyento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText a;
    TextView ketqua;
    Button bt_check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();// ẩn thanh tiêu đề
        AddControl();
        AddEvent();
    }
    public void AddEvent(){
        bt_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Show_Answer();
            }
        });

    }
    public boolean check_Isprime(int n){ //Hàm kiểm tra số nguyên tố
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void AddControl(){
        a= (EditText) findViewById(R.id.nhap);
        ketqua= (TextView) findViewById(R.id.ket_qua);
        bt_check= (Button) findViewById(R.id.button);
    }
    public void Show_Answer(){
        int n= Integer.parseInt(a.getText().toString());
        if(check_Isprime(n)){
            ketqua.setText(n+ "  là số nguyên tố");
        }
        else{
            ketqua.setText(n+"  không là số nguyên tố");
        }
    }
}