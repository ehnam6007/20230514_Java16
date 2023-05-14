package com.example.mobileapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProductAdapter extends BaseAdapter {
    //row_item을 배열을 통해서 여러개 배치
    //상품명, 상품가격, 상품이미지, 상품개수
    String[] pdt_name;
    int[] pdt_price;
    int[] pdt_image;
    int[] pdt_count;

    //어댑터 설정
    Context context;
    LayoutInflater inflator;

    //생성자를 통해서 배열의 값을 받아온다.
    public ProductAdapter(Context context, String[] pdt_name,
                          int[] pdt_price, int[] pdt_image, int[] pdt_count){
        this.context = context;
        this.pdt_name = pdt_name;
        this.pdt_price = pdt_price;
        this.pdt_image = pdt_image;
        this.pdt_count = pdt_count;
    }
    public int getCount() {
        // 총 갯수가 몇개냐?
        return pdt_name.length;
    }
    public Object getItem(int i) {
        return null;
    }
    public long getItemId(int i) {
        return 0;
    }
   //각각의 아이템을 보여주기
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(inflator == null){
            inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(view == null){
            view = inflator.inflate(R.layout.row_item,null);
        }

        //자바변수와 화면을 연결
        ImageView row_image = view.findViewById(R.id.pdt_image);
        TextView row_name = view.findViewById(R.id.row_name);
        TextView row_price = view.findViewById(R.id.row_price);
        TextView row_count = view.findViewById(R.id.row_count);
        Button plus_button = view.findViewById(R.id.button);
        Button minus_button = view.findViewById(R.id.button2);

        // 텍스트에 변수값을 반영
        row_image.setImageResource(pdt_image[i]);
        row_name.setText(pdt_name);
        row_price.setText(pdt_price);
        row_count.setText(pdt_count);

        //+ 버튼 기능 추가
        plus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        })
        return null;
    }   //BaseAdapter : 추상클래스,


}
