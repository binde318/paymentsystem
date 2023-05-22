package com.Binde.rewardyourteacher.services;


import com.Binde.rewardyourteacher.dto.SchoolResponse;
import com.Binde.rewardyourteacher.entity.School;

import java.util.List;

public interface SchoolService {
    List<SchoolResponse> getAllSchools(String schoolName, int pageNumber, int pageSize, String sortProperty);

    int getSchoolCount();

    String saveSchool(List<School> schoolEntities);
}
