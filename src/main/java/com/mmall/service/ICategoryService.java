package com.mmall.service;

import com.mmall.commom.ServerResponse;
import com.mmall.pojo.Category;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by xuebing on 2017/7/10.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(HttpSession session, Integer categoryId, String CategoryName);

    ServerResponse<List<Category>> getChildParallelCategory(Integer catogoryId);

    ServerResponse selectCategoryAndChildrenById(Integer catogoryId);
}
