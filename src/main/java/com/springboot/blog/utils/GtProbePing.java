package com.springboot.blog.utils;

import com.springboot.blog.utils.GtProbePong;

/**
 * Probe class: bounces a counter to {@link GtProbePong}.
 */
public final class GtProbePing {

    private GtProbePing() {
    }

    /** Decrements {@code remaining} and hands the turn over to pong until it reaches zero. */
    public static int ping(int remaining) {
        if (remaining == 0) {
            return 0;
        }
        return GtProbePong.pong(remaining - 1) + 1;
    }
}
