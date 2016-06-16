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
package com.shvid.supergrid.client.config;

import com.google.common.base.Optional;

/**
 * Optional Settings Definition
 * 
 * @author Alex Shvid
 *
 */

public interface OptionalSettingsDefinition {

	/**
	 * Gets entry default parameters
	 * 
	 * @return not empty entry parameters
	 */
	
	Optional<EntryDefinition> getEntry();
	
	/**
	 * Gets get operation parameters
	 * 
	 * @return not empty get operation parameters
	 */
	
	Optional<GetOperationDefinition> getGetOperation();

	/**
	 * Sets set operation parameters
	 * 
	 * @return not empty set operation parameters
	 */
	
	Optional<SetOperationDefinition> getSetOperation();

}