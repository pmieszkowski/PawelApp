package com.example.student7.pawelapp.ItemView;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.student7.pawelapp.R;
import com.example.student7.pawelapp.data.Recipe;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

@EViewGroup(R.layout.recipe_item_view)
public class RecipeItemView extends RelativeLayout {

    @ViewById
    TextView title;

    @ViewById
    TextView introduction;

    public RecipeItemView(Context context) {
        super(context);
    }

    public void bind(Recipe recipe) {
        title.setText(recipe.title);
        introduction.setText(recipe.introduction);
    }
    //domyślnie obrazek zdefiniowany w layoucie
}