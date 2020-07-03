package top.glkj.common.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author : null
 * @date : 2020/7/4 0:36
 * @Description :
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
