package com.nanfeng;

import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "dbook")
public class Book {

    private List<String> names;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
