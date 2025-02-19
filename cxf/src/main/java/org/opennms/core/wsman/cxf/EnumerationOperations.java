/*
 * Copyright 2015, The OpenNMS Group
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.opennms.core.wsman.cxf;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.soap.Addressing;

import org.xmlsoap.schemas.ws._2004._09.enumeration.Enumerate;
import org.xmlsoap.schemas.ws._2004._09.enumeration.EnumerateResponse;
import org.xmlsoap.schemas.ws._2004._09.enumeration.GetStatus;
import org.xmlsoap.schemas.ws._2004._09.enumeration.GetStatusResponse;
import org.xmlsoap.schemas.ws._2004._09.enumeration.ObjectFactory;
import org.xmlsoap.schemas.ws._2004._09.enumeration.Pull;
import org.xmlsoap.schemas.ws._2004._09.enumeration.PullResponse;
import org.xmlsoap.schemas.ws._2004._09.enumeration.Release;
import org.xmlsoap.schemas.ws._2004._09.enumeration.Renew;
import org.xmlsoap.schemas.ws._2004._09.enumeration.RenewResponse;

/**
 * This port type defines a datasource from which we can enumerate and pull resources.
 *
 * This class is based on the one generated by the cxf-codegen-plugin.
 * See {@link org.xmlsoap.schemas.ws._2004._09.enumeration.DataSource}.
 *
 * @author jwhite
 */
@WebService(targetNamespace = "http://schemas.xmlsoap.org/ws/2004/09/enumeration", name = "EnumerationOperations")
@XmlSeeAlso({ObjectFactory.class, schemas.dmtf.org.wbem.wsman.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Addressing(required = false, enabled = true)
public interface EnumerationOperations {

    @WebMethod(operationName = "Renew")
    @Action(input = "http://schemas.xmlsoap.org/ws/2004/09/enumeration/Renew", output = "http://schemas.xmlsoap.org/ws/2004/09/enumeration/RenewResponse")
    @WebResult(name = "RenewResponse", targetNamespace = "http://schemas.xmlsoap.org/ws/2004/09/enumeration", partName = "Body")
    public RenewResponse renew(
        @WebParam(partName = "Body", name = "Renew", targetNamespace = "http://schemas.xmlsoap.org/ws/2004/09/enumeration")
        Renew body
    );

    @WebMethod(operationName = "Enumerate")
    @Action(input = "http://schemas.xmlsoap.org/ws/2004/09/enumeration/Enumerate", output = "http://schemas.xmlsoap.org/ws/2004/09/enumeration/EnumerateResponse")
    @WebResult(name = "EnumerateResponse", targetNamespace = "http://schemas.xmlsoap.org/ws/2004/09/enumeration", partName = "Body")
    public EnumerateResponse enumerate(
        @WebParam(partName = "Body", name = "Enumerate", targetNamespace = "http://schemas.xmlsoap.org/ws/2004/09/enumeration")
        Enumerate body
    );

    @WebMethod(operationName = "Pull")
    @Action(input = "http://schemas.xmlsoap.org/ws/2004/09/enumeration/Pull", output = "http://schemas.xmlsoap.org/ws/2004/09/enumeration/PullResponse")
    @WebResult(name = "PullResponse", targetNamespace = "http://schemas.xmlsoap.org/ws/2004/09/enumeration", partName = "Body")
    public PullResponse pull(
        @WebParam(partName = "Body", name = "Pull", targetNamespace = "http://schemas.xmlsoap.org/ws/2004/09/enumeration")
        Pull body
    );
    
    @WebMethod(operationName = "Release")
    @Action(input = "http://schemas.xmlsoap.org/ws/2004/09/enumeration/Release", output = "http://schemas.xmlsoap.org/ws/2004/09/enumeration/ReleaseResponse")
    public void releaseOp(
        @WebParam(partName = "Body", name = "Release", targetNamespace = "http://schemas.xmlsoap.org/ws/2004/09/enumeration")
        Release body
    );

    @WebMethod(operationName = "GetStatus")
    @Action(input = "http://schemas.xmlsoap.org/ws/2004/09/enumeration/GetStatus", output = "http://schemas.xmlsoap.org/ws/2004/09/enumeration/GetStatusResponse")
    @WebResult(name = "GetStatusResponse", targetNamespace = "http://schemas.xmlsoap.org/ws/2004/09/enumeration", partName = "Body")
    public GetStatusResponse getStatus(
        @WebParam(partName = "Body", name = "GetStatus", targetNamespace = "http://schemas.xmlsoap.org/ws/2004/09/enumeration")
        GetStatus body
    );
}
