package com.hsys.tea.milktea.wenxin.wxutils;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyConfig extends WXPayConfig{

    private byte[] certData;

    public MyConfig() throws Exception {
        String certPath = "D:\\Backup\\桌面\\工作\\陆少爷的茶\\lsydc\\apiclient_cert.p12";
        File file = new File(certPath);
        InputStream certStream = new FileInputStream(file);
        this.certData = new byte[(int) file.length()];
        certStream.read(this.certData);
        certStream.close();
    }

    public String getAppID() {
        return "wx192dcbdf76fa378a";
    }

    public String getMchID() {
        return "1556614801";
    }

    public String getKey() {
        return "39d3f9b650b35477d49b8f1974e4dc25";
    }

    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    public int getHttpReadTimeoutMs() {
        return 10000;
    }

    protected IWXPayDomain getWXPayDomain() {
        return WXPayDomainSimpleImpl.instance();
    }
}
