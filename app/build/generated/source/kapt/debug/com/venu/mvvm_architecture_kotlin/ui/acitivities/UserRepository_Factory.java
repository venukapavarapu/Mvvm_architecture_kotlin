// Generated by Dagger (https://dagger.dev).
package com.venu.mvvm_architecture_kotlin.ui.acitivities;

import com.venu.mvvm_architecture_kotlin.data.api.ApiService;
import com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao;
import com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao;
import com.venu.mvvm_architecture_kotlin.di.modules.AppExecutors;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<UserDao> userDaoProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<SampleDao> sampleDaoProvider;

  public UserRepository_Factory(Provider<AppExecutors> appExecutorsProvider,
      Provider<UserDao> userDaoProvider, Provider<ApiService> apiServiceProvider,
      Provider<SampleDao> sampleDaoProvider) {
    this.appExecutorsProvider = appExecutorsProvider;
    this.userDaoProvider = userDaoProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.sampleDaoProvider = sampleDaoProvider;
  }

  @Override
  public UserRepository get() {
    return new UserRepository(appExecutorsProvider.get(), userDaoProvider.get(), apiServiceProvider.get(), sampleDaoProvider.get());
  }

  public static UserRepository_Factory create(Provider<AppExecutors> appExecutorsProvider,
      Provider<UserDao> userDaoProvider, Provider<ApiService> apiServiceProvider,
      Provider<SampleDao> sampleDaoProvider) {
    return new UserRepository_Factory(appExecutorsProvider, userDaoProvider, apiServiceProvider, sampleDaoProvider);
  }

  public static UserRepository newInstance(AppExecutors appExecutors, UserDao userDao,
      ApiService apiService, SampleDao sampleDao) {
    return new UserRepository(appExecutors, userDao, apiService, sampleDao);
  }
}
