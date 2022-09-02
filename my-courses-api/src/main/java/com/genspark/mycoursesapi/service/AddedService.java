package com.genspark.mycoursesapi.service;

import com.genspark.mycoursesapi.model.Added;
import com.genspark.mycoursesapi.repository.projection.AddedItem;

import java.util.List;

/**
 * @author elvisespinoza
 */

public interface AddedService {
    Added saveAdded(Added added);

    List<AddedItem> findAddedItemsOfUser(Long userId);
}
