package edu.harry.techdemo.main;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

public class Main {

    public static void main(String[] args) {
        if(args.length!=1){
            System.out.print("Please enter one IP address");
        }
        else{
            String ipaddress=args[0];
            GeoIPService geoIPService=new GeoIPService();
            GeoIPServiceSoap geoIPServiceSoap=geoIPService.getGeoIPServiceSoap();
            String iplocation= geoIPServiceSoap.getIpLocation(ipaddress);
            System.out.print(iplocation);
        }
    }
}
