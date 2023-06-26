package com.demo.demo.classDemo.innerclass;

public class InnerClassDemo2 {
    public Destionation destionation(String str) {
        class PDestionation implements Destionation {
            private String label;

            private PDestionation(String whereTo) {
                label = whereTo;
            }

            public String readLabel() {
                return label;
            }
        }
        return new PDestionation(str);
    }

    public static void main(String[] args) {
        InnerClassDemo2 parcel5 = new InnerClassDemo2();
        Destionation d = parcel5.destionation("chenssy");
        System.out.println("d readLabel====" + d.readLabel());
    }
}
