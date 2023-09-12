package com.jinx.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jinx.jinxapicommon.model.entity.InterfaceInfo;

/**
 * 接口信息服务
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
