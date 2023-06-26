package com.demo.demo.classDemo.innerclass;

public class InnerClassDemo3 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                TrackingSlip(String s) {
                    id = s;
                }

                String getSlip() {
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("chenssy");
            String slip = ts.getSlip();
            System.out.println("getSlip===" + slip);
        }
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        InnerClassDemo3 parcel6 = new InnerClassDemo3();
        parcel6.track();
    }
}
