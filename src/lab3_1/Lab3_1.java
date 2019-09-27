//программма сканирует сеть в 
//указанном диапазоне IP адресов
//на наличие активных компьютеров.
package lab3_1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Lab3_1 {
    public static void main(String[] args) throws UnknownHostException, IOException {

        List<String> ipList = new ArrayList<String>();
        List<String> reachableList = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String ip = "10.13.227.19" + i;
            ipList.add(ip);
        }
        for (String ip : ipList) {
            InetAddress a = InetAddress.getByName(ip);
            if (a.isReachable(2000)) {
                reachableList.add(ip);
            }
        }
        String firstElement =ipList.get(0);
        String lastElement =ipList.get(ipList.size()-1);
        System.out.println("Диапозон IP от " + firstElement+ " до " + lastElement);
        System.out.println("Активные компьютеры");
        for(String reachable : reachableList) {
            System.out.println(reachable);
    }

    
}
}
