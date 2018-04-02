/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Krishan
 */
public class Validation {
    public static boolean CIDvalidation(String c)
    {
        boolean b=true ;
        for(int i=0;i<c.length();i++)
        {
        if( !Character.isDigit(c.charAt(i)) || c.length()>4|| c.length()<3 )
            {
           
              
               JOptionPane.showMessageDialog(null, " format invalid it's should be Digits only ");
               b=false;
               return b;
             }
        }
        return b;
    }       
    
    public static boolean Namevalidation(String name)
    {
        if(!name.isEmpty())
        {
            boolean b=true ;
             for(int i=0;i<name.length();i++)
             {
                 if( !Character.isAlphabetic(name.charAt(i)) || name.length()>25  )
                  {
           
              
                       JOptionPane.showMessageDialog(null, "Name format invalid it's should be Letters only ");
                       b=false;
                       return b;
                  }
        }
            return b;
        }
         JOptionPane.showMessageDialog(null, "Name is Empty");
          return false;
    }       
    
    public static boolean NICvalidation(String nic)
    {
    if(nic.length()==10) 
    {
       if(nic.toUpperCase().charAt(9) !='V' ) 
        {   
            
            JOptionPane.showMessageDialog(null, "NIC format invalid it's should be 123456789V ");

            return false;
            
        }
        
        boolean b=true ;
        for(int i=0;i<nic.length()-1;i++)
        {
        if( !Character.isDigit(nic.charAt(i))   )
            {
               b=false;
              
               JOptionPane.showMessageDialog(null, "NIC format invalid it's should be 123456789V ");
               
               return b;
             }
        }
        return b;
        
    }
    
    JOptionPane.showMessageDialog(null, "NIC format invalid it's should be 123456789V ");

    return false;
    
    }       
    
    
    
    
    
    
    
    public static boolean Addressvalidation(String add)
    {
        boolean b=true ;
       if( add.length()<100 && !add.isEmpty())
       {for(int i=0;i<add.length();i++)
        {
        if( !Character.isAlphabetic(add.charAt(i))&& !Character.isDigit(add.charAt(i))&& add.charAt(i)!='/' && add.charAt(i)!='-' && add.charAt(i)!='.' && add.charAt(i)!='#' && add.charAt(i)!=',' && add.charAt(i)!=' '  )
            {
           
              
               JOptionPane.showMessageDialog(null, "ADDRESS format invalid it's should be Letters and (/  -  #  , .) only ");
               b=false;
               return b;
             }
        }
     
       
       return b;
       
       }
       else if(add.isEmpty())
       {
                  JOptionPane.showMessageDialog(null, "ADDRESS is Empty");
                  return false;
       }
       
       JOptionPane.showMessageDialog(null, "ADDRESS format invalid it's MAXIMUM SIZE should be 100 Characters only ");

       return false;
    }    
    
    
    public static boolean LICENCEvalidation(String LC)
    {
    if(LC.length()==7 ) 
    {
       if(LC.toUpperCase().charAt(0) !='B' ) 
        {   
            
            JOptionPane.showMessageDialog(null, "LICENCE NUMBER format invalid it's should be B123456 ");

            return false;
            
        }
        
        boolean b=true ;
        for(int i=1;i<LC.length();i++)
        {
        if( !Character.isDigit(LC.charAt(i))   )
            {
               b=false;
              
                    JOptionPane.showMessageDialog(null, "LICENCE NUMBER format invalid it's should be B123456 ");
               
               return b;
             }
        }
        return b;
        
    }
    else
        if(LC.isEmpty())
            {
               return true;
    
            }
           
            JOptionPane.showMessageDialog(null, "LICENCE NUMBER format invalid it's should be B123456 ");

            return false;
    }
    
    
    
     public static boolean Phonevalidation(String c)
    {
    if(c.length()==10) 
    {
       if(c.charAt(0) !='0' ) 
        {   
            
            JOptionPane.showMessageDialog(null, "Phone Number format invalid it's should be 0XX1234567 ");

            return false;
            
        }
        
        boolean b=true ;
        for(int i=1;i<c.length();i++)
        {
        if( !Character.isDigit(c.charAt(i))   )
            {
               b=false;
              
              JOptionPane.showMessageDialog(null, "Phone Number format invalid it's should be 0XX1234567 ");
               
               return b;
             }
        }
        return b;
        
    }
    
    JOptionPane.showMessageDialog(null, "Phone Number format invalid it's should be 0XX1234567 ");

    return false;
    
    }       
     
     
     
     
     
     
     
      public static boolean Costvalidation(String c)
    {
    if(!c.isEmpty()) 
    {
       
        
        boolean b=true ;
        for(int i=0;i<c.length();i++)
        {
        if( !Character.isDigit(c.charAt(i))   )
            {
               b=false;
              
              JOptionPane.showMessageDialog(null, "Cost format invalid it's should Numbers only ");
               
               return b;
             }
        }
        return b;
        
    }
    
    JOptionPane.showMessageDialog(null, "Cost is Empty");

    return false;
    
    }       
     
     
     
     
     
     public static boolean Colorvalidation(String name)
    {
        
        if(!name.isEmpty())
        {
        boolean b=true ;
        for(int i=0;i<name.length();i++)
        {
        if( !Character.isAlphabetic(name.charAt(i)) || name.length()>20  )
            {
           
              
               JOptionPane.showMessageDialog(null, "Color format invalid it's should be Letters only ");
               b=false;
               return b;
             }
        }
        return b;
        
        }
        JOptionPane.showMessageDialog(null, "Color is Empty");
        return false;
    }  
        
    
     
     
     
     public static boolean VehicleModelvalidation(String name)
    {
        
        if(!name.isEmpty())
        {
        boolean b=true ;
        for(int i=0;i<name.length();i++)
        {
        if( !Character.isAlphabetic(name.charAt(i)) && !Character.isDigit(name.charAt(i))|| name.length()>25  )
            {
           
              
               JOptionPane.showMessageDialog(null, "Vehicle Model format invalid it's should be Letters and Numbers only ");
               b=false;
               return b;
             }
        }
        return b;
        
        }
        JOptionPane.showMessageDialog(null, "Vehicle Model is Empty");
        return false;
    }  
        
     
     
     
     
     
          
     public static boolean VehicleTypevalidation(String name)
    {
        
        if(!name.isEmpty())
        {
        boolean b=true ;
        for(int i=0;i<name.length();i++)
        {
        if( !Character.isAlphabetic(name.charAt(i)) || name.length()>25  )
            {
           
              
               JOptionPane.showMessageDialog(null, "Vehicle Type format invalid it's should be Letters only ");
               b=false;
               return b;
             }
        }
        return b;
        
        }
        JOptionPane.showMessageDialog(null, "Vehicle Type is Empty");
        return false;
    }  
        
     
     
     
     
     
     
     public static boolean DriverLICENCEvalidation(String LC)
    {
    if(LC.length()==7 ) 
    {
       if(LC.toUpperCase().charAt(0) !='B' ) 
        {   
            
            JOptionPane.showMessageDialog(null, "LICENCE NUMBER format invalid it's should be B123456 ");

            return false;
            
        }
        
        boolean b=true ;
        for(int i=1;i<LC.length();i++)
        {
        if( !Character.isDigit(LC.charAt(i))   )
            {
               b=false;
              
                    JOptionPane.showMessageDialog(null, "LICENCE NUMBER format invalid it's should be B123456 ");
               
               return b;
             }
        }
        return b;
        
    }
    else
        if(LC.isEmpty())
            {
               
              JOptionPane.showMessageDialog(null, "LICENCE NUMBER is Empty ");
               return false;
    
            }
           
            JOptionPane.showMessageDialog(null, "LICENCE NUMBER format invalid it's should be B123456 ");

            return false;
    }
     
     
     
     public static boolean isThisDateValid(String dateToValidate){

		if(dateToValidate == null){
                     JOptionPane.showMessageDialog(null, "DOB DATE format invalid it's should be yyyy-MM-dd");

			return false;
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);

		try {

			//if not valid, it will throw ParseException
			Date date = sdf.parse(dateToValidate);
			

		} catch (ParseException e) {

		   JOptionPane.showMessageDialog(null, "DOB DATE format invalid it's should be yyyy-MM-dd");

			return false;
		}

		return true;
	}

    
     public static boolean isLCDateValid(String dateToValidate){

		if(dateToValidate == null){
                     JOptionPane.showMessageDialog(null, "Licence Expiry DATE format invalid it's should be yyyy-MM-dd");

			return false;
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);

		try {

			//if not valid, it will throw ParseException
			Date date = sdf.parse(dateToValidate);
			

		} catch (ParseException e) {

		   JOptionPane.showMessageDialog(null, "Licence Expiry DATE format invalid it's should be yyyy-MM-dd");

			return false;
		}

		return true;
	}

     
}
