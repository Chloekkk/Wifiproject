package com.example.wifiproject;

public class ConnectedWifi {
    private String bssid;
    private String ssid;

    public ConnectedWifi(String bssid, String ssid) {
        this.bssid = bssid;
        this.ssid = ssid;
    }

    public String getBssid() {
        return bssid;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }
}
