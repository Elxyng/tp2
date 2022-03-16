package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Person's remark in the address book.
 * Guarantees: immutable; is always valid
 */
public class DateJoined {
    public final String value;

    /**
     * Constructs an {@code dateJoined}.
     *
     * @param dateJoined
     */
    public DateJoined(String dateJoined) {
        requireNonNull(dateJoined);
        value = dateJoined;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof DateJoined // instanceof handles nulls
                && value.equals(((DateJoined) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}