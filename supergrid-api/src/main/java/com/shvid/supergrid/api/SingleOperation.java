/*
 * Copyright (C) 2016 The Supergrid Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.shvid.supergrid.api;

import com.shvid.supergrid.api.operation.BatchOperation;


/**
 * All operations in Supergrid are asynronous
 * 
 * Reactive programming
 * 
 * All operations are thread-safe
 * 
 * @author Alex Shvid
 *
 */

public interface SingleOperation {

	/**
	 * Adds this operation to the batch
	 * 
	 * @param batch - batch that will be executed
	 * @return not null future
	 */
	
	ResultFuture addToBatch(BatchOperation batch);
	
	/**
	 * Executes operation
	 * 
	 * @param timeoutMillis - timeout milliseconds
	 * @return not null future
	 */
	
	ResultFuture execute(int timeoutMillis);
	
}