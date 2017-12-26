package com.bdqn.PoJo;

/**
 * Created by sony on 2017/11/25.
 */
public class HelloSpring {
    private String who;

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "who='" + who + '\'' +
                '}';
    }
    public void print(){
        System.out.println("Hello" + this.who);
    }
}
