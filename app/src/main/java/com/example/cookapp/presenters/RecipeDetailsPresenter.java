package com.example.cookapp.presenters;

import com.example.cookapp.interactors.DatabaseInteractor;
import com.example.cookapp.interactors.WebInteractor;
import com.example.cookapp.models.RecipeModel;

import javax.inject.Inject;

public class RecipeDetailsPresenter {
    RecipeModel recipe;

    @Inject
    DatabaseInteractor databaseInteractor;

}

