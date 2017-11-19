/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Category;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class CategoryService extends AbstractFacade<Category> {

    public CategoryService() {
        super(Category.class);
    }

    public void initDB() {
        addCategory("Computer");
        addCategory("Mobile Phone");
        addCategory("Television");
        addCategory("Printer");
        addCategory("Camera");
    }

    public void addCategory(String name) {
        Category category = new Category();
        category.setName(name);
        create(category);
    }

}
