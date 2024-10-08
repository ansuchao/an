package com.wms.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wms.wms.entity.Goodstype;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.wms.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wms
 * @since 2023-02-08
 */
@Mapper
public interface GoodstypeMapper extends BaseMapper<Goodstype> {
    IPage pageC1(IPage<Goodstype> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}
