package com.example.smartpot.enums;

public enum ServerURL {

        URL("http://117.16.94.138/android");
//    URL("http://222c.97.212.74/android");
//    URL("http://pdh6547.iptime.org/android");

    final private String url;
    private ServerURL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
