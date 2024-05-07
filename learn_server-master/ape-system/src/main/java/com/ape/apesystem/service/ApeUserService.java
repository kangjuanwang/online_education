package com.ape.apesystem.service;

import com.ape.apesystem.domain.ApeUser;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author kangjunxin
 * @version 1.0
 * @description: 用户service
 * @date 2023/8/28 8:45
 */
public interface ApeUserService extends IService<ApeUser> {

    /**
    * @description: 分页查询用户
    * @param: apeUser
    * @return: Page
    * @author kangjunxin
    * @date: 2023/8/28 10:49
    */
    Page<ApeUser> getUserPage(ApeUser apeUser);

}
