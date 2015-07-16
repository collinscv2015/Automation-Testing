package automationtest;

import org.im4java.core.CompareCmd;
import org.im4java.core.IMOperation;
import org.im4java.process.StandardStream;

public class dom2 {

	    public static boolean compareImages(String exp, String cur, String diff){
		
			  // This instance wraps the compare command
			  CompareCmd compare = new CompareCmd();
			 
			  // For metric-output
			  compare.setErrorConsumer(StandardStream.STDERR);
			  IMOperation cmpOp = new IMOperation();
			  // Set the compare metric
			  cmpOp.metric("mae");
			 
			  // Add the expected image
			  cmpOp.addImage(exp);
			 
			  // Add the current image
			  cmpOp.addImage(cur);
			 
			  // This stores the difference
			  cmpOp.addImage(diff);
			 
			  try {
			    // Do the compare
			    compare.run(cmpOp);
			    return true;
			  }
			  catch (Exception ex) {
			    return false;
			  }
			}

	}


