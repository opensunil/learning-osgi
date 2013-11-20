package edu.ksu.esb.assessment.scan;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        // here is a sample which processes the input files
        // (leaving them in place - see the 'noop' flag)
        // then performs content based routing on the message using XPath
    	//from("file:src/data?noop=true")
        from("file:/home/sunil/projects/filepollingbp/src/main/data/inbound?noop=true")
            .choice()
                .when(xpath("/person/city = 'London'"))
                    .log("UK message")
                    .to("file:/home/sunil/projects/filepollingbp/src/main/data/outbound/uk")
                .otherwise()
                    .log("Other message")
                    .to("file:/home/sunil/projects/filepollingbp/src/main/data/outbound/others");
    }//target/messages

}
