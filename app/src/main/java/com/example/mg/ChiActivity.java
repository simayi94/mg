package com.example.mg;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;

import java.util.ArrayList;

public class ChiActivity extends AppCompatActivity {

    MyAdapter adapter;
    ArrayList<UserInfo> arr = new ArrayList<>();

    ListView mainLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi);

        mainLv = (ListView) findViewById(R.id.mainLv);
        adapter = new MyAdapter(this);
        mainLv.setAdapter(adapter);

        init();
    }

    private void init(){
        arr.add(new UserInfo("썬더치킨","051-581-9285",R.drawable.sunde));
        arr.add(new UserInfo("굽네치킨","051-513-9992",R.drawable.gubne));
        arr.add(new UserInfo("네네치킨","051-518-4492",R.drawable.nene));
        arr.add(new UserInfo("처갓집양념치킨","051-515-9996",R.drawable.cogat));
        arr.add(new UserInfo("멕시카나치킨","051-516-1191",R.drawable.mexi));
        arr.add(new UserInfo("교촌치킨","051-581-9968",R.drawable.gyo));
        adapter.notifyDataSetChanged();
    }

    public class RowDataViewHolder {
        public TextView nameSunHolder;
        public TextView phoneSunHolder;
        public ImageView sunHoler;
    }

    class MyAdapter extends ArrayAdapter {
        LayoutInflater lnf;

        public MyAdapter(Activity context) {
            super(context, R.layout.sunder, arr);
            lnf = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return arr.size();
        }

        @Override
        public Object getItem(int position) {
            return arr.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            RowDataViewHolder viewHolder;
            if (convertView == null) {
                convertView = lnf.inflate(R.layout.sunder, parent, false);
                viewHolder = new RowDataViewHolder();
                viewHolder.nameSunHolder = (TextView) convertView.findViewById(R.id.nameSun);
                viewHolder.phoneSunHolder = (TextView) convertView.findViewById(R.id.phoneSun);
                viewHolder.sunHoler = (ImageView) convertView.findViewById(R.id.sun);

                convertView.setTag(viewHolder);
            } else {
                viewHolder = (RowDataViewHolder) convertView.getTag();
            }

            viewHolder.nameSunHolder.setText(arr.get(position).name);
            viewHolder.phoneSunHolder.setText(arr.get(position).phone);
            viewHolder.sunHoler.setImageResource(arr.get(position).resId);

            return convertView;
        }
    }
    public void home1 (View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mythunder.co.kr/board/index.php?board=map_01&type=view&sca=all&idx=198"));

        startActivity(intent);
    }
    public void menu1 (View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mythunder.co.kr/board/index.php?board=menu_01&sca=2"));

        startActivity(intent);
    }
    public void tel1 (View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:051-581-9285"));

        startActivity(intent);
    }
}