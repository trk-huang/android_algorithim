package com.zhiping.alibaba.androidalgorithimroad.algorithim.sort;

import android.app.Activity;

import com.zhiping.alibaba.androidalgorithimroad.MainActivity;
import com.zhiping.alibaba.androidalgorithimroad.R;

/**
 * Created by huangdaju on 17/7/25.
 */

public class BubbleSort {

    /**
     * 位置交换
     *
     * @param data
     * @param i
     * @param j
     */
    public void exChange(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;

    }

    /**
     * 冒泡排序
     *
     * @param data
     */
    public int[] sort(final int[] data, final MainActivity activity) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) { //比较两个数
                if (data[j] > data[j + 1]) {
                    exChange(data, j, j + 1);
                    activity.onCallback();
                }
            }
        }
        return data;
    }
}
