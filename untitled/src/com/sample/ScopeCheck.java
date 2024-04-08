package com.sample;

import com.sabhari.PUb;

public class ScopeCheck {

        public static void main(String[] args) {
            PUb obj = new PUb();
            PUb.d();
            System.out.println(obj.p);
        }
    }

