package com.company;

import java.util.Collections;
import java.util.List;

public class AmazonStressServer {
    public static long maximumChannelQuality(List<Integer> packets, int channels) {
        if (packets.size() == channels) return packets.stream().reduce(0, (a,b) -> a+b);

        Collections.sort(packets);
        int endIdx = packets.size()-1;
        long maxQuality = 0;
        while (channels > 1) {
            maxQuality += packets.get(endIdx--);
            channels--;
        }

        int noElements = endIdx+1;
        if (noElements%2 == 0) {
            int ele1 = noElements/2;
            int ele2 = ele1-1;
            long avg = Math.round((packets.get(ele1)+packets.get(ele2))/2d);
            maxQuality += avg;
        } else {
            int ele1 = noElements/2;
            maxQuality += packets.get(ele1);
        }
        return maxQuality;
    }
}
