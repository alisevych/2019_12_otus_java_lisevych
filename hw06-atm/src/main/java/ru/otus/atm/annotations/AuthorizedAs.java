package ru.otus.atm.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

@Target(METHOD)
@Retention(SOURCE)
public @interface AuthorizedAs {

    AsType value();

    enum AsType {
        USER ("user"),
        SERVICE ("service");

        public String value;

        AsType(String value) {
            this.value = value;
        }

    }

}
