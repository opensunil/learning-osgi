package org.sunilbrown.osgi;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.Instantiate;

@Component
@Provides
public class HelloComponent implements Hello{

    public HelloComponent() {
	System.out.println("Hello FirstBundle");
    }
    
    public String sayHello(String name) { 
	return "hello " + name; 
    }
}
