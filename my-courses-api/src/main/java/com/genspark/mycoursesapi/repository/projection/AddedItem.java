package com.genspark.mycoursesapi.repository.projection;

import java.time.LocalDateTime;

/**
 * @author elvisespinoza
 */

public interface AddedItem {
    String getName();
    String getQuantity();
    LocalDateTime getAddedTime();
}
