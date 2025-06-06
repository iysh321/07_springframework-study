package com.jjanggu.sbatis.dao;

import com.jjanggu.sbatis.dto.MenuDto;

import java.util.List;

public interface MenuMapper {
    //반환타입 실행할 sql의 id(sql전달할 데이터)

    List<MenuDto> selectMenuList();
    MenuDto selectMenuByCode(int code);
    int insertMenu(MenuDto menu);
    int updateMenu(MenuDto menu);
    int deleteMenu(String[] codes);
}
