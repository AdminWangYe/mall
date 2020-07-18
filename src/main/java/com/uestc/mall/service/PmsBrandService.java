package com.uestc.mall.service;

import com.uestc.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author Chacone_Lab
 * 品牌管理服务类
 */

public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id,PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
