package com.patterns.example.ch01;

import java.math.BigInteger;

/**
 * @author wangrui
 * @date 2020/5/21.
 * @desc
 */
public class Test2 {
    public static void main(String[] args) {

        BigInteger encrypt = encrypt(2122222222L);
        System.out.println(encrypt.toString());
        BigInteger decrypt = decrypt(encrypt.intValue());
        System.out.println(decrypt.toString());

    }

    /**
     * 2147483647
     * 1111111111111111111111111111111
     * 1001110100001111000100101111100
     * 1110111011100110001111110011111
     * @param roomId
     * @return
     */
    public static BigInteger encrypt(long roomId) {
        BigInteger result = BigInteger.valueOf(BigInteger.valueOf(roomId).multiply(BigInteger.valueOf(2004033439)).intValue()).and(BigInteger.valueOf(2147483647)).xor(BigInteger.valueOf(1317505404));
        return result;
    }

    public static BigInteger decrypt(long publicId) {
        BigInteger roomId = BigInteger.valueOf(BigInteger.valueOf(publicId).xor(BigInteger.valueOf(1317505404)).multiply(BigInteger.valueOf(711081055)).intValue()).and(BigInteger.valueOf(2147483647));
        return roomId;
    }
}
