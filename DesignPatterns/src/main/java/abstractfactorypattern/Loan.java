package abstractfactorypattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

abstract class Loan{  
	   protected double rate;  
	   abstract void getInterestRate(double rate);  
	   final Logger logger=LogManager.getLogger(Loan.class);
	   public void calculateLoanPayment(double loanamount, int years)  
	   {  
	         double Emi;  
	         int n;  
	  
	         n=years*12;  
	         rate=rate/1200;  
	         Emi=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;  
	  
	logger.debug("your monthly EMI is {}. for the amount {}. you have borrowed",Emi,loanamount);     
	 }  
	}