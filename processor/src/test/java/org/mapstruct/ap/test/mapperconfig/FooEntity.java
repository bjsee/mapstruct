/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.mapperconfig;

/**
 *
 * @author Sjaak Derksen
 */
public class FooEntity {

    private String createdBy;

    public FooEntity() {
    }

    public FooEntity( String createdBy ) {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

}
