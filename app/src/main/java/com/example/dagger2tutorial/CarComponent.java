package com.example.dagger2tutorial;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();
    void inject(MainActivity activity);
}
