package commands;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class LocallIpPOC {
    public static void main(String[] args) {
        try {
            System.out.println(Inet4Address.getLocalHost().getHostName());
        } catch (UnknownHostException e) {
            System.out.println();
        }
    }
}
