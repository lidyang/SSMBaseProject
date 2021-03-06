package com.ldy.programmer.dao.admin;

import java.util.List;
import java.util.Map;

import com.ldy.programmer.entity.admin.Menu;
import com.ldy.programmer.entity.admin.User;

public interface MenuDao {
	
	
	int add(Menu menu);
	
	int edit(Menu menu);
	
	int delete(long id);
	
	List<Menu> findList(Map queryMap);
	
	List<Menu> findTopList();
	
	List<Menu> findChildernList(Long id);
	
	List<Menu> findListByIds(String menuIds);
	
	

}
