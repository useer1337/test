package com.example.demo.soapclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Slf4j
public class UserClient extends WebServiceGatewaySupport {

//    public GetUserResponseType getUser(String snils){
//
//        // D468E929-A94E-4F16-A7D2-DB414EC53071
//
//        GetUserRequestType request = new GetUserRequestType();
//        request.setSNILS(snils);
//        request.setToken("D468E929-A94E-4F16-A7D2-DB414EC53071");
//        log.info(snils);
//
//        GetUserResponseType response = (GetUserResponseType) getWebServiceTemplate()
//                .marshalSendAndReceive("https://cas-test.hostco.ru/RegUserService/services/RegUserService",
//                        request);
//
//        log.info(response.getLogin().getFirstname());
//
//        return response;
//    }
}
