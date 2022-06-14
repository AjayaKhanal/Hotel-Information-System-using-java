/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfolder;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DELL
 */
public class SelectionSort {
    public static void sortPrice(ArrayList<HotelData> hotelData)
   {            
        for (int i = 0; i < hotelData.size()-1; i++) {
            int minPos = i;
            for (int j = i + 1; j < hotelData.size(); j++) {
                if (hotelData.get(j).getPrice()< hotelData.get(minPos).getPrice()) {
                    minPos = j;
                }
            }
            Collections.swap(hotelData, minPos, i);
        }
   }
    
    public static void sortName(ArrayList<HotelData> hotelData)
   {            
        for (int i = 0; i < hotelData.size()-1; i++) {
            int minPos = i;
            for (int j = i + 1; j < hotelData.size(); j++) {
                if (hotelData.get(j).getHotelName().compareTo(hotelData.get(minPos).getHotelName()) < 0) {
                    minPos = j;
                }
            }
            Collections.swap(hotelData, i, minPos);
        }
   }
    
    public static void sortLocation(ArrayList<HotelData> hotelData)
   {            
        for (int i = 0; i < hotelData.size()-1; i++) {
            int minPos = i;
            for (int j = i + 1; j < hotelData.size(); j++) {
                if (hotelData.get(j).getLocation().compareTo(hotelData.get(minPos).getLocation()) < 0) {
                    minPos = j;
                }
            }
            Collections.swap(hotelData, minPos, i);
        } 
   }
    
public static void sortRating(ArrayList<HotelData> hotelData)
{            
    for (int i = 0; i < hotelData.size()-1; i++) {
        int minPos = i;
        for (int j = i + 1; j < hotelData.size(); j++) {
            if (hotelData.get(j).getRating().compareTo(hotelData.get(minPos).getRating()) < 0) {
                minPos = j;
            }
        }
        Collections.swap(hotelData, minPos, i);
    } 
}

//public static void sortAirportHotel(ArrayList<HotelData> hotelData)
//{            
//    for (int i = 0; i < hotelData.size()-1; i++) {
//        int minPos = i;
//        for (int j = i + 1; j < hotelData.size(); j++) {
//            if (hotelData.get(j).getCategory().compareTo(hotelData.get(minPos).getCategory()) < 0) {
//                minPos = j;
//            }
//        }
//        Collections.swap(hotelData, minPos, i);
//    } 
//}
//
//public static void sortStayHotel(ArrayList<HotelData> hotelData)
//{            
//    for (int i = 0; i < hotelData.size()-1; i++) {
//        int minPos = i;
//        for (int j = i + 1; j < hotelData.size(); j++) {
//            if (hotelData.get(j).getCategory().compareTo(hotelData.get(minPos).getCategory()) < 0) {
//                minPos = j;
//            }
//        }
//        Collections.swap(hotelData, minPos, i);
//    } 
//}
//
//public static void sortBusinessHotel(ArrayList<HotelData> hotelData)
//{            
//    for (int i = 0; i < hotelData.size()-1; i++) {
//        int minPos = i;
//        for (int j = i + 1; j < hotelData.size(); j++) {
//            if (hotelData.get(j).getCategory().compareTo(hotelData.get(minPos).getCategory()) < 0) {
//                minPos = j;
//            }
//        }
//        Collections.swap(hotelData, minPos, i);
//    } 
//}

}
