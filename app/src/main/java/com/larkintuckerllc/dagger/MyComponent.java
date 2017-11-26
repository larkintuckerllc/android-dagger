package com.larkintuckerllc.dagger;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = MyModule.class)
interface MyComponent {

    void inject(MainActivity mainActivity);

}
