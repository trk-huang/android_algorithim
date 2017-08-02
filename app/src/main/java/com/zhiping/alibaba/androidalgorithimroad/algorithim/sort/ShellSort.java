package com.zhiping.alibaba.androidalgorithimroad.algorithim.sort;

import com.zhiping.alibaba.androidalgorithimroad.MainActivity;

/**
 * Created by huangdaju on 17/8/2.
 */

public class ShellSort extends BubbleSort {

    public void shellSort(int[] data, MainActivity mainActivity) {
        int n = data.length;
        int gap = n;
        while (gap >= 1) {
            gap = gap / 2;
            int get;
            for (int i = 1; i < n; i += gap) {
                get = data[i];
                for (int j = 0; j <= i - 1; j++) {
                    if (data[j] > get) {
                        exChange(data, i, j);
                        mainActivity.onCallback();
                    }
                }
            }
        }
    }
}
