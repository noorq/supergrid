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
package com.shvid.supergrid.support.exception;

/**
 * TimeoutException
 * 
 * @author Alex Shvid
 *
 */

public class TimeoutException extends GeneralRuntimeException {

	private static final long serialVersionUID = 942050858050281111L;

	public TimeoutException(String msg) {
		super(msg);
	}
	
	public TimeoutException(String msg, Throwable t) {
		super(msg, t);
	}

	public TimeoutException(Throwable t) {
		super(t);
	}
	
}