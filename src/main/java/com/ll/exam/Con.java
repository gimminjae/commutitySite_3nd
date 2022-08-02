package com.ll.exam;

import com.ll.exam.article.controller.ArticleController;

public class Con {
    public static ArticleController getArticleController() {
        ArticleController articleController = new ArticleController();
        return articleController;
    }
}
