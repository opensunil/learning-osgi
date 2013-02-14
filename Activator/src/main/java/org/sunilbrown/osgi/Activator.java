/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.sunilbrown.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceEvent;

public class Activator implements BundleActivator, ServiceListener {

    public void start(BundleContext context) {
	System.out.println("Starting to listen for service events.");
        context.addServiceListener(this);
    }

    public void stop(BundleContext context) {
	context.removeServiceListener(this);
        System.out.println("Stopped listening for service events.");
    }

    public void serviceChanged(ServiceEvent event)
    {
        String[] objectClass = (String[])
            event.getServiceReference().getProperty("objectClass");

        if (event.getType() == ServiceEvent.REGISTERED)
	    {
		System.out.println(
				   "Ex1: Service of type " + objectClass[0] + " registered.");
	    }
        else if (event.getType() == ServiceEvent.UNREGISTERING)
	    {
		System.out.println(
				   "Ex1: Service of type " + objectClass[0] + " unregistered.");
	    }
        else if (event.getType() == ServiceEvent.MODIFIED)
	    {
		System.out.println(
				   "Ex1: Service of type " + objectClass[0] + " modified.");
	    }
    }
}