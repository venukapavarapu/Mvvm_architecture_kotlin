// Generated by Dagger (https://dagger.dev).
package com.venu.mvvm_architecture_kotlin.di.modules;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideRetrofit$app_debugFactory implements Factory<Retrofit> {
  private final ApiModule module;

  private final Provider<Gson> gsonProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public ApiModule_ProvideRetrofit$app_debugFactory(ApiModule module, Provider<Gson> gsonProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit$app_debug(module, gsonProvider.get(), okHttpClientProvider.get());
  }

  public static ApiModule_ProvideRetrofit$app_debugFactory create(ApiModule module,
      Provider<Gson> gsonProvider, Provider<OkHttpClient> okHttpClientProvider) {
    return new ApiModule_ProvideRetrofit$app_debugFactory(module, gsonProvider, okHttpClientProvider);
  }

  public static Retrofit provideRetrofit$app_debug(ApiModule instance, Gson gson,
      OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(instance.provideRetrofit$app_debug(gson, okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
