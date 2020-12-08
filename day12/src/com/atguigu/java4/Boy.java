package com.atguigu.java4;

/**
 * @author
 * @create 2020-11-09 12:26
 */
public class Boy {

    private Girl girl;

    public Boy() {
    }

    public Boy(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "girl=" + girl +
                '}';
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    public Girl getGirl() {

        return girl;
    }
}
