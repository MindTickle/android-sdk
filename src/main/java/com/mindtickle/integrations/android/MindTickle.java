package com.mindtickle.integrations.android;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import static android.R.attr.key;

/**
 * Created by himanshugupta on 14/10/16.
 */

public class MindTickle {

    private static String _domain;
    private static String _secret_key;
    private static boolean _is_mindtickle_initialized = false;

    public static void initialize(String domain, String secret_key) {
        _domain = domain;
        _secret_key = secret_key;
        _is_mindtickle_initialized = true;
    }

    public static String getJWTToken(){
        String compactJws = Jwts.builder()
                .setSubject("Joe")
                .signWith(SignatureAlgorithm.HS512, _secret_key)
                .compact();
        return getJWTToken();
    }
}
