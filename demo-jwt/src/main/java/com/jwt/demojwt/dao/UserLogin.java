package com.jwt.demojwt.dao;

import com.jwt.demojwt.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/* *
 * @ProjectName:    demo-jwt
 * @Package:        com.jwt.demojwt.dao
 * @ClassName:      UserLogin
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/9/5
 * @Version:    1.0
 */
@Mapper
@Repository
public interface UserLogin {

    /* *
     * 功能描述: <br>
     *     用户注册
     * 〈〉
     * @Param:
     * @Return:
     * @Author: xiaoqiang
     * @Date: 2019/9/5
     */

    void addUser(User user);

    /* *
     * 功能描述: <br>
     *     用户登录
     * 〈〉
     * @Param:
     * @Return:
     * @Author: xiaoqiang
     * @Date: 2019/9/5
     */
    User UserLogin(User user);

}
