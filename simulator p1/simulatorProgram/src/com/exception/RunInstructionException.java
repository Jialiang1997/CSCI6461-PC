package com.exception;

/**
 * @author Liang
 *
 */
public class RunInstructionException extends Exception {
	
	int faultCode;
	String message;
	
	/**
	 * @param faultCode
	 * @param message
	 */
	public RunInstructionException(int faultCode, String message){
		this.faultCode = faultCode;
		this.message = message;
	}
	
	public RunInstructionException(int faultCode){
		this.faultCode = faultCode;
	}
	
	/**
	 * @return
	 */
	public int getFaultCode(){
		return this.faultCode;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage(){
		return this.message;
	}
	

}
