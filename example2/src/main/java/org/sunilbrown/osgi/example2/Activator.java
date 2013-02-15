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
package org.sunilbrown.osgi.example2;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import org.sunilbrown.osgi.example2.service.DictionaryService;

/**
 * This class implements a simple bundle that uses the bundle
 * context to register an English language dictionary service
 * with the OSGi framework. The dictionary service interface is
 * defined in a separate class file and is implemented by an
 * inner class.
**/
public class Activator implements BundleActivator
{
    /**
     * Implements BundleActivator.start(). Registers an
     * instance of a dictionary service using the bundle context;
     * attaches properties to the service that can be queried
     * when performing a service look-up.
     * @param context the framework context for the bundle.
    **/
    public void start(BundleContext context)
    {
        Hashtable<String, String> props = new Hashtable<String, String>();
        props.put("Language", "English");
        context.registerService(
            DictionaryService.class.getName(), new DictionaryImpl(), props);
    }

    /**
     * Implements BundleActivator.stop(). Does nothing since
     * the framework will automatically unregister any registered services.
     * @param context the framework context for the bundle.
    **/
    public void stop(BundleContext context)
    {
        // NOTE: The service is automatically unregistered.
    }

    /**
     * A private inner class that implements a dictionary service;
     * see DictionaryService for details of the service.
    **/
    private static class DictionaryImpl implements DictionaryService
    {
        // The set of words contained in the dictionary.
        String[] m_dictionary =
            { "welcome", "to", "the", "osgi", "tutorial" };

        /**
         * Implements DictionaryService.checkWord(). Determines
         * if the passed in word is contained in the dictionary.
         * @param word the word to be checked.
         * @return true if the word is in the dictionary,
         *         false otherwise.
        **/
        public boolean checkWord(String word)
        {
            word = word.toLowerCase();

            // This is very inefficient
            for (int i = 0; i < m_dictionary.length; i++)
            {
                if (m_dictionary[i].equals(word))
                {
                    return true;
                }
            }
            return false;
        }
    }
}