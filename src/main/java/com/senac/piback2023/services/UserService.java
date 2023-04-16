package com.senac.piback2023.services;

import com.senac.piback2023.dtos.UserDTO;
import com.senac.piback2023.models.UserModel;
import com.senac.piback2023.repositories.IUserRepository;
import com.senac.piback2023.services.utils.IMCCalculationUtil;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    //region INJECTIONS
    @Autowired
    IUserRepository iUserRepository;
    //endregion

    //region METHODS
    @Modifying
    @Transactional
    public UserModel save(UserDTO userDTO) {
        UserModel userModel = new UserModel();
        userModel.set_userIMC(
                IMCCalculationUtil.calculate(
                        userModel.get_userWeight(),
                        userModel.get_userHeight()
                )
        );
        BeanUtils.copyProperties(userDTO, userModel);

        return iUserRepository.save(userModel);
    }

    public Optional<UserModel> findById(UUID userId) {
        if (iUserRepository.findById(userId).isPresent()) {
            return iUserRepository.findById(userId);
        }
        return Optional.empty();
    }

    public Optional<UserModel> findByEmail(String userEmail) {
        if (iUserRepository.findByEmail(userEmail).isPresent()) {
            return iUserRepository.findByEmail(userEmail);
        }
        return Optional.empty();
    }

//    public Optional<UserModel> update(UserModel userModel) {
//        if (iUserRepository.findByEmail(userModel.get_userEmail()).isPresent()) {
//
//            findByEmail(userModel.get_userEmail()).get();
//        }
//        return Optional.empty();
//    }

    public Boolean delete(UserModel userModel) {
        if (iUserRepository.existsById(userModel.getId())) {
            iUserRepository.delete(userModel);
            return true;
        }
        return false;
    }

    public Boolean deleteById(UUID userId) {
        if (iUserRepository.existsById(userId)) {
            iUserRepository.deleteById(userId);
            return true;
        }
        return false;
    }
    //endregion
}
