package com.nitin.restaurant.mappers;

import com.nitin.restaurant.domain.ReviewCreateUpdateRequest;
import com.nitin.restaurant.domain.dtos.ReviewCreateUpdateRequestDto;
import com.nitin.restaurant.domain.dtos.ReviewDto;
import com.nitin.restaurant.domain.entities.Review;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper {

    ReviewCreateUpdateRequest toReviewCreateUpdateRequest(ReviewCreateUpdateRequestDto dto);

    ReviewDto toDto(Review review);

}
