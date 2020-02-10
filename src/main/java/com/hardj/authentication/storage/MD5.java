package com.hardj.authentication.storage;

import java.security.MessageDigest;

/**
 * from Sumk
 * @author wjiajun
 */
public class MD5 {

    public byte[] digest(byte[] data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("md5");
        md.update(data);
        return md.digest();
    }

    public String parseByte2HexStr(byte[] buf) {
        StringBuilder sb = new StringBuilder(32);

        for(int i = 0; i < buf.length; ++i) {
            String hex = Integer.toHexString(buf[i] & 255);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }

            sb.append(hex);
        }
        return sb.toString().toLowerCase();
    }

    public String digestByteToString(byte[] data) throws Exception {
        return this.parseByte2HexStr(this.digest(data));
    }
}
