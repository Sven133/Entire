package com.ruoyi.asset.mapper;

import java.util.List;
import com.ruoyi.asset.domain.AppTables;

/**
 * 应用资产Mapper接口
 * 
 * @author Sven
 * @date 2024-11-20
 */
public interface AppTablesMapper 
{
    /**
     * 查询应用资产
     * 
     * @param appId 应用资产主键
     * @return 应用资产
     */
    public AppTables selectAppTablesByAppId(Long appId);

    /**
     * 查询应用资产列表
     * 
     * @param appTables 应用资产
     * @return 应用资产集合
     */
    public List<AppTables> selectAppTablesList(AppTables appTables);

    /**
     * 新增应用资产
     * 
     * @param appTables 应用资产
     * @return 结果
     */
    public int insertAppTables(AppTables appTables);

    /**
     * 修改应用资产
     * 
     * @param appTables 应用资产
     * @return 结果
     */
    public int updateAppTables(AppTables appTables);

    /**
     * 删除应用资产
     * 
     * @param appId 应用资产主键
     * @return 结果
     */
    public int deleteAppTablesByAppId(Long appId);

    /**
     * 批量删除应用资产
     * 
     * @param appIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAppTablesByAppIds(Long[] appIds);
}