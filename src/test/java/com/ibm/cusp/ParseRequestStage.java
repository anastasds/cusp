/**
 * BEGIN_COPYRIGHT
 *
 * IBM Confidential
 * OCO Source Materials
 *
 * 5727-I17
 * (C) Copyright IBM Corp. 2020 All Rights Reserved.
 *
 * The source code for this program is not published or otherwise
 * divested of its trade secrets, irrespective of what has been
 * deposited with the U.S. Copyright Office.
 *
 * END_COPYRIGHT
 */
package com.ibm.cusp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.cusp.graph.stages.AbstractStage;

class ParseRequestStage extends AbstractStage<String, String> {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String name() {
        return WidgetStages.PARSE_REQUEST;
    }

    @Override
    public String execute(String input) throws Exception {
        logger.info("parsing query");
        return "parsed " + input;
    }
}
