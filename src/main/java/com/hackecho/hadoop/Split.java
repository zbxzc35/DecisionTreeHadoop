package com.hackecho.hadoop;

import java.util.ArrayList;
import java.util.List;

public class Split implements Cloneable {
    public List<Integer> attr_index;
    public List<String> attr_value;
    double entropy;
    String classLabel;

    Split() {
        this.attr_index = new ArrayList<Integer>();
        this.attr_value = new ArrayList<String>();
    }

    Split(List<Integer> attr_index, List<String> attr_value) {
        this.attr_index = attr_index;
        this.attr_value = attr_value;
    }

    void add(Split obj) {
        this.add(obj);
    }
}
