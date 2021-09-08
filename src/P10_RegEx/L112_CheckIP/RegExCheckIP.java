package P10_RegEx.L112_CheckIP;

import java.util.regex.Pattern;

public class RegExCheckIP {
    public static void main(String[] args) {

        // Проверка корректности IP
        // 0-255.0-255.0-255.0-255

        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";

        RegExCheckIP regExCheckIP = new RegExCheckIP();
        regExCheckIP.checkIP(ip1);
        regExCheckIP.checkIP(ip2);

    }

    void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

}
