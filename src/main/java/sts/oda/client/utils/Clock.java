package sts.oda.client.utils;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class Clock extends java.time.Clock implements io.jsonwebtoken.Clock {
    private java.time.Clock clock;

    public Clock(java.time.Clock clock) {
        this.clock = clock;
    }

    public Clock() {
        clock = java.time.Clock.systemUTC();
    }

    public ZoneId getZone() {
        return clock.getZone();
    }

    public java.time.Clock withZone(ZoneId zone) {
        return java.time.Clock.system(clock.getZone());
    }

    public Instant instant() {
        return clock.instant();
    }

    public Date now() {
        return Date.from(clock.instant());
    }
}