package com.genspark.mycoursesapi.service;

import com.genspark.mycoursesapi.model.Added;
import com.genspark.mycoursesapi.repository.AddedRepository;
import com.genspark.mycoursesapi.repository.projection.AddedItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author elvisespinoza
 */

@Service
public class AddedServiceImpl implements AddedService {
    private final AddedRepository addedRepository;

    public AddedServiceImpl(AddedRepository addedRepository) {
        this.addedRepository = addedRepository;
    }

    @Override
    public Added saveAdded(Added added) {
        added.setAddedTime(LocalDateTime.now());
        return addedRepository.save(added);
    }

    @Override
    public List<AddedItem> findAddedItemsOfUser(Long userId) {
        return addedRepository.findAllCoursesOfUser(userId);
    }

}
