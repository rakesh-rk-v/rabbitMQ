package org.wso2.carbon.esb.connector;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext;
import org.wso2.carbon.connector.DynamicConnector;
import org.wso2.carbon.connector.core.AbstractConnector;
import org.wso2.carbon.connector.core.ConnectException;

public class DynamicESB extends AbstractConnector {
	private static final Log logger = LogFactory.getLog(DynamicConnector.class);
	@Override
	public void connect(MessageContext messageContext) throws ConnectException {
		
	        Object templateParam = getParameter(messageContext, "generated_param");
	        try {
	            log.info("Dynamic sample connector received message :" + templateParam);
	            /**Add your connector code here 
	            **/
	            System.out.println("This is a System Log "+ templateParam);
	            logger.info("Logger in Dynamic Connector "+templateParam);
	        } catch (Exception e) {
	        	logger.error("New Error"+ e);
		    throw new ConnectException(e);	
	        }
	    }
	
	
	
}
