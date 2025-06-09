package com.wangcm.mianshi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangcm.mianshi.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户数据库操作
 *
 * @author <a href="https://github.com/wangcongmao">wangcm</a>
 * @from <a href="https://github.com/wangcongmao"></a>
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




