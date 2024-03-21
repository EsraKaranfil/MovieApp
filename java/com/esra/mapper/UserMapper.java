package com.esra.mapper;

import com.esra.dto.request.RegisterRequestDto;
import com.esra.dto.request.UserUpdateRequestDto;
import com.esra.dto.response.LoginResponseDto;
import com.esra.dto.response.RegisterResponseDto;
import com.esra.entity.User;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    LoginResponseDto fromUserToLoginResponseDto(final User user);

    User fromRegisterRequestDtoToUser(final RegisterRequestDto dto);

    RegisterResponseDto fromUserToRegisterResponseDto(final User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserFromDto(UserUpdateRequestDto dto, @MappingTarget User user);
}
