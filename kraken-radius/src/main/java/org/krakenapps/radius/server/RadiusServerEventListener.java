/*
 * Copyright 2011 Future Systems
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.krakenapps.radius.server;

public abstract class RadiusServerEventListener {
	public void onCreateVirtualServer(RadiusVirtualServer virtualServer) {
	}

	public void onRemoveVirtualServer(RadiusVirtualServer virtualServer) {
	}

	public void onCreateAuthenticator(RadiusAuthenticator authenticator) {
	}
	
	public void onRemoveAuthenticator(RadiusAuthenticator authenticator) {
	}
	
	public void onCreateProfile(RadiusProfile profile) {
	}

	public void onUpdateProfile(RadiusProfile oldProfile, RadiusProfile newProfile) {
	}
	
	public void onRemoveProfile(RadiusProfile profile) {
	}
}