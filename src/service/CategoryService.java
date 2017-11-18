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
public class CategoryService extends AbstractFacade<CategoryService> {

    public CategoryService() {
        super(CategoryService.class);
    }
    
    public void addCategory(String name){
        Category category = new Category();
        category.setName(name);
        create(category);
    }

}
