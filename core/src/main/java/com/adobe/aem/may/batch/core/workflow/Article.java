package com.adobe.aem.may.batch.core.workflow;

import org.osgi.service.component.annotations.Component;


import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component(service=WorkflowProcess.class,immediate=true,enabled=true,property="process.label=Article19971014")
public class Article implements WorkflowProcess{
    private final Logger log=LoggerFactory.getLogger(Article.class);
    @Override
    public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap) throws WorkflowException {
        
        String payloadType=workItem.getWorkflowData().getPayloadType();
        log.info("{}: payload path: {}",payloadType);

        if(payloadType.equals("JCR_PATH"))
        {
            String path=workItem.getWorkflowData().getPayload().toString();
            log.info("{}: payload path : {}",path);
        }
    }

}

