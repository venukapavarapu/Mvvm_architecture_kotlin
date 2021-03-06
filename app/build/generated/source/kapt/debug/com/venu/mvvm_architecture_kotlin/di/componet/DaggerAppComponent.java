// Generated by Dagger (https://dagger.dev).
package com.venu.mvvm_architecture_kotlin.di.componet;

import androidx.lifecycle.ViewModel;
import com.google.gson.Gson;
import com.venu.mvvm_architecture_kotlin.MainActivity;
import com.venu.mvvm_architecture_kotlin.MainActivity_MembersInjector;
import com.venu.mvvm_architecture_kotlin.MyApp;
import com.venu.mvvm_architecture_kotlin.MyApp_MembersInjector;
import com.venu.mvvm_architecture_kotlin.data.api.ApiService;
import com.venu.mvvm_architecture_kotlin.data.room.dao.VersionsDao;
import com.venu.mvvm_architecture_kotlin.data.room.db.DBHelper;
import com.venu.mvvm_architecture_kotlin.di.modules.ActivityModule_ContributeMainActivity;
import com.venu.mvvm_architecture_kotlin.di.modules.ApiModule;
import com.venu.mvvm_architecture_kotlin.di.modules.ApiModule_ProvideCache$app_debugFactory;
import com.venu.mvvm_architecture_kotlin.di.modules.ApiModule_ProvideGson$app_debugFactory;
import com.venu.mvvm_architecture_kotlin.di.modules.ApiModule_ProvideMovieApiService$app_debugFactory;
import com.venu.mvvm_architecture_kotlin.di.modules.ApiModule_ProvideOkhttpClient$app_debugFactory;
import com.venu.mvvm_architecture_kotlin.di.modules.ApiModule_ProvideRetrofit$app_debugFactory;
import com.venu.mvvm_architecture_kotlin.di.modules.AppExecutors;
import com.venu.mvvm_architecture_kotlin.di.modules.AppExecutors_Factory;
import com.venu.mvvm_architecture_kotlin.di.modules.DBModule;
import com.venu.mvvm_architecture_kotlin.di.modules.DBModule_ProvideDatabase$app_debugFactory;
import com.venu.mvvm_architecture_kotlin.di.modules.DBModule_ProvideVersionsDaoFactory;
import com.venu.mvvm_architecture_kotlin.ui.acitivities.UserRepository;
import com.venu.mvvm_architecture_kotlin.ui.acitivities.UserRepository_Factory;
import com.venu.mvvm_architecture_kotlin.ui.viewmodels.UserViewModel;
import com.venu.mvvm_architecture_kotlin.ui.viewmodels.UserViewModel_Factory;
import com.venu.mvvm_architecture_kotlin.viewmodels.ViewModelFactory;
import com.venu.mvvm_architecture_kotlin.viewmodels.ViewModelFactory_Factory;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityModule_ContributeMainActivity.MainActivitySubcomponent.Factory> mainActivitySubcomponentFactoryProvider;

  private Provider<AppExecutors> appExecutorsProvider;

  private Provider<Gson> provideGson$app_debugProvider;

  private Provider<MyApp> applicationProvider;

  private Provider<Cache> provideCache$app_debugProvider;

  private Provider<OkHttpClient> provideOkhttpClient$app_debugProvider;

  private Provider<Retrofit> provideRetrofit$app_debugProvider;

  private Provider<ApiService> provideMovieApiService$app_debugProvider;

  private Provider<DBHelper> provideDatabase$app_debugProvider;

  private Provider<VersionsDao> provideVersionsDaoProvider;

  private Provider<UserRepository> userRepositoryProvider;

  private Provider<UserViewModel> userViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<ViewModelFactory> viewModelFactoryProvider;

  private DaggerAppComponent(ApiModule apiModuleParam, DBModule dBModuleParam,
      MyApp applicationParam) {

    initialize(apiModuleParam, dBModuleParam, applicationParam);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return Collections.<Class<?>, Provider<AndroidInjector.Factory<?>>>singletonMap(MainActivity.class, (Provider) mainActivitySubcomponentFactoryProvider);}

  private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

  @SuppressWarnings("unchecked")
  private void initialize(final ApiModule apiModuleParam, final DBModule dBModuleParam,
      final MyApp applicationParam) {
    this.mainActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeMainActivity.MainActivitySubcomponent.Factory>() {
      @Override
      public ActivityModule_ContributeMainActivity.MainActivitySubcomponent.Factory get() {
        return new MainActivitySubcomponentFactory();}
    };
    this.appExecutorsProvider = DoubleCheck.provider(AppExecutors_Factory.create());
    this.provideGson$app_debugProvider = DoubleCheck.provider(ApiModule_ProvideGson$app_debugFactory.create(apiModuleParam));
    this.applicationProvider = InstanceFactory.create(applicationParam);
    this.provideCache$app_debugProvider = DoubleCheck.provider(ApiModule_ProvideCache$app_debugFactory.create(apiModuleParam, (Provider) applicationProvider));
    this.provideOkhttpClient$app_debugProvider = DoubleCheck.provider(ApiModule_ProvideOkhttpClient$app_debugFactory.create(apiModuleParam, provideCache$app_debugProvider));
    this.provideRetrofit$app_debugProvider = DoubleCheck.provider(ApiModule_ProvideRetrofit$app_debugFactory.create(apiModuleParam, provideGson$app_debugProvider, provideOkhttpClient$app_debugProvider));
    this.provideMovieApiService$app_debugProvider = DoubleCheck.provider(ApiModule_ProvideMovieApiService$app_debugFactory.create(apiModuleParam, provideRetrofit$app_debugProvider));
    this.provideDatabase$app_debugProvider = DoubleCheck.provider(DBModule_ProvideDatabase$app_debugFactory.create(dBModuleParam, applicationProvider));
    this.provideVersionsDaoProvider = DoubleCheck.provider(DBModule_ProvideVersionsDaoFactory.create(dBModuleParam, provideDatabase$app_debugProvider));
    this.userRepositoryProvider = DoubleCheck.provider(UserRepository_Factory.create(appExecutorsProvider, provideMovieApiService$app_debugProvider, provideVersionsDaoProvider));
    this.userViewModelProvider = UserViewModel_Factory.create(userRepositoryProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider = MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(1).put(UserViewModel.class, (Provider) userViewModelProvider).build();
    this.viewModelFactoryProvider = DoubleCheck.provider(ViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
  }

  @Override
  public void inject(MyApp app) {
    injectMyApp(app);}

  private MyApp injectMyApp(MyApp instance) {
    MyApp_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private MyApp application;

    @Override
    public Builder application(MyApp application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, MyApp.class);
      return new DaggerAppComponent(new ApiModule(), new DBModule(), application);
    }
  }

  private final class MainActivitySubcomponentFactory implements ActivityModule_ContributeMainActivity.MainActivitySubcomponent.Factory {
    @Override
    public ActivityModule_ContributeMainActivity.MainActivitySubcomponent create(
        MainActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new MainActivitySubcomponentImpl(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl implements ActivityModule_ContributeMainActivity.MainActivitySubcomponent {
    private MainActivitySubcomponentImpl(MainActivity arg0) {

    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);}

    private MainActivity injectMainActivity(MainActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      MainActivity_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
      return instance;
    }
  }
}
