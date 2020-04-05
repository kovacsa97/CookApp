package com.example.cookapp.presenters;

import com.example.cookapp.interactors.DatabaseInteractor;
import com.example.cookapp.interactors.WebInteractor;
import com.example.cookapp.models.RecipeModel;

import java.util.List;

import javax.inject.Inject;

public class RecipeListPresenter {
    List<RecipeModel> webRecipes;
    List<RecipeModel> databaseRecipes;

    @Inject
    DatabaseInteractor databaseInteractor;

    @Inject
    WebInteractor webInteractor;
}
