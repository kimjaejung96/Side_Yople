package com.map.mutual.side.review.repository.dsl;

import com.map.mutual.side.common.exception.YOPLEServiceException;
import com.map.mutual.side.review.model.dto.ReviewDto;

import java.util.List;

/**
 * fileName       : ReviewRepoDSL
 * author         : kimjaejung
 * createDate     : 2022/04/12
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/04/12        kimjaejung       최초 생성
 *
 */
public interface ReviewRepoDSL {
    ReviewDto.ReviewWithInviterDto findByReviewWithInviter(Long reviewId, Long worldId) throws YOPLEServiceException;
    String findByReviewOwnerFcmToken(Long reviewId);
    List<ReviewDto.MyReview> findMyReviewsBySuid();
}
