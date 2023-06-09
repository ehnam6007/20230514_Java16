package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class ProductActivity extends AppCompatActivity {

    TextView result_text;
    Button result_button;
    GridView gridView;

    //상품명, 이미지, 가격, 수량
    String pdt_name[] = {"사과 5EA","체리 200G","코코넛 1EA","오렌지 7EA","배 1EA","딸기 300G"};
    int pdt_img[] = {R.drawable.apple,R.drawable.cherry,R.drawable.coconut,
            R.drawable.orange, R.drawable.pears,R.drawable.strawberry };

    int pdt_price[] = {5000,8000,3500,6000,4000,12000};
    int pdt_count[]={0,0,0,0,0,0};
    static int total_price=0;   //유일성을 확보하기위해 static으로 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        //화면과 변수를 연결
        result_text = findViewById(R.id.result_text);
        result_button = findViewById(R.id.result_button);
        gridView = findViewById(R.id.grid_view);

        //버튼 클릭 기능 추가
        result_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //PG사와 연결해서 결제진행하는 페이지로 이동
                Toast.makeText(getApplicationContext(),total_price+"원 결제 완료"
                        ,Toast.LENGTH_LONG).show();

            }
        });
    }

}
