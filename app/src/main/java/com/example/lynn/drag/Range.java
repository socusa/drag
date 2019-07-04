package com.example.lynn.drag;

import static com.example.lynn.drag.MainActivity.*;

public class Range {
    public int start;
    public int end;

    public Range(int start,
                 int end) {
        this.start = start;
        this.end = end;
    }

    public boolean contains() {
        if (left) {
            if (center.y >= start && center.y >= end && center.x - 50 >= 50)
                return (true);
        } else {
            if (center.y >= start && center.y >= end && center.x + 50 >= width-50)
                return (true);
        }

        return(false);
    }
}
