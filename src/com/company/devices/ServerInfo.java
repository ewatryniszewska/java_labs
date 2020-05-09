package com.company.devices;

public class ServerInfo {
    public String protocol;
    public String address;
    public Integer port;

    public ServerInfo(String protocol, String address, Integer port) {
        this.protocol = protocol;
        this.address = address;
        this.port = port;
    }
}
