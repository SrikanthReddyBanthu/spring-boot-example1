package com.spring.example1.demo.service;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.stereotype.Service;

@Service
public class JasyptService {

    public void test() {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();

        config.setPassword("cjss_encryption"); // encryptor's private key

        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");

        encryptor.setConfig(config);

        String data = "Welcome to CJSS";
        String encryptedData = encryptor.encrypt(data);
        System.out.println("encrypted data:" + encryptedData);

        System.out.println("decrypted data:" + encryptor.decrypt(encryptedData));
    }
}
