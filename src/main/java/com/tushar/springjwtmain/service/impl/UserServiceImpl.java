package com.tushar.springjwtmain.service.impl;

import com.tushar.springjwtmain.Utils.BaseResponseDto;
import com.tushar.springjwtmain.dtos.UserDto;
import com.tushar.springjwtmain.repository.RoleRepository;
import com.tushar.springjwtmain.repository.UserRepository;
import com.tushar.springjwtmain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository _userRepository;
    private final RoleRepository _roleRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        _userRepository = userRepository;
        _roleRepository = roleRepository;
    }

    @Override
    public BaseResponseDto registerAccount(UserDto userDto) {
        BaseResponseDto response = new BaseResponseDto();
        return null;
    }


    private void validateAccount(UserDto userDto) {
        if(ObjectUtils.isEmpty(userDto)) {

        }
    }
}
