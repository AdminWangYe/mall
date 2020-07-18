package com.uestc.mall.dao;

import com.uestc.mall.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: yyWang
 * @create: 2020/7/6
 * @description: 后台用户与角色管理自定义DAO
 */

public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
