package com.xianyu.yixian_client.Model.Repository;

import com.xianyu.yixian_client.Model.Room.Entity.User;

import java.util.List;

import io.reactivex.Single;

/**
 * @ProjectName: YiXian_Client
 * @Package: com.xianyu.yixian_client.Model.repository
 * @ClassName: ILocalRepository
 * @Description: java类作用描述
 * @Author: Jianxian
 * @CreateDate: 2020/12/24 3:28
 * @UpdateUser: Jianxian
 * @UpdateDate: 2020/12/24 3:28
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
interface ILocalRepository {
    public void insertUser(User user);

    public Single<List<User>> queryUsers();

    public void deleteUser(User user);

    public void updateUser(User user);

    public void clearAllUser(User user);
}
