package factorymethodpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

abstract class Plan{  
         protected double rate;  
         abstract void getRate();  
         final Logger logger=LogManager.getLogger(Plan.class);
         public void calculateBill(int units){  
              logger.debug(units*rate);  
          }  
}