package com.youtube.customsearchapi.validator;

import com.youtube.customsearchapi.model.Items;

public interface MetaDataValidator {
    ValidationResult validate(Items items);
}
