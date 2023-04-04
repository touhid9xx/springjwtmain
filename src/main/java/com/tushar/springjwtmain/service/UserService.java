package com.tushar.springjwtmain.service;

import com.tushar.springjwtmain.Utils.BaseResponseDto;
import com.tushar.springjwtmain.dtos.UserDto;

public interface UserService {
  BaseResponseDto registerAccount(UserDto userDto);
}
