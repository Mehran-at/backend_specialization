package week2.exercise5;

import week2.exercise1.Article;

import java.util.ArrayList;
import java.util.List;

public class Editor {


    public List<Article> writeMagazine(){
        List<Article> articles = new ArrayList<>();
        Article one = new Article("One", "OneText");
        Article two = new Article("Two", "TwoText");
        Article three = new Article("Three", "ThreeText");
        articles.add(one);
        articles.add(two);
        articles.add(three);
        return articles;

        }

    }

