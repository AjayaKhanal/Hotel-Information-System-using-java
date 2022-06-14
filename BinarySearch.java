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
public class BinarySearch {
    
    public static int binarySearchPrice(ArrayList <HotelData> hd, int value){
        int left=0, right=hd.size()-1;
        
            while(left<=right){
                int mid = left +(right- left)/2;
            if(hd.get(mid).getPrice()== value){
                return mid;
            }else if(hd.get(mid).getPrice() > (value)){
               right = mid-1; 
            }else{  
                left = mid +1;
            }
            }
            
        return -1;
        
    }
    
    public static int binarySearchName(ArrayList <HotelData> hd, String value){
        int left=0, right=hd.size()-1;
        
            while(left<=right){
                int mid = left +(right- left)/2;
            if(hd.get(mid).getHotelName().compareTo(value)==0){
                return mid;
            }else if(hd.get(mid).getHotelName().compareTo(value)>0){
               right = mid-1; 
            }else{  
                left = mid +1;
            }
            }
            
        return -1; 
    }
    
    public static int binarySearchLocation(ArrayList <HotelData> hd, String value){
        int left=0, right=hd.size()-1;
        
            while(left<=right){
                int mid = left +(right- left)/2;
            if(hd.get(mid).getLocation().compareTo(value)==0){
                return mid;
            }else if(hd.get(mid).getLocation().compareTo(value)>0){
               right = mid-1; 
            }else{  
                left = mid +1;
            }
            }
            
        return -1;
        
    }
    
    public static int binarySearchRating(ArrayList <HotelData> hd, String value){
        int left=0, right=hd.size()-1;
        
            while(left<=right){
                int mid = left +(right- left)/2;
            if(hd.get(mid).getRating().compareTo(value)==0){
                return mid;
            }else if(hd.get(mid).getRating().compareTo(value)>0){
               right = mid-1; 
            }else{  
                left = mid +1;
            }
            }
            
        return -1;   
    }
    
    public static int binarySearchAirportHotel(ArrayList <HotelData> hd, String value){
        int left=0, right=hd.size()-1;
        
            while(left<=right){
                int mid = left +(right- left)/2;
                if(hd.get(mid).getCategory().compareTo(value)==0){
                    return mid;
                }else if(hd.get(mid).getCategory().compareTo(value)>0){
                   right = mid-1; 
                }else{  
                    left = mid +1;
                }
            }
            
        return -1;   
    }
    
    public static int binarySearchStayHotel(ArrayList <HotelData> hd, String value){
        int left=0, right=hd.size()-1;
        
            while(left<=right){
                int mid = left +(right- left)/2;
                if(hd.get(mid).getCategory().compareTo(value)==0){
                    return mid;
                }else if(hd.get(mid).getCategory().compareTo(value)>0){
                   right = mid-1; 
                }else{  
                    left = mid +1;
                }
            }
            
        return -1;   
    }
    
    public static int binaryBusinessHotel(ArrayList <HotelData> hd, String value){
        int left=0, right=hd.size()-1;
        
            while(left<=right){
                int mid = left +(right- left)/2;
                if(hd.get(mid).getCategory().compareTo(value)==0){
                    return mid;
                }else if(hd.get(mid).getCategory().compareTo(value)>0){
                   right = mid-1; 
                }else{  
                    left = mid +1;
                }
            }
            
        return -1;   
    }
    
}
