package com.fadavidos.customer;

public record CustomerRequest(
    String firstName,
    String lastName,
    String email) {
}
