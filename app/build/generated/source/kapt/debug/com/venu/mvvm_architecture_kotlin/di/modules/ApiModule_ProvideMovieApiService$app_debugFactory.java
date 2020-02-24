// Generated by Dagger (https://dagger.dev).
package com.venu.mvvm_architecture_kotlin.di.modules;

import com.venu.mvvm_architecture_kotlin.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideMovieApiService$app_debugFactory implements Factory<ApiService> {
  private final ApiModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvideMovieApiService$app_debugFactory(ApiModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideMovieApiService$app_debug(module, retrofitProvider.get());
  }

  public static ApiModule_ProvideMovieApiService$app_debugFactory create(ApiModule module,
      Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvideMovieApiService$app_debugFactory(module, retrofitProvider);
  }

  public static ApiService provideMovieApiService$app_debug(ApiModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.provideMovieApiService$app_debug(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}