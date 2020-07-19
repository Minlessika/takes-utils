/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2018-2020 Olivier B. OURA
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.minlessika.db;

import java.sql.Connection;

/**
 * A database
 * 
 * @author Olivier B. OURA (baudoliver7@gmail.com)
 */
public interface Database {
	
	/**
	 * Start database. place to do some initializations
	 */
	void start();
	
	/**
	 * Get a connection to database
	 * @return connection
	 */
	Connection getConnection();
	
	/**
	 * remove a target connection
	 * @param connection Connection to remove
	 */
	void removeConnection(Connection connection);
	
	/**
	 * Get number of available connections
	 * @return number
	 */
	int numberOfAvailableConnections();
	
	/**
	 * starts transaction
	 */
	void startTransaction();
	
	/**
	 * Commits a transaction
	 */
	void commit();
	
	/**
	 * Rolls back a transaction
	 */
	void rollback();
	
	/**
	 * Finalize current transaction
	 */
	void terminateTransaction();
	
	/**
	 * Checks if database is currently in transaction mode
	 * @return transaction started or not
	 */
	boolean transactionStarted();
}