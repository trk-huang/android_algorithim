package com.zhiping.alibaba.androidalgorithimroad;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.zhiping.alibaba.androidalgorithimroad.algorithim.sort.BubbleSort;
import com.zhiping.alibaba.androidalgorithimroad.algorithim.sort.BubbleView;

public class MainActivity extends Activity implements OnTCallback {

    public int data[] = {10, 25,3, 5, 4,1, 2, 8, 10, 7, 9, 12,11,18,17,19,22,15,14,23,13,16,20,21,24};
    private BubbleView bv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bv = (BubbleView) findViewById(R.id.bv);
        sort();
    }

    private void sort(){
        final BubbleSort sort = new BubbleSort();
        new Thread(new Runnable() {
            @Override
            public void run() {
                sort.sort(data,MainActivity.this);
            }
        }).start();

        for (int i=0;i < data.length; i++) {
            Log.d("MainActivity", "sort: " + data[i]);
        }
    }

    @Override
    public void onCallback() {
        bv.setData(data);
        bv.postInvalidate();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

