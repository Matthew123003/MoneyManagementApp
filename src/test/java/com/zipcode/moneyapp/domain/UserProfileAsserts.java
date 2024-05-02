package com.zipcode.moneyapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class UserProfileAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertUserProfileAllPropertiesEquals(UserProfile expected, UserProfile actual) {
        assertUserProfileAutoGeneratedPropertiesEquals(expected, actual);
        assertUserProfileAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertUserProfileAllUpdatablePropertiesEquals(UserProfile expected, UserProfile actual) {
        assertUserProfileUpdatableFieldsEquals(expected, actual);
        assertUserProfileUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the derived primary key is set correctly.
     *
     * @param entityToPersist the entity used to persist
     * @param persisted the persisted entity
     */
    public static void assertUserProfileMapsIdRelationshipPersistedValue(UserProfile entityToPersist, UserProfile persisted) {
        // Validate the id for MapsId, the ids must be same
        assertThat(entityToPersist.getUser().getId()).isEqualTo(persisted.getId());
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertUserProfileAutoGeneratedPropertiesEquals(UserProfile expected, UserProfile actual) {
        assertThat(expected)
            .as("Verify UserProfile auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertUserProfileUpdatableFieldsEquals(UserProfile expected, UserProfile actual) {
        assertThat(expected)
            .as("Verify UserProfile relevant properties")
            .satisfies(e -> assertThat(e.getFirstName()).as("check firstName").isEqualTo(actual.getFirstName()))
            .satisfies(e -> assertThat(e.getLastName()).as("check lastName").isEqualTo(actual.getLastName()))
            .satisfies(e -> assertThat(e.getDateOfBirth()).as("check dateOfBirth").isEqualTo(actual.getDateOfBirth()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertUserProfileUpdatableRelationshipsEquals(UserProfile expected, UserProfile actual) {
        assertThat(expected)
            .as("Verify UserProfile relationships")
            .satisfies(e -> assertThat(e.getAddress()).as("check address").isEqualTo(actual.getAddress()));
    }
}
