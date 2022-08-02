package com.ll.exam;

import com.ll.exam.annotation.Controller;
import com.ll.exam.article.controller.ArticleController;
import com.ll.exam.home.controller.HomeController;
import javassist.tools.reflect.Reflection;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Container {
    private static final HomeController homeController;

    private static final ArticleController articleController;
    static {
        homeController = new HomeController();
        articleController = new ArticleController();
    }
    public static ArticleController getArticleController() {
        return articleController;
    }

    public static List<String> getControllerNames() {
        List<String> names = new ArrayList<>();

        Reflections ref = new Reflections("com.ll.exam");
        for (Class<?> cls : ref.getTypesAnnotatedWith(Controller.class)) {
            String name = cls.getSimpleName(); // HomeController
            name = name.replace("Controller", ""); // Home
            name = Ut.str.decapitalize(name); // home

            names.add(name.replace("Controller", name));
        }

        return names;
    }

    public static HomeController getHomeController() {
        return homeController;
    }
}
