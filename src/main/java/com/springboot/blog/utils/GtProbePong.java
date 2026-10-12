package com.springboot.blog.utils;

import com.springboot.blog.utils.GtProbePing;

/**
 * Probe class: bounces a counter back to {@link GtProbePing}.
 */
public final class GtProbePong {

    private GtProbePong() {
    }

    /** Decrements {@code remaining} and hands the turn back to ping until it reaches zero. */
    public static int pong(int remaining) {
        if (remaining == 0) {
            return 0;
        }
        return GtProbePing.ping(remaining - 1) + 1;
    }
}
