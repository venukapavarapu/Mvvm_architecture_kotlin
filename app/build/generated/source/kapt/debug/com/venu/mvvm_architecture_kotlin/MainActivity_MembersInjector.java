// Generated by Dagger (https://dagger.dev).
package com.venu.mvvm_architecture_kotlin;

import com.venu.mvvm_architecture_kotlin.viewmodels.ViewModelFactory;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public MainActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new MainActivity_MembersInjector(androidInjectorProvider, viewModelFactoryProvider);}

  @Override
  public void injectMembers(MainActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(MainActivity instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
