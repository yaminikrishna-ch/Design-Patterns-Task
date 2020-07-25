package builderpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class Builder 
{ 
    public static void main(String[] args) 
    { 
    	  final Logger logger=LogManager.getLogger(Builder.class);
        HouseBuilder iglooBuilder = new IglooHouseBuilder(); 
        CivilEngineer engineer = new CivilEngineer(iglooBuilder); 
  
        engineer.constructHouse(); 
  
        House house = engineer.getHouse(); 
  
        logger.debug("Builder constructed: {}.",house); 
    } 
} 