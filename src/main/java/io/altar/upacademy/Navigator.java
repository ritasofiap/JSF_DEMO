package io.altar.upacademy;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("navigator")
@RequestScoped
public class Navigator {
    private String name;
    private boolean disabled;

	<... Getters and Setters for “name” and “disabled” …>
}

