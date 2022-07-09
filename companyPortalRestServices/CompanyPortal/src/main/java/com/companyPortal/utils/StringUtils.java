/**
 * 
 */
package com.companyPortal.utils;
/**
 * @author atibrewal
 *
 */
public class StringUtils {
	
	/**
	 * <p>
	 * Checks if the <code>parameter</code> is empty.<br/>
	 * </p>
	 *
	 * @param parameter
	 * @return
	 */
	public static boolean isEmpty(final String parameter) {
		return isNullOrEmpty(parameter);
	}

	private static boolean isNullOrEmpty(String parameter) {
		 return parameter == null || parameter.length() == 0;
	}

}
