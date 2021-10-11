/*
 * 
o change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UberManagement;

import java.util.ArrayList;
import java.util.List;
;
 /*
 * @author anveshvarma
 */
public class UberCarInformation {
    
   // private static CarInformationList carLists;
    private ArrayList<Uber> carList;
    private ArrayList<Uber> mfgList;

    public ArrayList<Uber> getMfgList() {
        return mfgList;
    }

    public void setMfgList(ArrayList<Uber> mfgList) {
        this.mfgList = mfgList;
    }
    public UberCarInformation(){
        this.carList = new ArrayList<>();
         
    }
    
    public ArrayList<Uber> getCarList() {
        return carList;
    }

    
    public void setCarList(ArrayList<Uber> carList) {
        this.carList = carList;
    }
    

 public Uber addCar(){
     Uber car = new Uber();
     carList.add(car);
     return car;
 }
  
 
 public void deleteCar(Uber car){
     carList.remove(car);
 }
 
 
 public ArrayList<Uber> getMfgList(int manufactured_year){
      ArrayList<Uber> mfglist = new ArrayList<>();
     for(Uber car : carList){
            if(car.getManufactured_year()== manufactured_year){
                mfglist.add(car);
 }
     }return mfglist;
 }


 
 
  public ArrayList<Uber> getSerialList(int serial_num){
      ArrayList<Uber> mfglist = new ArrayList<>();
     for(Uber car : carList){
            if(car.getSerial_num()== serial_num){
                mfglist.add(car);
 }
     }return mfglist;
 }
 
     public ArrayList<Uber> getBrandList(String brand){
      ArrayList<Uber> brandlist = new ArrayList<>();
     for(Uber car : carList){
            if(car.getBrand().equals(brand)){
                brandlist.add(car);
 }
     }return brandlist;
 }

     
     public ArrayList<Uber> getModelList(String model_number){
      ArrayList<Uber> modellist = new ArrayList<>();
     for(Uber car : carList){
            if(car.getModel_num().equals(model_number)){
                modellist.add(car);
 }
     }return modellist;
 }
     
     public ArrayList<Uber> getMaintainanceCertificate(){
         
         ArrayList<Uber> maintainanceList = new ArrayList<>();
         for(Uber car: carList){
             if(car.isMaintenance_certificate() == false)
                 maintainanceList.add(car);
         }return maintainanceList;
     }
     
    
    
   public ArrayList<Uber> getAvailableCarsbyCity(String availble_city){
       ArrayList<Uber> availablecity = new ArrayList<>();
       for(Uber car: carList){
           if(car.getAvailble_city().equals(availble_city) && car.isAvailable()==true)
               availablecity.add(car);
           
       }return availablecity;
   }
    
       public ArrayList<Uber> getTotalAvailable(){
               ArrayList<Uber> totalavailable = new ArrayList<>();
              
               for(Uber car: carList){
                   if(car.isAvailable()==true)
                       totalavailable.add(car);
                   
                  
                   
               }return totalavailable;
              
       
}
       
       
        public ArrayList<Uber> getTotalUnAvailable(){
               ArrayList<Uber> totalUnavailable = new ArrayList<>();
              
               for(Uber car: carList){
                   if(car.isAvailable()==false)
                       totalUnavailable.add(car);
                   
                  
                   
               }return totalUnavailable;
       
       
}

        public ArrayList<Uber> getFirstAvailable(){
        ArrayList<Uber> fisrtAvailable=new ArrayList<>();
        
        for(Uber car: carList){
            if(car.isAvailable()==true)
                fisrtAvailable.add(car);
                break;
        }return fisrtAvailable;
        }
        
        
        
        public ArrayList<Uber> getMaxMinList(int max_seats, int min_seats){
            ArrayList<Uber> maxminList = new ArrayList<>();
            for(Uber car : carList){
                if(car.getMax_seats()<=max_seats && car.getMin_seats()>=min_seats){
                maxminList.add(car);
            }
            }  return maxminList;
        }

       
       public ArrayList<String> getAllBrands(){
           ArrayList<String> allbrands = new ArrayList<>();
           for(Uber car: carList){
               
               if(car.getBrand()!="")
               allbrands.add(car.getBrand());
           }
           return allbrands;
       }
       


}