package com.resource.security;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

import org.apache.commons.codec.binary.Base64;

public class CipherExampleWithIV {

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws BadPaddingException
	 * @throws IllegalBlockSizeException
	 * @throws InvalidAlgorithmParameterException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {

		byte[] randomBytes = new byte[16];
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		secureRandom.nextBytes(randomBytes);
		IvParameterSpec iv1 = new IvParameterSpec(randomBytes);

		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		SecretKey secretKey = keyGenerator.generateKey();
		byte[] data = "data".getBytes();

		// Use CBC, CFB, OFB as feedback modes
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

		// Encryption
		cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv1);

		byte[] encryptedData = cipher.doFinal(data);
		String encryptedDataString = Base64.encodeBase64String(encryptedData);
		System.out.println(encryptedDataString);

		// Decryption
		cipher.init(Cipher.DECRYPT_MODE, secretKey, iv1);
		data = cipher.doFinal(encryptedData);
		System.out.println(new String(data));
	}

}
