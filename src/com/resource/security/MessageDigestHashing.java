package com.resource.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;

public class MessageDigestHashing {

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {

		byte[] password = "password".getBytes();
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(password);
		byte[] hash = md.digest();
		String hashedStrring = Base64.encodeBase64String(hash);
		System.out.println(hashedStrring);
	}
}
