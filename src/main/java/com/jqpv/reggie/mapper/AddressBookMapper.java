package com.jqpv.reggie.mapper;

import com.jqpv.reggie.entity.AddressBook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 晚安
* @description 针对表【address_book(地址管理)】的数据库操作Mapper
* @createDate 2023-04-05 21:30:06
* @Entity com.jqpv.reggie.entity.AddressBook
*/
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {

}




