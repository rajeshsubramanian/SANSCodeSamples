package com.resource.security;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

import org.apache.commons.codec.binary.Base64;

public class CipherExample {

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws BadPaddingException
	 * @throws IllegalBlockSizeException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		SecretKey secretKey = keyGenerator.generateKey();
		byte[] data = "data".getBytes();
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

		// Encryption
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] encryptedData = cipher.doFinal(data);
		String encryptedDataString = Base64.encodeBase64String(encryptedData);
		System.out.println(encryptedDataString);

		// Decryption
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		data = cipher.doFinal(encryptedData);
		System.out.println(new String(data));
	}

}
