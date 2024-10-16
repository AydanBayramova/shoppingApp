package az.edu.shopping.shoppingapp.model.mapper;

import az.edu.shopping.shoppingapp.domain.entity.UserEntity;
import az.edu.shopping.shoppingapp.model.dto.UserRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserRequest userEntityToUserRequest(UserEntity user);

    UserEntity userRequestToUserEntity(UserRequest userRequest);

    List<UserEntity> userRequestToUserEntityList(List<UserRequest> userRequestList);

    List<UserRequest> userEntityListToUserRequestList(List<UserEntity> userEntityList);
}
