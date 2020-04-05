package com.example.cookapp.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cookapp.R;
import com.example.cookapp.presenters.RecipeDetailsPresenter;

import javax.inject.Inject;

public class RecipeDetailsActivity extends AppCompatActivity implements RecipeDetailsViewInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);
    }

    @Inject
    RecipeDetailsPresenter recipeDetailsPresenter;

    @Override
    public void tmp() {

    }
}
