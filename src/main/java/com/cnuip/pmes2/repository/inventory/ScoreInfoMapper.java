package com.cnuip.pmes2.repository.inventory;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.cnuip.pmes2.domain.inventory.ScoreInfo;

/**
* Create By Crixalis:
* 2018年3月3日 下午2:35:11
*/
@Repository
public interface ScoreInfoMapper {

	@Select("SELECT * FROM st_scoreinfo WHERE creatTime >= #{lastUpdateTime} ORDER BY creatTime ASC LIMIT ${start},${limit}")
	List<ScoreInfo> findAfterTime(@Param("lastUpdateTime") Date lastUpdateTime, @Param("start") int start, @Param("limit") int limit);
	
	@Select("SELECT count(*) FROM st_scoreinfo WHERE creatTime >= #{lastUpdateTime}")
	Integer getTotal(@Param("lastUpdateTime") Date lastUpdateTime);

	@Select("SELECT * FROM st_scoreinfo WHERE an = #{an} ORDER BY creatTime DESC")
	List<ScoreInfo> findByAn(@Param("an")String an);

}
