package com.resource.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.apache.commons.codec.binary.Base64;

public class MessageDigestHashingWithSalt {

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {

		byte[] password = "password".getBytes();
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(password);

		byte[] salt = new byte[8];
		SecureRandom secureRandom = new SecureRandom();
		secureRandom.nextBytes(salt);
		md.update(salt);

		byte[] hash = md.digest();
		String hashedStrring = Base64.encodeBase64String(hash);
		System.out.println(hashedStrring);
	}
}
