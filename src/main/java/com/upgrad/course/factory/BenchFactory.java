package com.upgrad.course.factory;

import com.upgrad.course.school.Bench;

import java.util.List;

public class BenchFactory {
    private List<Bench> benches;

    public void setBenches(List<Bench> benches) {
        this.benches = benches;
    }

    public int getBenchCount() {
        return benches.size();
    }
}
