package com.exemplary.ecommerce.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

@Component(modules = AppModule.class)
@Singleton
public interface AppModuleComponent extends AppFragments,AppDependencyClasses{
}
