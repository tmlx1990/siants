package com.siants.core.tools.encrypt.impl;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.siants.core.tools.encrypt.EncryptUtils;


public class EncryptUtilsImpl {

	public String getEncrypt(String password) {

		byte[] sha512 = EncryptUtils.encodeHmacSHA512(password.getBytes(),
				EncryptUtils.getHmaSHA512key());
		byte[] shaMD5 = EncryptUtils.encodeHmacMD5(sha512,
				EncryptUtils.getHmaMD5key());
		return EncryptUtils.hex(shaMD5);
	}

	public static void main(String[] args) {
		/*
		 * // byte[] key = getHmaMD5key(); // byte[] key = getHmaSHAkey(); //
		 * byte[] key = getHmaSHA256key(); // byte[] key = getHmaSHA384key();
		 * byte[] key = getHmaSHA512key();
		 * 
		 * EncryptUtilsImpl
		 * System.out.println("加密密钥: byte[]:"+showByteArray(key).length());
		 * 
		 * String data = "string"; System.out.println("加密前数据: string:"+data);
		 * System.out.println("加密前数据: byte[]:"+showByteArray(data.getBytes()));
		 * System.out.println(); // byte[] encodeData =
		 * encodeHmacMD5(data.getBytes(), key); // byte[] encodeData =
		 * encodeHmacSHA(data.getBytes(), key); // byte[] encodeData =
		 * encodeHmacSHA256(data.getBytes(), key); // byte[] encodeData =
		 * encodeHmacSHA384(data.getBytes(), key); byte[] encodeData =
		 * encodeHmacSHA512(data.getBytes(), key);
		 * System.out.println("加密后数据: byte[]:"
		 * +showByteArray(encodeData).length());
		 * System.out.println("加密后数据: byte[]:"+encodeData.length); //
		 * System.out.println("加密后数据: hexStr:"+Hex.encodeHexStr(encodeData));
		 * System.out.println();
		 */
		EncryptUtilsImpl aEncryptUtilsImpl = new EncryptUtilsImpl();
		System.out.println(aEncryptUtilsImpl.getEncrypt("sss1"));

	}

}
