package com.xianyu.yixian_client.Repository;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.xianyu.yixian_client.Model.Repository.Repository;

import javax.inject.Inject;

/**
 * @ProjectName: YiXian_Client
 * @Package: com.xianyu.yixian_client.repository
 * @ClassName: RepositoryViewModel
 * @Description: java类作用描述
 * @Author: Jianxian
 * @CreateDate: 2020/12/31 8:36
 * @UpdateUser: Jianxian
 * @UpdateDate: 2020/12/31 8:36
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class RepositoryViewModel extends ViewModel {
    MutableLiveData<String> message = new MutableLiveData<>();
    Repository repository;
    @Inject
    public RepositoryViewModel(Repository repository){
        this.repository = repository;
    }
}
