package com.example.cookapp;

import android.content.Context;

import com.example.cookapp.interactors.DatabaseInteractor;
import com.example.cookapp.interactors.WebInteractor;
import com.example.cookapp.presenters.RecipeDetailsPresenter;
import com.example.cookapp.presenters.RecipeListPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Context context;

    AppModule(Context context){
        this.context = context;
    }

    @Provides
    Context context(){
        return context;
    }

    @Provides
    @Singleton
    RecipeDetailsPresenter recipeDetailsPresenter(){
        return new RecipeDetailsPresenter();
    }

    @Provides
    @Singleton
    RecipeListPresenter recipeListPresenter(){
        return new RecipeListPresenter();
    }

    @Provides
    @Singleton
    DatabaseInteractor databaseInteractor(){
        return new DatabaseInteractor();
    }

    @Provides
    @Singleton
    WebInteractor webInteractor(){
        return new WebInteractor();
    }
}
