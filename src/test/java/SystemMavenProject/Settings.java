package SystemMavenProject;

public class Settings {
	 public static final int LoginTest = 1;
	 public static final int FinanceTest = 2;
	 public static final int LoadFeesTest = 3;
	 public static final int ProgramsTest = 4;
	 public static final int ProgramProductsTest = 5;
	 public static final int ProgramProductRefTest = 6;
	 public static final int ProgramCarrierTypeTest = 7;
	 public static final int ProgramDeliveryFeeTest = 8;
	 public static final int ProgramTariffTest= 9;
	 
	 public static final int UsersSystemUser= 10;
	 public static final int UsersProgramUser= 11;
	 
	 public static final int IPWhitelistTest= 12;
	 
	 public static final int CardholderDetailsTest= 13;
	 public static final int SettingsPrefundTest= 14;
	 
	   
	   //testing setup
	   
	   public boolean skipTest(String testCase) {
		   boolean runTestCase = true;
		   switch (testCase) {
         case "LoginTest": runTestCase = true;
      	   	break;
         case "FinanceTest": runTestCase = true;
 	   			break;
         case "LoadFeesTest": runTestCase = false;
 	   			break;
         case "ProgramsTest": runTestCase = false;
         		break;
         case "ProgramProductsTest": runTestCase = true;         
 	   			break;
         case "ProgramProductRefTest": runTestCase = true;                
 				break;
         case "ProgramCarrierTypeTest": runTestCase = true;         
 				break;
         case "ProgramDeliveryFeeTest": runTestCase = true;         
				break;
         case "ProgramTariffTest": runTestCase = true;         
				break;
         case "UsersSystemUser": runTestCase = true;         
				break;
         case "UsersProgramUser": runTestCase = true;         
				break;
         case "IPWhitelistTest": runTestCase = true;         
				break;
         case "CardholderDetailsTest": runTestCase = true;         
			break;
         case "SettingsPrefundTest": runTestCase = true;         
			break;
			
         default:  runTestCase = true;
                  break;
		   }
		   
		   return runTestCase;
		   
	   }
}
