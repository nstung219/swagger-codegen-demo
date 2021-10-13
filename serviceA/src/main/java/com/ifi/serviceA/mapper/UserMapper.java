package com.ifi.serviceA.mapper;

import com.ifi.codegen.server.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    User clientToServerUserMapper(com.ifi.codegen.client.model.User user);
    com.ifi.codegen.client.model.User serverToClientMapper(User user);
}
