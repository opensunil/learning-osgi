/**
 * 
 */
package edu.ksu.esb.assessment.scan;

import org.apache.camel.builder.RouteBuilder;

/**
 * @author sunil
 *
 */
public class MyCSVRouteBuilder extends RouteBuilder {

	/* (non-Javadoc)
	 * @see org.apache.camel.builder.RouteBuilder#configure()
	 */
	@Override
	public void configure() throws Exception {
		//from("file:src/test/csv/daltons.csv&noop=true").
		//unmarshal().csv().
		//to("mock:daltons");
		from("file:src/main/data/inbound/csv?noop=true").
		unmarshal().csv().
		to("file:src/main/data/outbound/csv");
		
		//unmarshal().csv();
	}

}
