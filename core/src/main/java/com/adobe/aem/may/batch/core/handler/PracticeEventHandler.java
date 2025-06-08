package com.adobe.aem.may.batch.core.handler;



import org.apache.sling.api.SlingConstants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service=PracticeEventHandler.class,
            immediate = true,
            property = {
                EventConstants.EVENT_TOPIC + " = org/apache/sling/api/resource/Resource/*"
            })
public class PracticeEventHandler implements EventHandler {

    private final Logger logger = LoggerFactory.getLogger(PracticeEventHandler.class);

    @Override
    public void handleEvent(Event event) {
       
             logger.info("Event Topic = {}, Path = {}",event.getTopic(),
             event.getProperty(SlingConstants.PROPERTY_PATH));
    }
}