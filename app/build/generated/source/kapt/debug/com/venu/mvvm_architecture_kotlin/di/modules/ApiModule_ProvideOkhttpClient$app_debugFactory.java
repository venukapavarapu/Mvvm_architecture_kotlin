// Generated by Dagger (https://dagger.dev).
package com.venu.mvvm_architecture_kotlin.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideOkhttpClient$app_debugFactory implements Factory<OkHttpClient> {
  private final ApiModule module;

  private final Provider<Cache> cacheProvider;

  public ApiModule_ProvideOkhttpClient$app_debugFactory(ApiModule module,
      Provider<Cache> cacheProvider) {
    this.module = module;
    this.cacheProvider = cacheProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkhttpClient$app_debug(module, cacheProvider.get());
  }

  public static ApiModule_ProvideOkhttpClient$app_debugFactory create(ApiModule module,
      Provider<Cache> cacheProvider) {
    return new ApiModule_ProvideOkhttpClient$app_debugFactory(module, cacheProvider);
  }

  public static OkHttpClient provideOkhttpClient$app_debug(ApiModule instance, Cache cache) {
    return Preconditions.checkNotNull(instance.provideOkhttpClient$app_debug(cache), "Cannot return null from a non-@Nullable @Provides method");
  }
}
