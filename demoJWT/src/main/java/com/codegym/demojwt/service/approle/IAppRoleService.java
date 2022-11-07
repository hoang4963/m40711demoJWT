package com.codegym.demojwt.service.approle;

import com.codegym.demojwt.model.AppRole;
import com.codegym.demojwt.service.IGeneralService;

public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}
