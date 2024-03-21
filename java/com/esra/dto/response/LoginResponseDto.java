package com.esra.dto.response;

import com.esra.utility.EStatus;
import com.esra.utility.EUserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponseDto {
    String email;
    String password;
    EStatus status;
    EUserType userType;
}
