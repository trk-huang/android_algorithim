package com.zhiping.alibaba.androidalgorithimroad.algorithim.sort;

import com.zhiping.alibaba.androidalgorithimroad.MainActivity;

/**
 * Created by huangdaju on 17/7/26.
 */

public class ChoiceSort extends BubbleSort {


    public void choiceSort(int[] data, MainActivity activity) {
        int n = data.length;
        int min;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }

            if (min != i){
                exChange(data, i, min);
                activity.onCallback();
            }
        }
    }
}
