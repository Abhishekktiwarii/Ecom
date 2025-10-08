package com.example.Learn.Spring.Beans;

public class MyBean {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }


    @Override
    public String toString() {
        return "msg='" + msg + '\'' +
                '}';
    }
}
