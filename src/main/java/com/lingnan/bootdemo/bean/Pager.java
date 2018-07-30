package com.lingnan.bootdemo.bean;

import java.util.List;

public class Pager<T> {

    T param;

    private List<T> result;

    /**
     * 开始页数
     */
    private Integer start = 0;

    /**
     * 页内数量
     */
    private Integer length = 10;



    public Pager(T param) {
        this.param = param;
    }

    public Pager(T param, Integer start, Integer length) {
        this.param = param;
        this.start = start;
        this.length = length;
    }


    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public Integer getStart() {
        return (start - 1) * length;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
