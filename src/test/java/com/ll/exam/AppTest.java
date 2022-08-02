package com.ll.exam;

import com.ll.exam.article.controller.ArticleController;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    public void Test() {
        int rs = 10 + 20;

        assertThat(rs).isEqualTo(30);
    }
    @Test
    public void ioc__articleController() {
        ArticleController articleController = Con.getArticleController();

        assertThat(articleController).isNotNull();
    }
}
