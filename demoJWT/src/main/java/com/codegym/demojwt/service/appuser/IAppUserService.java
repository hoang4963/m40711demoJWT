package com.codegym.demojwt.service.appuser;

import com.codegym.demojwt.model.AppUser;
import com.codegym.demojwt.model.DTO.ICountRole;
import com.codegym.demojwt.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAppUserService extends IGeneralService<AppUser>, UserDetailsService {
    AppUser findByName(String name);
    Iterable<ICountRole> getRoleNumber();
}
