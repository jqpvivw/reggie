package com.jqpv.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jqpv.reggie.entity.AddressBook;
import com.jqpv.reggie.service.AddressBookService;
import com.jqpv.reggie.mapper.AddressBookMapper;
import org.springframework.stereotype.Service;

/**
* @author 晚安
* @description 针对表【address_book(地址管理)】的数据库操作Service实现
* @createDate 2023-04-05 21:30:06
*/
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook>
    implements AddressBookService{

}




