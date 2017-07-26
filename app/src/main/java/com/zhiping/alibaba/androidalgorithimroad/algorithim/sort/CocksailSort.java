package com.zhiping.alibaba.androidalgorithimroad.algorithim.sort;

import com.zhiping.alibaba.androidalgorithimroad.MainActivity;

/**
 * Created by huangdaju on 17/7/25.
 */

public class CocksailSort extends BubbleSort {

    public void cocksailSort(final int[] data,  MainActivity activity) {
        int right = data.length - 1;
        int left = 0;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (data[i] > data[i + 1]) {
                    exChange(data, i, i + 1);
                    activity.onCallback();
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (data[i - 1] > data[i]) {
                    exChange(data, i - 1, i);
                    activity.onCallback();
                }
            }
            left++;
        }
    }
}
