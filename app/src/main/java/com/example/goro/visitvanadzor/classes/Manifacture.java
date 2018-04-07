package com.example.goro.visitvanadzor.classes;

import android.widget.Button;
import android.widget.RatingBar;

/**
 * Created by Goro on 03.04.2018.
 */

public class Manifacture {
    private String title;
    private int img;
    private double longitude;
    private double langitude;
    private String description;

    private int imageCover;
    private String coverText;
    private int imageSamvelKhalatyan;
    private String coverText2;
    private String one;
    private int imageOne;
    private String two;
    private int imageTwo;
    private String three;
    private int imageThree;
    private String four;
    private int imageFour;
    private String five;
    private int imageFive;
    private String six;
    private int imageSix;
    private String seven;
    private int imageSeven;

    private int coverImg;
    private String coverString;

    public Manifacture(int coverImg, String coverString) {
        this.coverImg = coverImg;
        this.coverString = coverString;
    }

    public Manifacture(String title, int img, double longitude, double langitude, String description) {
        this.title = title;
        this.img = img;
        this.longitude = longitude;
        this.langitude = langitude;
        this.description = description;
    }

    public Manifacture(String title, int img, int imageCover, String coverText, int imageSamvelKhalatyan,String coverText2, String one,
                       int imageOne, String two, int imageTwo, String three, int imageThree, String four, int imageFour,
                       String five, int imageFive, String six, int imageSix, String seven, int imageSeven) {
        this.title = title;
        this.img = img;
        this.imageCover = imageCover;
        this.coverText = coverText2;
        this.imageSamvelKhalatyan = imageSamvelKhalatyan;
        this.coverText2 =coverText2;
        this.one = one;
        this.imageOne = imageOne;
        this.two = two;
        this.imageTwo = imageTwo;
        this.three = three;
        this.imageThree = imageThree;
        this.four = four;
        this.imageFour = imageFour;
        this.five = five;
        this.imageFive = imageFive;
        this.six = six;
        this.imageSix = imageSix;
        this.seven = seven;
        this.imageSeven = imageSeven;
    }



    public int getImageCover() {
        return imageCover;
    }

    public void setImageCover(int imageCover) {
        this.imageCover = imageCover;
    }

    public String getCoverText() {
        return coverText;
    }

    public void setCoverText(String coverText) {
        this.coverText = coverText;
    }

    public String getCoverText2() {
        return coverText2;
    }

    public void setCoverText2(String coverText2) {
        this.coverText2 = coverText2;
    }

    public int getImageSamvelKhalatyan() {
        return imageSamvelKhalatyan;
    }

    public void setImageSamvelKhalatyan(int imageSamvelKhalatyan) {
        this.imageSamvelKhalatyan = imageSamvelKhalatyan;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public int getImageOne() {
        return imageOne;
    }

    public void setImageOne(int imageOne) {
        this.imageOne = imageOne;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public int getImageTwo() {
        return imageTwo;
    }

    public void setImageTwo(int imageTwo) {
        this.imageTwo = imageTwo;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public int getImageThree() {
        return imageThree;
    }

    public void setImageThree(int imageThree) {
        this.imageThree = imageThree;
    }

    public String getFour() {
        return four;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public int getImageFour() {
        return imageFour;
    }

    public void setImageFour(int imageFour) {
        this.imageFour = imageFour;
    }

    public String getFive() {
        return five;
    }

    public void setFive(String five) {
        this.five = five;
    }

    public int getImageFive() {
        return imageFive;
    }

    public void setImageFive(int imageFive) {
        this.imageFive = imageFive;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public int getImageSix() {
        return imageSix;
    }

    public void setImageSix(int imageSix) {
        this.imageSix = imageSix;
    }

    public String getSeven() {
        return seven;
    }

    public void setSeven(String seven) {
        this.seven = seven;
    }

    public int getImageSeven() {
        return imageSeven;
    }

    public void setImageSeven(int imageSeven) {
        this.imageSeven = imageSeven;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLangitude() {
        return langitude;
    }

    public void setLangitude(double langitude) {
        this.langitude = langitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
