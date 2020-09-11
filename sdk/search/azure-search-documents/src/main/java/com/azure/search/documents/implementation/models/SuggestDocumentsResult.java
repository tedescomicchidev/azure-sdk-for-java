// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SuggestDocumentsResult model. */
@Immutable
public final class SuggestDocumentsResult {
    /*
     * The sequence of results returned by the query.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<SuggestResult> results;

    /*
     * A value indicating the percentage of the index that was included in the
     * query, or null if minimumCoverage was not set in the request.
     */
    @JsonProperty(value = "@search.coverage", access = JsonProperty.Access.WRITE_ONLY)
    private Double coverage;

    /**
     * Creates an instance of SuggestDocumentsResult class.
     *
     * @param results the results value to set.
     */
    @JsonCreator
    public SuggestDocumentsResult(
            @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    List<SuggestResult> results) {
        this.results = results;
    }

    /**
     * Get the results property: The sequence of results returned by the query.
     *
     * @return the results value.
     */
    public List<SuggestResult> getResults() {
        return this.results;
    }

    /**
     * Get the coverage property: A value indicating the percentage of the index that was included in the query, or null
     * if minimumCoverage was not set in the request.
     *
     * @return the coverage value.
     */
    public Double getCoverage() {
        return this.coverage;
    }
}
