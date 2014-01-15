package com.resource.security;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

import org.apache.commons.codec.binary.Base64;

public class HMACGeneration {

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {

		KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacMD5");
		SecretKey secretKey = keyGenerator.generateKey();
		Mac mac = Mac.getInstance("HmacMD5");
		mac.init(secretKey);
		byte[] hmac = mac.doFinal("data".getBytes());
		String encodedString = Base64.encodeBase64String(hmac);
		System.out.println(encodedString);
	}
}
