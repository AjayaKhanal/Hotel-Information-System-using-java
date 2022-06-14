package projectfolder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.util.*;
public class LinearSearch {    
    public static int linearSearchAirportHotel(ArrayList <HotelData> hd,String  value){
        for(int i=0; i<hd.size();i++){
                if(hd.get(i).getCategory().compareTo(value)==0){
                    return i; 
                }
            }
            return -1;
    }
    
    public static int linearSearchStayHotel(ArrayList <HotelData> hd,String  value){
        for(int i=0; i<hd.size();i++){
                if(hd.get(i).getCategory().compareTo(value)==0){
                    return i; 
                }
            }
            return -1;
    }
    
    public static int linearSearchBusinessHotel(ArrayList <HotelData> hd,String  value){
        for(int i=0; i<hd.size();i++){
                if(hd.get(i).getCategory().compareTo(value)==0){
                    return i; 
                }
            }
            return -1;
    }
    
}
