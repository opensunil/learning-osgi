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
package org.sunilbrown.osgi.example8;

//Import changed to reflect new servicebinder jar
import org.ungoverned.gravity.servicebinder.GenericActivator;

/**
 * This example re-implements the spell checker service of
 * Example 6 using the Service Binder. The Service Binder
 * greatly simplifies creating OSGi applications by
 * essentially eliminating the need to write OSGi-related
 * code; instead of writing OSGi code for your bundle, you
 * create a simple XML file to describe your bundle's service
 * dependencies. This class extends the generic bundle activator;
 * it does not provide any additional functionality. All
 * functionality for service-related tasks, such as look-up and
 * binding, is handled by the generic activator base class using
 * data from the metadata.xml file. All application
 * functionality is defined in the SpellCheckerImpl.java
 * file.
**/

public class Activator extends GenericActivator
{
}