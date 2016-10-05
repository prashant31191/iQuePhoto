package net.iquesoft.iquephoto.model;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

import net.iquesoft.iquephoto.R;

import java.util.Arrays;
import java.util.List;

public class Filter {
    @StringRes
    private int title;

    @DrawableRes
    private int image;

    private boolean selected;
    private ColorMatrix colorMatrix;

    public static List<Filter> getFiltersList() {
        return Arrays.asList(filters);
    }

    private static Filter[] filters = {

            new Filter(R.string.filter_original, R.drawable.original),

            new Filter(R.string.filter_sunny, R.drawable.sunny, new ColorMatrix(new float[]{
                    1.5f, 0, 0, 0, 0,
                    0, 1.5f, 0, 0, 0,
                    0, 0, 1.5f, 0, 0,
                    0, 0, 0, 1, 0})),

            new Filter(R.string.filter_darken, R.drawable.darknen, new ColorMatrix(new float[]{
                    0.5f, 0, 0, 0, 0,
                    0, 0.5f, 0, 0, 0,
                    0, 0, 0.5f, 0, 0,
                    0, 0, 0, 1, 0})),

            new Filter(R.string.filter_darken, R.drawable.darknen, new ColorMatrix(new float[]{
                    2, -1, 0, 0, 0,
                    -1, 2, 0, 0, 0,
                    0, -1, 2, 0, 0,
                    0, 0, 0, 1, 0})),

            new Filter(R.string.filter_purple, R.drawable.purple, new ColorMatrix(new float[]{
                    1, 0, 0, 0, 0,
                    0, 1, 0, 0, 0,
                    0.50f, 0, 1, 0, 0,
                    0, 0, 0, 1, 0})),

            new Filter(R.string.filter_darken, R.drawable.darknen, new ColorMatrix(new float[]{
                    1.5f, 0, 0, 0, -40,
                    0, 1.5f, 0, 0, -40,
                    0, 0, 1.5f, 0, -40,
                    0, 0, 0, 1, 0})),

            /*new Filter(R.string.filter_polaroid, R.drawable.purple, false, new ColorMatrixColorFilter(new ColorMatrix(new float[]{
                    1.438f, -0.062f, -0.062f, 0, 0,
                    -0.122f, 1.378f, -0.122f, 0, 0,
                    -0.016f, -0.016f, 1.483f, 0, 0,
                    -0.03f, 0.05f, -0.02f, 0, 1}))),*/

            new Filter(R.string.filter_purple, R.drawable.purple, new ColorMatrix(new float[]{
                    1, 0, 0, 0.2f, 0,
                    0, 1, 0, 0, 0,
                    0, 0, 1, 0.2f, 0,
                    0, 0, 0, 1, 0})),



            /*new Filter(R.string.filter_morning, R.drawable.buldog, false, new ColorMatrixColorFilter(new ColorMatrix(new float[]{
                    1, 0, 0, 0, 0,
                    0, 1, 0, 0, 0,
                    0, 0, 0, 0, 0,
                    0, 0, 0, 1, 0}))),*/

            new Filter(R.string.filter_lime, R.drawable.lime, new ColorMatrix(new float[]{
                    1, 0, 0, 0, 0,
                    0, 1.65f, 0, 0, 0,
                    0, 0, 0, 0.5f, 0,
                    0, 0, 0, 1, 0})),

            /*new Filter(R.string.filter_goldie, R.drawable.buldog, false, new ColorMatrixColorFilter(new ColorMatrix(new float[]{
                    1, 0.3f, 0, 0, 0,
                    0, 1, 0, 0, 0,
                    0, 0.3f, 0, 0, 0,
                    0, 0, 0, 1, 0}))),*/

            new Filter(R.string.filter_peachy, R.drawable.peachy, new ColorMatrix(new float[]{
                    1, 0, 0, 0, 0,
                    0, 0.5f, 0, 0, 0,
                    0, 0, 0, 0.5f, 0,
                    0, 0, 0, 1, 0})),

            new Filter(R.string.filter_magenta, R.drawable.magenta, new ColorMatrix(new float[]{
                    1, 0, 0, 0, 0,
                    0, 0, 0, 0, 0,
                    0, 0, 1, 1, 0,
                    0, 0, 0, 1, 0})),

            /*new Filter(R.string.filter_sepia, R.drawable.buldog, false, new ColorMatrixColorFilter(new ColorMatrix(new float[]{
                    0.393f, 0.769f, 0.189f, 0, 0,
                    0.349f, 0.686f, 0.168f, 0, 0,
                    0.272f, 0.0534f, 0.131f, 0, 0,
                    0, 0, 0, 1, 0}))),*/

            new Filter(R.string.filter_light_gray, R.drawable.light_grey, new ColorMatrix(new float[]{
                    1, 0, 0, 0, 0,
                    1, 0, 0, 0, 0,
                    1, 0, 0, 0, 0,
                    0, 0, 0, 1, 0})),

            new Filter(R.string.filter_mid_grey, R.drawable.mid_grey, new ColorMatrix(new float[]{
                    0, 1, 0, 0, 0,
                    0, 1, 0, 0, 0,
                    0, 1, 0, 0, 0,
                    0, 0, 0, 1, 0})),

            new Filter(R.string.filter_dark_grey, R.drawable.dark_grey, new ColorMatrix(new float[]{
                    0, 0, 1, 0, 0,
                    0, 0, 1, 0, 0,
                    0, 0, 1, 0, 0,
                    0, 0, 0, 1, 0})),
    };

    private Filter() {

    }

    private Filter(@StringRes int title, @DrawableRes int image) {
        this.title = title;
        this.image = image;
    }

    private Filter(@StringRes int title, @DrawableRes int image, ColorMatrix colorMatrix) {
        this.title = title;
        this.image = image;
        this.colorMatrix = colorMatrix;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public ColorMatrix getColorMatrix() {
        return colorMatrix;
    }

    public void setColorMatrix(ColorMatrix colorMatrix) {
        this.colorMatrix = colorMatrix;
    }
}
