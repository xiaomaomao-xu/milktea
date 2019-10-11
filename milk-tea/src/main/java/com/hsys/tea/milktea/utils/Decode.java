package com.hsys.tea.milktea.utils;


import java.io.UnsupportedEncodingException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.codehaus.xfire.util.Base64;

import com.alibaba.fastjson.JSONObject;

public class Decode {
	 public static JSONObject getUserInfo(String encryptedData,String sessionkey,String iv){
	        // 被加密的数据
	        byte[] dataByte = Base64.decode(encryptedData);
	        // 加密秘钥
	        byte[] keyByte = Base64.decode(sessionkey);
	        // 偏移量
	        byte[] ivByte = Base64.decode(iv);
	        try {
	               // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
	            int base = 16;
	            if (keyByte.length % base != 0) {
	                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
	                byte[] temp = new byte[groups * base];
	                Arrays.fill(temp, (byte) 0);
	                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
	                keyByte = temp;
	            }
	            // 初始化
	            Security.addProvider(new BouncyCastleProvider());
	            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding","BC");
	            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
	            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
	            parameters.init(new IvParameterSpec(ivByte));
	            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化
	            byte[] resultByte = cipher.doFinal(dataByte);
	            if (null != resultByte && resultByte.length > 0) {
	                String result = new String(resultByte, "UTF-8");
	                return JSONObject.parseObject(result);
	            }
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        } catch (NoSuchPaddingException e) {
	            e.printStackTrace();
	        } catch (InvalidParameterSpecException e) {
	            e.printStackTrace();
	        } catch (IllegalBlockSizeException e) {
	            e.printStackTrace();
	        } catch (BadPaddingException e) {
	            e.printStackTrace();
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        } catch (InvalidKeyException e) {
	            e.printStackTrace();
	        } catch (InvalidAlgorithmParameterException e) {
	            e.printStackTrace();
	        } catch (NoSuchProviderException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
}