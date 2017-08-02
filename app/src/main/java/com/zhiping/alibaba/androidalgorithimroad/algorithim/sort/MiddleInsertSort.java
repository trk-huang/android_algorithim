package com.zhiping.alibaba.androidalgorithimroad.algorithim.sort;

import com.zhiping.alibaba.androidalgorithimroad.MainActivity;

/**
 * Created by huangdaju on 17/8/2.
 */

public class MiddleInsertSort extends BubbleSort {

    public void middleInsertSort(int[] datas, MainActivity mainActivity) {
        int n = datas.length;
        int get;
        int left = 0, right = 0, j;

        for (int i = 0; i < datas.length; i++) {
            get = datas[i];
            left = 0;
            right = i - 1;
            while (left <= right) {
                int middle = (left + right) / 2;
                if (datas[middle] > get) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }

            for (j = i - 1; j >= left; j--) {
                {
                    datas[j + 1] = datas[j];
                }
                datas[left] = get;
                mainActivity.onCallback();
            }
        }
    }
}
