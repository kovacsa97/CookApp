package com.example.cookapp;

import com.example.cookapp.interactors.DatabaseInteractor;
import com.example.cookapp.interactors.WebInteractor;
import com.example.cookapp.presenters.RecipeDetailsPresenter;
import com.example.cookapp.presenters.RecipeListPresenter;
import com.example.cookapp.views.RecipeDetailsActivity;
import com.example.cookapp.views.RecipeListActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { AppModule.class })
public interface AppComponent {
    void inject(RecipeListActivity bookListActivity);
    void inject(RecipeListPresenter bookListPresenter);
    void inject(RecipeDetailsActivity bookDetailActivity);
    void inject(RecipeDetailsPresenter bookDetailPresenter);
    void inject(DatabaseInteractor databaseRepository);
    void inject(WebInteractor webInteractor);

}
