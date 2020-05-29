// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import java.util.List;

/**
 * A helper Field model to build a complex field which uses {@code SearchFieldDataType.EDM_COMPLEX_TYPE} or
 * collection of {@code SearchFieldDataType.EDM_COMPLEX_TYPE}.
 */
public class ComplexField extends SearchFieldBase {
    private List<SearchField> fields;

    /**
     * Initializes a new instance of the {@link ComplexField} class.
     *
     * @param name The name of the field, which must be unique within the index or parent field.
     * @param collection Whether the field is a collection of strings.
     */
    public ComplexField(String name, boolean collection) {
        super(name, collection ? SearchFieldDataType.collection(SearchFieldDataType.COMPLEX)
            : SearchFieldDataType.COMPLEX);
    }

    /**
     * Gets a collection of {@link SimpleField} or {@link ComplexField} child fields.
     *
     * @return The list of sub-fields.
     */
    public List<SearchField> getFields() {
        return fields;
    }

    /**
     * Sets a collection of {@link SimpleField} or {@link ComplexField} child fields.
     *
     * @param fields The list of sub-fields.
     * @return The {@link ComplexField} object itself.
     */
    public ComplexField setFields(List<SearchField> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Convert ComplexField to {@link SearchField}.
     *
     * @return The {@link SearchField} object.
     */
    public SearchField build() {
        return new SearchField().setName(super.getName())
            .setType(super.getDataType())
            .setFields(fields);
    }
}
