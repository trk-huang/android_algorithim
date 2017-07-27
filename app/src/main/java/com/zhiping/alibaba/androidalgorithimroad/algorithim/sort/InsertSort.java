package com.zhiping.alibaba.androidalgorithimroad.algorithim.sort;

import com.zhiping.alibaba.androidalgorithimroad.MainActivity;

/**
 * Created by huangdaju on 17/7/27.
 */

public class InsertSort extends BubbleSort {

    public void insertSort(int[] data, MainActivity activity) {
        int n = data.length;
        int get;
        for (int i = 1; i < n; i++) {   //抓扑克牌
            get = data[i];  //右手抓到的牌

            for (int j = 0; j <= i - 1; j++) {      //拿在左手上的牌从0到i
                if (data[j] > get) {
                    exChange(data, i, j);
                    activity.onCallback();
                }
            }
        }
    }
}
