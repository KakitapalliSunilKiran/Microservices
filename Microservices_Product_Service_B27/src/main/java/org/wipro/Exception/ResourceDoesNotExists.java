package org.wipro.Exception;

public class ResourceDoesNotExists extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7472502086505908129L;

	public ResourceDoesNotExists(int errorCode,String message) {
		super("Error Code : "+ errorCode + " " + message);
	}

}
