package com.zhiping.alibaba.androidalgorithimroad.algorithim.sort;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by huangdaju on 17/7/25.
 */

public class BubbleView extends View {

    private int width, height;
    private Paint mPaint;
    private int[] data;
    private float[] mapY;
    private int gap;


    public BubbleView(Context context) {

        this(context, null);
    }

    public BubbleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
        setFocusable(false);
    }

    public BubbleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (data != null) {
            width = canvas.getWidth();
            height = canvas.getHeight();
            mPaint = new Paint();
            gap = width / data.length;
            mPaint.setStrokeWidth(gap);
            mPaint.setStyle(Paint.Style.FILL);
            mPaint.setColor(Color.RED);
            canvas.drawColor(Color.WHITE);
            exChangeView(canvas);
        }


    }

    private void exChangeView(Canvas canvas) {
        for (int i = 0; i < data.length; i++) {
            int startX = i * gap;
            float endY = data[i] * height / data.length;
            Log.d("exCha","exChangeView " + startX + " : "+ endY);
            canvas.drawLine(startX,height,startX, height - endY, mPaint);
        }
    }


}
