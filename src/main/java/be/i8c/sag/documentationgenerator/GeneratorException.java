/*******************************************************************************
 * Copyright (c) 2017, i8c N.V. (Integr8 Consulting; http://www.i8c.be)
 * All Rights Reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *******************************************************************************/
package be.i8c.sag.documentationgenerator;

/**
 *  This Exception is thrown when the generation of a document has failed
 */
public class GeneratorException extends Exception {
	private static final long serialVersionUID = -8182308462872098098L;

	/**
	 * Constructs a new exception with the specified detail message.
	 *
	 * @param   errorMessage   the detail message. The detail message is saved for
	 *          later retrieval by the {@link #getMessage()} method.
	 */
	public GeneratorException(String errorMessage) {
		this("Error occurred trying to instantiate Generator. " + errorMessage, null);
	}

	/**
	 * Constructs a new exception with the specified detail message and
	 * cause.  <p>Note that the detail message associated with
	 * {@code cause} is <i>not</i> automatically incorporated in
	 * this exception's detail message.
	 *
	 * @param  errorMessage the detail message (which is saved for later retrieval
	 *         by the {@link #getMessage()} method).
	 * @param  cause the cause (which is saved for later retrieval by the
	 *         {@link #getCause()} method).  (A <tt>null</tt> value is
	 *         permitted, and indicates that the cause is nonexistent or
	 *         unknown.)
	 */
	public GeneratorException(String errorMessage, Exception cause) {
		super("Error occurred trying to instantiate Generator. " + errorMessage + ((cause != null) ? " [" 
				+ cause.getClass().getName() + "]: " + cause.getMessage() : ""), cause);
	}	
}
