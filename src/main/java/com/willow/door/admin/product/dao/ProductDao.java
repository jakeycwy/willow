/**
* 版权声明：贤俊工作室 版权所有 违者必究
* 日    期：2012-12-21
*/
package com.willow.door.admin.product.dao;

import com.willow.platform.core.base.dao.BaseDao;
import com.willow.door.admin.product.domain.Product;
import com.willow.door.admin.product.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

/**
 * <pre>
 *   产品信息持久层
 * </pre>
 *
 * @author 朱贤俊
 * @version 1.0
 */
@Repository
public class ProductDao extends BaseDao<Product> {
    @Override
    public Class getMapperClass() {
    return ProductMapper.class;
    }
}
