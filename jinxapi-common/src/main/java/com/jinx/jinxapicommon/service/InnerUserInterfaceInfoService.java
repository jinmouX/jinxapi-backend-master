package com.jinx.jinxapicommon.service;

/**
 * 内部用户接口信息服务
 *
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

    /**
     * 是否还有调用此时
     * @return
     */
    boolean checkCallNum(long interfaceInfoId,long userId);
}
