package com.kotlin.aalibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * @author: jiangbin
 * @date: 2020/4/30
 */
public class MyName {
    public static String A = "A";
    public static String B = "A";
    public static String C = "A";
    public static String D = "A";
    public static String E = "A";
    public static String F = "A";

    public static String getA() {
        return A;
    }

    public static void setA(String a) {
        A = a;
    }

    public static String getB() {
        return B;
    }

    public static void setB(String b) {
        B = b;
    }

    public static String getC() {
        return C;
    }

    public static void setC(String c) {
        C = c;
    }

    public static String getD() {
        return D;
    }

    public static void setD(String d) {
        D = d;
    }

    public static String getE() {
        return E;
    }

    public static void setE(String e) {
        E = e;
    }

    public static String getF() {
        return F;
    }

    public static void setF(String f) {
        F = f;
    }

    public void hello(Context context) {
        Toast.makeText(context, "我是不是最疼爱的人", Toast.LENGTH_SHORT).show();
    }
}
