package factorymethodpattern;
import java.io.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class GenerateBill{  
    public static void main(String args[])throws IOException{  
    	  final Logger logger=LogManager.getLogger(GenerateBill.class);
      GetPlanFactory planFactory = new GetPlanFactory();  
        
     logger.debug("Enter the name of plan for which the bill will be generated: ");  
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
      String planName=br.readLine();  
      logger.debug("Enter the number of units for bill will be calculated: ");  
      int units=Integer.parseInt(br.readLine());  
  
      Plan p = planFactory.getPlan(planName);  
  
      logger.debug("Bill amount for {}. of {}.units is: ",planName,units);  
           p.getRate();  
           p.calculateBill(units);  
            }  
    }