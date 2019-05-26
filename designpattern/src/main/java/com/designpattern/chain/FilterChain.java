package com.designpattern.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * FilterChain
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();
    int index = 0;

    @Override
    public void doFilter(Request req, Response resp, FilterChain chain) {
        if (index == 0) {
            return;
        }
        Filter f = filters.get(index);
        index++;
        f.doFilter(req, resp, chain);
    }

    public static void main(String[] args) {

    }

}

/**
 * Filter
 */
interface Filter {
    void doFilter(Request req, Response resp, FilterChain chain);
}

class Request {
    String msg;
}

class Response {
    String msg;
}
