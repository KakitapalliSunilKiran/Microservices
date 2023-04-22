package org.wipro.Exception;

public class ResourceAlreadyExists extends Exception{
	


	/**
	 * 
	 */
	private static final long serialVersionUID = -2264190452395256825L;

	public ResourceAlreadyExists(int errorCode,String message) {
		super("Error Code : "+ errorCode + " " + message);
	}

}
