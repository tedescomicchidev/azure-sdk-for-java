// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The BM25Similarity model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.BM25Similarity")
@JsonFlatten
@Fluent
public class BM25Similarity extends Similarity {
    /*
     * This property controls the scaling function between the term frequency
     * of each matching terms and the final relevance score of a document-query
     * pair. By default, a value of 1.2 is used. A value of 0.0 means the score
     * does not scale with an increase in term frequency.
     */
    @JsonProperty(value = "k1")
    private Double k1;

    /*
     * This property controls how the length of a document affects the
     * relevance score. By default, a value of 0.75 is used. A value of 0.0
     * means no length normalization is applied, while a value of 1.0 means the
     * score is fully normalized by the length of the document.
     */
    @JsonProperty(value = "b")
    private Double b;

    /**
     * Get the k1 property: This property controls the scaling function between the term frequency of each matching
     * terms and the final relevance score of a document-query pair. By default, a value of 1.2 is used. A value of 0.0
     * means the score does not scale with an increase in term frequency.
     *
     * @return the k1 value.
     */
    public Double getK1() {
        return this.k1;
    }

    /**
     * Set the k1 property: This property controls the scaling function between the term frequency of each matching
     * terms and the final relevance score of a document-query pair. By default, a value of 1.2 is used. A value of 0.0
     * means the score does not scale with an increase in term frequency.
     *
     * @param k1 the k1 value to set.
     * @return the BM25Similarity object itself.
     */
    public BM25Similarity setK1(Double k1) {
        this.k1 = k1;
        return this;
    }

    /**
     * Get the b property: This property controls how the length of a document affects the relevance score. By default,
     * a value of 0.75 is used. A value of 0.0 means no length normalization is applied, while a value of 1.0 means the
     * score is fully normalized by the length of the document.
     *
     * @return the b value.
     */
    public Double getB() {
        return this.b;
    }

    /**
     * Set the b property: This property controls how the length of a document affects the relevance score. By default,
     * a value of 0.75 is used. A value of 0.0 means no length normalization is applied, while a value of 1.0 means the
     * score is fully normalized by the length of the document.
     *
     * @param b the b value to set.
     * @return the BM25Similarity object itself.
     */
    public BM25Similarity setB(Double b) {
        this.b = b;
        return this;
    }
}
