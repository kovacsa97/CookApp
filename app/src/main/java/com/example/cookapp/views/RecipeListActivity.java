package com.example.cookapp.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cookapp.R;
import com.example.cookapp.presenters.RecipeListPresenter;

import javax.inject.Inject;

import dagger.internal.InjectedFieldSignature;

public class RecipeListActivity extends AppCompatActivity implements RecipeListViewInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);
    }

    @Inject
    RecipeListPresenter recipeListPresenter;

    @Override
    public void tmp() {

    }
}
