import java.util.*;

public class Converter{
  public static int binToDecimal(String inp){
    //binary to decimal

                       // index      5  4 3 2 1 0
    //4096 2048 1024 512 256 128 64 32 16 8 4 2 1   0
    
    //                            1  0  0 1 0 0 1   0 example
    //                                          1     = 1
    //                                    0 0 1 1     = 3
    //                                    0 0 1 0     = 2
    
    //binary array is dependant on string arrays length
    
    /* with Math.pow using double datatype
    2 exp 0 = 1, 
    2 exp 1 = 2, 
    2 exp 2 = 4,
    2 exp 3 = 8, 
    2 exp 4 = 16, 
    2 exp 5 = 32
    */
    
    char stringValue = '0'; 
    
    int binaryArrayLength = inp.length();
    
    double[] doubleArray = new double[binaryArrayLength];
    int decimalResult = 0;
    
    int intAlldecimalPostitions;
    double doubleAlldecimalPostitions;
    
    int[] intArray = new int[binaryArrayLength];
    
    
    /*
    loop through the string array and loop through binary array
    after assigning index value of string array increment the index
    add only values from binary array corresponding to the string array´s index
    */
     for(int z = inp.length() - 1; z >= 0;){
        
        
            for(int i = 0; i < doubleArray.length; i++){
      
                doubleAlldecimalPostitions = Math.pow(2,i);
          
                intAlldecimalPostitions = (int) doubleAlldecimalPostitions;
                
    
                //call string array inside loop from binary array and increment string array´s index
                stringValue = inp.charAt(z);
                z--;
      
      
                     //compare values from string with values from double array
                    //if it is 1 add value to sumResult
                     if(stringValue == '1'){
          
                        decimalResult += intAlldecimalPostitions;
                        System.out.println("decimalResult " + decimalResult);
         
                        //index checking
                        //System.out.println("i  " + i);
                        //System.out.println("z  " + z);
              
        }//end if
         
      }//end loop binary array
       
    }//end loop string array
    
      return decimalResult;
      
    }//end static method
    
      
}//end class
