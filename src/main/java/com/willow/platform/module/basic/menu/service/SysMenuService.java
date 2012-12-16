/**
 * 版权声明：厦门中图壹购信息技术有限公司 版权所有 违者必究 2012 
 * 日    期：12-12-12
 */
package com.willow.platform.module.basic.menu.service;

import com.willow.platform.core.base.dao.BaseDao;
import com.willow.platform.core.base.service.BaseService;
import com.willow.platform.module.basic.menu.dao.SysMenuDao;
import com.willow.platform.module.basic.menu.domain.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <pre>
 * 业务类
 * </pre>
 *
 * @author 朱贤俊
 * @version 1.00
 */
@Service
public class SysMenuService extends BaseService<SysMenu> {
    @Autowired
    private SysMenuDao sysMenuDao;

    @Override
    public BaseDao<SysMenu> getDao() {
        return sysMenuDao;
    }

    public void setSysMenuDao(SysMenuDao sysMenuDao) {
        this.sysMenuDao = sysMenuDao;
    }
}
