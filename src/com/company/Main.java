package com.company;

import com.company.model.STAPEL;

public class Main {

    public static void main(String[] args) {
        STAPEL<String> stab = new STAPEL<>();
        stab.push("Hallo");
        stab.push("Welt");

        System.out.println(stab.peek());
        stab.pop();
        System.out.println(stab.peek());
    }
}
