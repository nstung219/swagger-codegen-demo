package com.ifi.serviceA.api;

import com.ifi.codegen.server.api.UserApi;
import com.ifi.codegen.client.invoker.ApiClient;
import com.ifi.codegen.server.model.User;
import com.ifi.serviceA.mapper.UserMapper;
//import com.ifi.serviceA.mapper.UserMapperImpl;
import com.ifi.serviceA.mapper.UserMapperImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiImpl implements UserApi {
  @Override
  public ResponseEntity<User> getUserDetailsById(Long userId) {
    ApiClient apiClient = new ApiClient();
    apiClient.setBasePath("http://localhost:8081");
    apiClient.selectHeaderContentType(new String[]{"application/json"});
    com.ifi.codegen.client.api.UserApi userClientApi = new com.ifi.codegen.client.api.UserApi(apiClient);
    com.ifi.codegen.client.model.User user = userClientApi.getUserDetailsById(userId);

    UserMapper mapper = new UserMapperImpl();

    return new ResponseEntity<>(mapper.clientToServerUserMapper(user), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<User> saveUser(User body) {
    ApiClient apiClient = new ApiClient();
    apiClient.setBasePath("http://localhost:8081");
    apiClient.selectHeaderContentType(new String[]{"application/json"});
    com.ifi.codegen.client.api.UserApi userClientApi = new com.ifi.codegen.client.api.UserApi(apiClient);

    UserMapper mapper = new UserMapperImpl();

    com.ifi.codegen.client.model.User user = userClientApi.saveUser(mapper.serverToClientMapper(body));
    return new ResponseEntity<>(body, HttpStatus.OK);
  }
}
